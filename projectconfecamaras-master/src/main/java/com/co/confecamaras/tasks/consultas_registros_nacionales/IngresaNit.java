package com.co.confecamaras.tasks.consultas_registros_nacionales;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.consultas_registros_nacionales.Page.*;

@AllArgsConstructor
public class IngresaNit implements Task {

    private final String nit;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_INGRESO_NIT),
                Enter.theValue(nit).into(CAMPO_INGRESO_NIT),
                Click.on(BOTON_CONSULTAR),
                Click.on(BOTON_ACCION),
                Click.on(BOTON_CERRAR),
                Click.on(BOTON_ACCION_2),
                Click.on(BOTON_CERRAR),
                Click.on(BOTON_ACCION_3)
        );
    }

    public static IngresaNit Nit(String nit){
        return new IngresaNit(nit);
    }
}
