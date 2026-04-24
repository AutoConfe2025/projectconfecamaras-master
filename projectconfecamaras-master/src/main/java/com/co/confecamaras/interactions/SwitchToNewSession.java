package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebDriver;

public class SwitchToNewSession implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver newDriver = actor.recall("NEW_SESSION_DRIVER");

        if (newDriver == null) {
            throw new RuntimeException("No existe una nueva sesión guardada");
        }

        // Reemplaza el driver actual del actor
        actor.can(net.serenitybdd.screenplay.abilities.BrowseTheWeb.with(newDriver));

        actor.remember("NEW_DRIVER", newDriver);
    }

    public static SwitchToNewSession now() {
        return new SwitchToNewSession();
    }
}