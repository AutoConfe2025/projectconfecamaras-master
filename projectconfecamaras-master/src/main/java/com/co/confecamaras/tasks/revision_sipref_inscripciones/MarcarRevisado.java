package com.co.confecamaras.tasks.revision_sipref_inscripciones;

import com.co.confecamaras.interactions.AceptAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.revision_sipref_inscripciones.Page.*;
import static com.co.confecamaras.utils.revision_sipref_inscripciones.Constant.REVISION;

public class MarcarRevisado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MARCAR_COMO_REVISADO),
                Scroll.to(CAMPO_OBSERVACIONES_MARCAR),
                Enter.theValue(REVISION).into(CAMPO_OBSERVACIONES_MARCAR),
                Click.on(BOTON_EMAILS),
                AceptAlert.aceptar()
        );
    }

    public static MarcarRevisado MarcaRevisado(){
        return new MarcarRevisado();
    }
}
