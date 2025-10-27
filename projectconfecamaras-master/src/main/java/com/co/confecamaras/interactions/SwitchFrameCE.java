package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;

public class SwitchFrameCE implements Interaction {

    public static SwitchFrameCE doFrame() {
        return new SwitchFrameCE();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        frameSwitch();
    }

    public void frameSwitch(){
        try {
            WebElement frame = getWebdriverManager().getCurrentDriver().findElement(By.id("GB_frame"));
            WebElement frameDos = getWebdriverManager().getCurrentDriver().findElement(By.name("GB_frame"));
            System.out.println(frame+"AQUI FRAME 1");
            getWebdriverManager().getCurrentDriver().switchTo().frame(frameDos);
            System.out.println(frameDos+"AQUI FRAME DOS INGRESO");
            getWebdriverManager().getCurrentDriver().switchTo().frame(frame);
            System.out.println("FRAME EXITOSO");
        } catch (Exception e){
            System.out.println(e+"ERROR AL FRAME");
        }

    }
}
