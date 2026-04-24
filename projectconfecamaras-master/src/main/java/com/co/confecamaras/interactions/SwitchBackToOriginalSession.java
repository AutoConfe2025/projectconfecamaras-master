package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class SwitchBackToOriginalSession implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver oldDriver = actor.recall("OLD_DRIVER");

        if (oldDriver == null) {
            throw new RuntimeException("No existe driver original");
        }

        actor.can(BrowseTheWeb.with(oldDriver));
    }

    public static SwitchBackToOriginalSession now() {
        return new SwitchBackToOriginalSession();
    }
}