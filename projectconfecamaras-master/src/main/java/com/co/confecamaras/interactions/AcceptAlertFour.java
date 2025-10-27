package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Alert;

import static com.co.confecamaras.userinterfaces.TransaccionesRuesUI.*;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AcceptAlertFour implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        toAlert(actor);
    }

    public void toAlert(Actor actor) {

        BTN_PAGAR_RUES.resolveFor(actor).click();

        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public static AcceptAlertFour enConfecamaraSII() {
        return new AcceptAlertFour();
    }
}