package com.co.confecamaras.utils.sikulli;

import com.co.confecamaras.models.Element;
import com.co.confecamaras.utils.RepairTracker;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SafeActions {

    public static Interaction enter(String value, Target target, Element element) {
        return instrumented(SafeEnter.class, value, target, element);
    }

    public static Interaction click(Target target, Element element) {
        return instrumented(SafeClick.class, target, element);
    }

    public static class SafeEnter implements Interaction {

        private static final Logger LOGGER = LoggerFactory.getLogger(SafeEnter.class);
        private final String value;
        private final Target target;
        private final Element element;

        public SafeEnter(String value, Target target, Element element) {
            this.value = value;
            this.target = target;
            this.element = element;
        }

        @Override
        @Step("{0} intenta ingresar '#value' en #target usando Healenium o Sikuli si es necesario")
        public <T extends Actor> void performAs(T actor) {
            boolean success = false;
            boolean repairedWithHealenium = false;
            boolean repairedWithSikuli = false;

            try {
                try {
                    LOGGER.info("➡️ Intentando escribir '{}' en el elemento {}", value, target.getName());
                    WebElement webElement = target.resolveFor(actor);
                    webElement.clear();
                    webElement.sendKeys(value);
                    LOGGER.info("✅ Entrada por DOM exitosa (posible reparación con Healenium).");
                    success = true;
                    repairedWithHealenium = true;
                } catch (Exception e) {
                    LOGGER.warn("⚠️ Falló el ingreso por DOM, se usará Sikuli. Error: {}", e.getMessage());
                }

                if (!success) {
                    try {
                        String absolutePath = Paths.get(element.getImagePath()).toAbsolutePath().toString();
                        LOGGER.info("🖥️ Usando SikuliX con la imagen: {}", absolutePath);

                        Screen screen = new Screen();
                        Pattern imagePattern = new Pattern(absolutePath);

                        screen.wait(imagePattern, 5);
                        screen.click(imagePattern);
                        screen.type(value);

                        LOGGER.info("✅ Entrada con SikuliX exitosa.");
                        success = true;
                        repairedWithSikuli = true;
                    } catch (Exception sikuliError) {
                        LOGGER.error("❌ Fallo también con SikuliX: {}", sikuliError.getMessage(), sikuliError);
                    }
                }

                if (repairedWithHealenium) {
                    markAsCompromised("Healenium", "Elemento reparado automáticamente durante ingreso.");
                } else if (repairedWithSikuli) {
                    markAsCompromised("Sikuli", "Entrada realizada con imagen debido a falla del DOM.");
                }

                if (!success) {
                    throw new RuntimeException("❌ No se pudo ingresar el valor '" + value + "' ni con DOM ni con SikuliX.");
                }

            } catch (Exception finalError) {
                LOGGER.error("‼️ Error final en SafeEnter: {}", finalError.getMessage(), finalError);
                throw finalError;
            }
        }
    }

    public static class SafeClick implements Interaction {

        private static final Logger LOGGER = LoggerFactory.getLogger(SafeClick.class);
        private final Target target;
        private final Element element;

        public SafeClick(Target target, Element element) {
            this.target = target;
            this.element = element;
        }

        @Override
        @Step("{0} intenta hacer clic en #target usando Healenium o Sikuli si es necesario")
        public <T extends Actor> void performAs(T actor) {
            boolean success = false;
            boolean repairedWithHealenium = false;
            boolean repairedWithSikuli = false;

            try {
                try {
                    LOGGER.info("➡️ Intentando hacer clic en el elemento {}", target.getName());
                    WebElement webElement = target.resolveFor(actor);
                    webElement.click();
                    LOGGER.info("✅ Click por DOM exitoso (posible reparación con Healenium).");
                    success = true;
                    repairedWithHealenium = true;
                } catch (Exception e) {
                    LOGGER.warn("⚠️ Falló el click por DOM, se usará Sikuli. Error: {}", e.getMessage());
                }

                if (!success) {
                    try {
                        String absolutePath = Paths.get(element.getImagePath()).toAbsolutePath().toString();
                        LOGGER.info("🖱️ Usando SikuliX para hacer clic en la imagen: {}", absolutePath);

                        Screen screen = new Screen();
                        Pattern imagePattern = new Pattern(absolutePath);

                        screen.wait(imagePattern, 5);
                        screen.click(imagePattern);

                        LOGGER.info("✅ Click con SikuliX exitoso.");
                        success = true;
                        repairedWithSikuli = true;
                    } catch (Exception sikuliError) {
                        LOGGER.error("❌ Fallo también con SikuliX: {}", sikuliError.getMessage(), sikuliError);
                    }
                }

                if (repairedWithHealenium) {
                    markAsCompromised("Healenium", "Elemento reparado automáticamente durante clic.");
                } else if (repairedWithSikuli) {
                    markAsCompromised("Sikuli", "Click realizado con imagen debido a falla del DOM.");
                }

                if (!success) {
                    throw new RuntimeException("❌ No se pudo hacer clic ni con DOM ni con SikuliX.");
                }

            } catch (Exception finalError) {
                LOGGER.error("‼️ Error final en SafeClick: {}", finalError.getMessage(), finalError);
                throw finalError;
            }
        }
    }

    private static void markAsCompromised(String tool, String reason) {
        String message = String.format(
                "🧩 Caso comprometido — Reparado automáticamente con <b>%s</b><br>📋 Motivo: %s",
                tool, reason
        );

        Serenity.recordReportData()
                .withTitle("🔧 Reparación automática detectada")
                .andContents(message);

        try {
            String reportPath = Paths.get("target", "site", "serenity", "index.html")
                    .toAbsolutePath()
                    .normalize()
                    .toString();

            String reportUrl = "file:///" + reportPath.replace("\\", "/");
            String reportLink = String.format(
                    "<a href='%s' target='_blank'>📊 Ver reporte Serenity</a>",
                    reportUrl
            );

            Serenity.recordReportData()
                    .withTitle("📎 Enlace al reporte Serenity")
                    .andContents(reportLink);

        } catch (Exception e) {
            LoggerFactory.getLogger(SafeActions.class)
                    .warn("⚠️ No se pudo generar el link al reporte Serenity: {}", e.getMessage());
        }

        if (tool.equalsIgnoreCase("Healenium")) {
            RepairTracker.markHealenium();
        } else if (tool.equalsIgnoreCase("Sikuli")) {
            RepairTracker.markSikuli();
        }
    }
}
