package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoFirmaSobreCanvas implements Interaction {

    private final String locator;

    public DoFirmaSobreCanvas(String locator) {
        this.locator = locator;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // 🔹 Usamos el navegador externo abierto SOLO para leer QR
        var driver = ReadQrCode.externalDriver;

        // 🔹 Buscamos el canvas por el localizador que pasas como parámetro
        WebElement canvas = driver.findElement(org.openqa.selenium.By.xpath(locator));

        int width = canvas.getSize().getWidth();
        int height = canvas.getSize().getHeight();

        int centerX = width / 2;
        int centerY = height / 2;

        Actions actions = new Actions(driver);

        // ===============================
        // ✍️ FIRMA PRINCIPAL
        // ===============================
        actions.moveToElement(canvas, centerX - 80, centerY)
                .clickAndHold()
                .moveByOffset(40, 20)
                .moveByOffset(40, -25)
                .moveByOffset(40, 30)
                .moveByOffset(40, -15)
                .moveByOffset(30, 10)
                .release()
                .pause(300)
                .perform();

        // ===============================
        // ✏️ Letra Q
        // ===============================
        actions.moveToElement(canvas, centerX + 20, centerY - 40)
                .clickAndHold()
                .moveByOffset(40, 0)
                .moveByOffset(0, 40)
                .moveByOffset(-40, 0)
                .moveByOffset(0, -40)
                .release()
                .pause(200)
                .perform();

        actions.moveToElement(canvas, centerX + 35, centerY)
                .clickAndHold()
                .moveByOffset(15, 15)
                .release()
                .pause(200)
                .perform();

        // ===============================
        // ✏️ Letra A
        // ===============================
        actions.moveToElement(canvas, centerX + 80, centerY + 20)
                .clickAndHold()
                .moveByOffset(20, -60)
                .moveByOffset(20, 60)
                .release()
                .pause(200)
                .perform();

        actions.moveToElement(canvas, centerX + 88, centerY - 10)
                .clickAndHold()
                .moveByOffset(25, 0)
                .release()
                .pause(300)
                .perform();

        // ===============================
        // 👉 TAB + ENTER para continuar
        // ===============================
        actions.sendKeys(Keys.TAB).pause(200).perform();
        actions.sendKeys(Keys.TAB).pause(200).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }

    public static DoFirmaSobreCanvas enElCanvas(String locator) {
        return instrumented(DoFirmaSobreCanvas.class, locator);
    }
}
