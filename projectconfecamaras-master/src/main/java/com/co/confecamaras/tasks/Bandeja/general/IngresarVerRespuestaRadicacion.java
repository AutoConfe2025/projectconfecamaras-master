package com.co.confecamaras.tasks.Bandeja.general;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.solicitud_nits.page.BOTON_VER_RESPUESTA_RADICACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarVerRespuestaRadicacion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_VER_RESPUESTA_RADICACION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_VER_RESPUESTA_RADICACION)
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static IngresarVerRespuestaRadicacion validaRadicacion(){
        return new IngresarVerRespuestaRadicacion();
    }
}
