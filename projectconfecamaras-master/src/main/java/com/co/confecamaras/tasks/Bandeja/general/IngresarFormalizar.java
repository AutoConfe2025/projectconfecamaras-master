package com.co.confecamaras.tasks.Bandeja.general;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.MENSAJE_FINALIZACION_ESTUDIO;
import static com.co.confecamaras.userinterfaces.Bandejas.solicitud_nits.page.BOTON_FORMALIZAR;
import static com.co.confecamaras.utils.bandejaponal.BandejaPonalConstans.MENSAJE_INFORMATIVO_1;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

public class IngresarFormalizar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_FORMALIZAR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_FORMALIZAR)
        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public static IngresarFormalizar ValidarFormalizar() {
        return new IngresarFormalizar();
    }

}
