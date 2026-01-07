package com.co.confecamaras.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SwitchToFrame implements Interaction {

    private final By frameLocator;
    private final boolean waitForFrame;

    // Constructor privado
    private SwitchToFrame(By frameLocator, boolean waitForFrame){
        this.frameLocator = frameLocator;
        this.waitForFrame = waitForFrame;
    }

    @Override
    @Step("{0} switches to the frame")
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        if(waitForFrame){
            // Esperar hasta 10 segundos a que el iframe exista
            for (int i = 0; i < 20; i++) {
                try {
                    WebElement frame = driver.findElement(frameLocator);
                    if(frame.isDisplayed()) break;
                } catch (Exception e) {
                    // no encontrado aún
                }
                try { Thread.sleep(500); } catch (InterruptedException ignored) {}
            }
        }

        // Cambiar al frame
        WebElement frame = driver.findElement(frameLocator);
        driver.switchTo().frame(frame);
    }

    // ============================================================
    // MÉTODOS PÚBLICOS PARA USO EN SCREENPLAY
    // ============================================================

    /** Cambia al frame identificado por un locator */
    public static Interaction toFrame(By frameLocator){
        return Instrumented.instanceOf(SwitchToFrame.class)
                .withProperties(frameLocator, false);
    }

    /** Espera a que el frame aparezca y cambia a él */
    public static Interaction waitForFrameAndSwitch(By frameLocator){
        return Instrumented.instanceOf(SwitchToFrame.class)
                .withProperties(frameLocator, true);
    }

    /** Vuelve al frame principal (contenido por defecto) */
    public static Interaction toDefaultContent(){
        return new Interaction() {
            @Override
            @Step("{0} switches back to default content")
            public <T extends Actor> void performAs(T actor) {
                BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent();
            }
        };
    }
}
