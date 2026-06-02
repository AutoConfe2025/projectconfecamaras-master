package com.co.confecamaras.tasks.renovaciones.actualizacion_proponentes;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoActualizarProponentePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoParaActualizacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String matricula = actor.recall("matriculaPnEstablecimiento");

        actor.attemptsTo(
                WaitUntil.the(BOTON_PROPONENTE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_PROPONENTE),
                Click.on(CAMPO_INGRESO_DATO_BUSQUEDA_PROPONENTE),
                Enter.theValue(matricula).into(CAMPO_INGRESO_DATO_BUSQUEDA_PROPONENTE),
                Click.on(BOTON_CONSULTAR_PROPONENTE),
                WaitUntil.the(BOTON_ACCIONES_PROPONENTE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_ACCIONES_PROPONENTE),
                WaitUntil.the(BOTON_TRAMITES_REGISTRO_PROPONENTE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_TRAMITES_REGISTRO_PROPONENTE),
                WaitUntil.the(BOTON_ACTUALIZAR_REGISTRO_PROPONENTE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_ACTUALIZAR_REGISTRO_PROPONENTE),
                WaitUntil.the(BOTON_CONSULTAR_REGISTRO_PROPONENTE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CONSULTAR_REGISTRO_PROPONENTE),
                WaitUntil.the(BOTON_ACCIONES_REGISTRO_PROPONENTE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_ACCIONES_REGISTRO_PROPONENTE),
                WaitUntil.the(BOTON_FORMULARIO_REGISTRO_PROPONENTE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_FORMULARIO_REGISTRO_PROPONENTE)
        );
    }

    public static FlujoParaActualizacion FlujoActualizacion() {
        return instrumented(FlujoParaActualizacion.class);
    }
}
