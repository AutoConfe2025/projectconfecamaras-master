package com.co.confecamaras.utils.sikulli;

import com.co.confecamaras.models.Element;
import com.co.confecamaras.utils.RepairTracker;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SafeActions {

    /* =========================================================
       ============ CONFIGURACIÓN GLOBAL ========================
       ========================================================= */

    private static final Logger LOGGER = LoggerFactory.getLogger(SafeActions.class);
    private static final int DOM_TIMEOUT_SECONDS = 20;
    private static final int SIKULI_TIMEOUT_SECONDS = 5;

    private static boolean isCI() {
        return "true".equalsIgnoreCase(System.getenv("CI"))
            || "false".equalsIgnoreCase(System.getenv("HEALENIUM_ENABLED"));
    }

    /* =========================================================
       ================== FACTORY METHODS =======================
       ========================================================= */

    public static Interaction enter(String value, Target target, Element element) {
        return instrumented(SafeEnter.class, value, target, element);
    }

    public static Interaction click(Target target, Element element) {
        return instrumented(SafeClick.class, target, element);
    }

    /* =========================================================
       ================= SAFE ENTER =============================
       ========================================================= */

    public static class SafeEnter implements Interaction {

        private final String value;
        private final Target target;
        private final Element element;

        public SafeEnter(String value, Target target, Element element) {
            this.value = value;
            this.target = target;
            this.element = element;
        }

        @Override
        @Step("{0} ingresa '#value' en #target usando DOM y fallback controlado")
        public <T extends Actor> void performAs(T actor) {

            try {
                LOGGER.info("⌨️ Intentando escribir '{}' en {}", value, target.getName());

                WaitUntil.the(target, isVisible())
                        .forNoMoreThan(DOM_TIMEOUT_SECONDS).seconds();

                WebElement webElement = target.resolveFor(actor);
                webElement.clear();
                webElement.sendKeys(value);

                LOGGER.info("✅ Entrada DOM exitosa");
                return;

            } catch (Exception domError) {
                LOGGER.warn("⚠️ DOM falló tras espera real: {}", domError.getMessage());
            }

            if (isCI()) {
                throw new RuntimeException("❌ Entrada fallida en CI. Sikuli deshabilitado.");
            }

            ejecutarSikuliEnter(value);
        }

        private void ejecutarSikuliEnter(String value) {
            try {
                String absolutePath = Paths.get(element.getImagePath()).toAbsolutePath().toString();
                LOGGER.info("🖥️ Sikuli ENTER con imagen {}", absolutePath);

                Screen screen = new Screen();
                Pattern pattern = new Pattern(absolutePath);

                screen.wait(pattern, SIKULI_TIMEOUT_SECONDS);
                screen.click(pattern);
                screen.type(value);

                marcarReparacion("Sikuli", "Ingreso visual por falla persistente del DOM");

            } catch (Exception e) {
                throw new RuntimeException("❌ Fallo definitivo en Sikuli ENTER", e);
            }
        }
    }

    /* =========================================================
       ================= SAFE CLICK =============================
       ========================================================= */

    public static class SafeClick implements Interaction {

        private final Target target;
        private final Element element;

        public SafeClick(Target target, Element element) {
            this.target = target;
            this.element = element;
        }

        @Override
        @Step("{0} hace clic en #target usando DOM y fallback controlado")
        public <T extends Actor> void performAs(T actor) {

            try {
                LOGGER.info("🖱️ Intentando click DOM en {}", target.getName());

                WaitUntil.the(target, isClickable())
                        .forNoMoreThan(DOM_TIMEOUT_SECONDS).seconds();

                target.resolveFor(actor).click();

                LOGGER.info("✅ Click DOM exitoso");
                return;

            } catch (Exception domError) {
                LOGGER.warn("⚠️ DOM no respondió tras espera real: {}", domError.getMessage());
            }

            if (isCI()) {
                throw new RuntimeException("❌ Click fallido en CI. Sikuli deshabilitado.");
            }

            ejecutarSikuliClick();
        }

        private void ejecutarSikuliClick() {
            try {
                String absolutePath = Paths.get(element.getImagePath()).toAbsolutePath().toString();
                LOGGER.info("🖱️ Sikuli CLICK con imagen {}", absolutePath);

                Screen screen = new Screen();
                Pattern pattern = new Pattern(absolutePath);

                screen.wait(pattern, SIKULI_TIMEOUT_SECONDS);
                screen.click(pattern);

                marcarReparacion("Sikuli", "Click visual por falla persistente del DOM");

            } catch (Exception e) {
                throw new RuntimeException("❌ Fallo definitivo en Sikuli CLICK", e);
            }
        }
    }

    /* =========================================================
       ================== REPORTING =============================
       ========================================================= */

    private static void marcarReparacion(String tool, String reason) {
        Serenity.recordReportData()
                .withTitle("🔧 Reparación automática detectada")
                .andContents(
                        "🧩 Caso comprometido<br>" +
                        "<b>Herramienta:</b> " + tool + "<br>" +
                        "<b>Motivo:</b> " + reason
                );

        RepairTracker.markRepaired(tool, reason);
    }
}
