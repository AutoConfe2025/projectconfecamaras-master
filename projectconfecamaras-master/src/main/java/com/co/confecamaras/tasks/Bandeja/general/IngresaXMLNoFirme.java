package com.co.confecamaras.tasks.Bandeja.general;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.solicitud_nits.page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresaXMLNoFirme implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(VALIDAR_XML_NO_FIRME, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(VALIDAR_XML_NO_FIRME)
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static IngresaXMLNoFirme NoFirmeXML(){
        return new IngresaXMLNoFirme();
    }
}
