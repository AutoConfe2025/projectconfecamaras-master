package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Alert;

import static com.co.confecamaras.userinterfaces.EstudioInscripcionDocumentosEsadlUI.*;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AcceptAlertTwo implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        toAlert(actor);
    }

    public void toAlert(Actor actor){
        BTN_ASOCIAR_CODIGO_BARRAS_EASDL.resolveFor(actor).click();

        Alert alert = getDriver().switchTo().alert();
        alert.accept();

        BTN_INSCRIBIR_ACTOS_EASDL.resolveFor(actor).click();

        Alert alert1 = getDriver().switchTo().alert();
        alert1.accept();

        BTN_TERMINAR_INSCRIPCION_EASDL.resolveFor(actor).click();

        Alert alert2 = getDriver().switchTo().alert();
        alert2.accept();

        getDriver().switchTo().parentFrame();
        BTN_REGRESAR_BANDEJA_EASDL.resolveFor(actor).click();
        BTN_FINALIZAR_ESTUDIO_EASDL.resolveFor(actor).click();

        Alert alert3 = getDriver().switchTo().alert();
        alert3.accept();
    }

    public static AcceptAlertTwo enConfecamaraSII(){
        return new AcceptAlertTwo();
    }
}