package com.co.confecamaras.interactions.cambiarpestana;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CambiarALaSiguientePestana implements Interaction {

    public static CambiarALaSiguientePestana siguiente() {
        return new CambiarALaSiguientePestana();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String originalWindow = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        boolean foundNewWindow = false;

        for (String windowHandle : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                BrowseTheWeb.as(actor).getDriver().switchTo().window(windowHandle);
                foundNewWindow = true;
                break;
            }
        }
        if (!foundNewWindow) {
            throw new RuntimeException("No se encontró una nueva pestaña para cambiar.");
        }
    }

    }