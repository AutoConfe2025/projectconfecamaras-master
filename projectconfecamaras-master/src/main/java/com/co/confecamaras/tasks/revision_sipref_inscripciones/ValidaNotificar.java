package com.co.confecamaras.tasks.revision_sipref_inscripciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.revision_sipref_inscripciones.Page.*;

public class ValidaNotificar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NOTIFICAR),
                Scroll.to(BOTON_EMAILS),
                Click.on(BOTON_EMAILS),
                Scroll.to(BOTON_EMAILS),
                Click.on(BOTON_EMAILS),
                Scroll.to(BOTON_REGRESAR),
                Click.on(BOTON_REGRESAR)
        );
    }
    public static ValidaNotificar notificarButton(){
        return new ValidaNotificar();
    }
}
