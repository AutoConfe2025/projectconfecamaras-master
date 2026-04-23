package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebDriver;

public class CloseNewSession implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver newDriver = actor.recall("NEW_DRIVER");

        if (newDriver != null) {
            newDriver.quit();
        }
    }

    public static CloseNewSession now() {
        return new CloseNewSession();
    }
}