package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.interactions.ValidarYcerrarXML;
import com.co.confecamaras.tasks.utils.LeerXml;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.solicitud_nits.page.VALIDAR_XML;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarVerXML implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(VALIDAR_XML, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(VALIDAR_XML)
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static IngresarVerXML ValidaXML(){
        return new IngresarVerXML();
    }
}
