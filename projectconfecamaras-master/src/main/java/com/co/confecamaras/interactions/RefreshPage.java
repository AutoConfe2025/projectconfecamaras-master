package com.co.confecamaras.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class RefreshPage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Serenity.getDriver().navigate().refresh();
    }

    public static RefreshPage ahora() {
        return new RefreshPage();
    }
}
