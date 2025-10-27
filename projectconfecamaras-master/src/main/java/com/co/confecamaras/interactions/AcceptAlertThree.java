package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Alert;

import static com.co.confecamaras.userinterfaces.EstudioInscripcionDocumentosEsadlUI.BTN_APLICAR_EASDL;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AcceptAlertThree implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        toAlert(actor);
    }

    public void toAlert(Actor actor){
        BTN_APLICAR_EASDL.resolveFor(actor).click();

        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public static AcceptAlertThree enConfecamaraSII(){
        return new AcceptAlertThree();
    }
}