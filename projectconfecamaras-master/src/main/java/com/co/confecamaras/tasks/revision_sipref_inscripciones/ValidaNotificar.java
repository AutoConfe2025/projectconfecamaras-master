package com.co.confecamaras.tasks.revision_sipref_inscripciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.revision_sipref_inscripciones.Page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaNotificar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NOTIFICAR),
                WaitUntil.the(BOTON_EMAILS,isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_EMAILS),
                Click.on(BOTON_EMAILS),
                WaitUntil.the(BOTON_CEULAR,isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_CEULAR),
                Click.on(BOTON_CEULAR),
                Scroll.to(BOTON_REGRESAR),
                Click.on(BOTON_REGRESAR)
        );
    }
    public static ValidaNotificar notificarButton(){
        return new ValidaNotificar();
    }
}
