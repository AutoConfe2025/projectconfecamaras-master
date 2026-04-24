package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class CloseExternalBrowser implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (ReadQrCode.externalDriver != null) {
            ReadQrCode.externalDriver.quit();
            ReadQrCode.externalDriver = null;
        }

        if (ReadQrCode.service != null) {
            ReadQrCode.service.stop();
            ReadQrCode.service = null;
        }
    }

    public static CloseExternalBrowser now() {
        return new CloseExternalBrowser();
    }
}