package com.co.confecamaras.tasks.renovaciones.renovacion_1780_no_cumple;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_ACEPTAR_MENSAJE_IMPORTANTE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoValoresNoCumple implements Task {

    private final String valor;
    @Override
    public <T extends Actor> void performAs(T actor) {
        String matricula = actor.recall("matriculaPnEstablecimiento");

        System.out.println("matricula");

        actor.attemptsTo(
                WaitUntil.the(BOTON_MATRICULA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MATRICULA),
                Click.on(CAMPO_INGRESO_DATO_BUSQUEDA),
                Enter.theValue(matricula).into(CAMPO_INGRESO_DATO_BUSQUEDA),
                Click.on(BOTON_CONSULTAR_DATO_BUSQUEDA),
                WaitUntil.the(BOTON_MATRICULA_SELECCION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MATRICULA_SELECCION),
                WaitUntil.the(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL),
                WaitUntil.the(BOTON_RENOVAR_MATRICULA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_RENOVAR_MATRICULA),
                WaitUntil.the(BOTON_CONTINUAR_RENOVACION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONTINUAR_RENOVACION),
                WaitUntil.the(BOTON_ACEPTAR_MENSAJE_IMPORTANTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ACEPTAR_MENSAJE_IMPORTANTE),
                WaitUntil.the(CAMPO_NUEVO_VALOR_PERSONA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUEVO_VALOR_PERSONA),
                Enter.theValue(valor).into(CAMPO_NUEVO_VALOR_PERSONA),
                Click.on(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO),
                Enter.theValue(valor).into(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO),
                Click.on(BOTON_CUMPLE_REQUISITOS_LEY_1780),
                Click.on(BOTON_MANTIENE_REQUISITOS_LEY_1780),
                Scroll.to(BOTON_CONTINUAR_RENOVACION_1),
                Click.on(BOTON_CONTINUAR_RENOVACION_1)
        );

        actor.remember("valorNoCumple",valor);
    }

    public static FlujoValoresNoCumple NocCumpleValores(String valor){
        return instrumented(FlujoValoresNoCumple.class, valor);
    }
}
