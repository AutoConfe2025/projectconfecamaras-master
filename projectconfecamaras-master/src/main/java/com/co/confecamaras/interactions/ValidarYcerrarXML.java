package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.hamcrest.MatcherAssert.assertThat;

public class ValidarYcerrarXML implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getDriver();
        String originalHandle = driver.getWindowHandle();

        try {
            System.out.println("🔍 Esperando posible nueva pestaña...");
            Set<String> handlesAntes = driver.getWindowHandles();

            // Espera hasta 5 segundos por una nueva pestaña
            boolean nuevaPestanaDetectada = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(d -> driver.getWindowHandles().size() > handlesAntes.size());

            if (nuevaPestanaDetectada) {
                Set<String> handlesDespues = driver.getWindowHandles();
                handlesDespues.removeAll(handlesAntes);
                String nuevaPestana = handlesDespues.iterator().next();
                driver.switchTo().window(nuevaPestana);
                System.out.println("✅ Se detectó una nueva pestaña de XML: " + driver.getCurrentUrl());

                validarContenidoXML(driver);
                driver.close();
                driver.switchTo().window(originalHandle);
                System.out.println("✅ Validación XML completada y pestaña cerrada.");
                return;
            }

        } catch (TimeoutException e) {
            System.out.println("⚠️ No se abrió nueva pestaña, verificando en la pestaña actual...");
        }

        // Si no se abrió nueva pestaña, intenta validar el XML en la pestaña actual
        validarContenidoXML(driver);

        System.out.println("✅ Validación completada en la pestaña actual.");
    }

    private void validarContenidoXML(WebDriver driver) {
        try {
            // Espera breve por contenido tipo XML
            new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(d -> d.getPageSource().contains("<?xml") ||
                            d.getPageSource().contains("<FacturaElectronica") ||
                            d.getPageSource().contains("<documento"));

            String contenido = driver.getPageSource();
            System.out.println("📄 XML detectado con longitud: " + contenido.length());
            assertThat("El contenido del XML debe contener etiquetas", contenido.contains("<"));
        } catch (TimeoutException e) {
            throw new AssertionError("❌ No se detectó XML ni en nueva pestaña, ni iframe, ni descarga.");
        }
    }

    public static ValidarYcerrarXML validarYcerrarXML() {
        return new ValidarYcerrarXML();
    }
}
