package com.co.confecamaras.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.*;

public class DigitalSignature implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = Serenity.getDriver();

        // Localizar el canvas
        WebElement canvas = driver.findElement(By.xpath("//canvas[@data-testid='canvas-element']"));

        // Esperar que esté visible
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", canvas);

        Actions draw = new Actions(driver);

        // Obtener tamaño del canvas
        int width = canvas.getSize().getWidth();
        int height = canvas.getSize().getHeight();

        // Empezar en el centro
        int startX = width / 2;
        int startY = height / 2;

        // Mover al canvas y presionar click
        draw.moveToElement(canvas, startX, startY)
                .clickAndHold();

        // Dibujar una firma zig-zag
        draw.moveByOffset(20, 10)
                .moveByOffset(20, -10)
                .moveByOffset(20, 10)
                .moveByOffset(-20, 10)
                .moveByOffset(-20, -10);

        // Soltar click
        draw.release().perform();

        // Pausa opcional para visualizar
        try { Thread.sleep(800); } catch (InterruptedException e) {}


    }

    public static Interaction signOnCanvas() {
        return new DigitalSignature();
    }
}

