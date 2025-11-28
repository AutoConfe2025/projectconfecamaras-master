package com.co.confecamaras.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class ActionBackPage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Serenity.getDriver().navigate().back();
    }

    public static ActionBackPage ahora() {
        return new ActionBackPage();
    }
}
