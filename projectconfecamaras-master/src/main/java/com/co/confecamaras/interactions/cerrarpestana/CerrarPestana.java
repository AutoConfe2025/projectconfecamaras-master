package com.co.confecamaras.interactions.cerrarpestana;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CerrarPestana implements Interaction {


    public static CerrarPestana cerrar() {
        return new CerrarPestana();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String originalWindow = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        BrowseTheWeb.as(actor).getDriver().close();

        for (String windowHandle : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(windowHandle);
            break;
        }
    }
}
