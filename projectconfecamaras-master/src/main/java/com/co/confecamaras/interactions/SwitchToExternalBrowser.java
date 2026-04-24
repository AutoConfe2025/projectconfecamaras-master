package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SwitchToExternalBrowser implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (ReadQrCode.externalDriver == null) {
            throw new RuntimeException("El driver externo no ha sido inicializado");
        }

        actor.can(BrowseTheWeb.with(ReadQrCode.externalDriver));
    }

    public static SwitchToExternalBrowser now() {
        return new SwitchToExternalBrowser();
    }
}