package com.co.confecamaras.tasks.revision_sipref_inscripciones;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.revision_sipref_inscripciones.Page.*;

@AllArgsConstructor
public class IngresaFecha implements Task {

    private final String fecha;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_FECHA),
                Enter.theValue(fecha).into(CAMPO_FECHA)
        );
    }

    public static IngresaFecha ingresarFecha(String fecha){
        return new IngresaFecha(fecha);
    }
}
