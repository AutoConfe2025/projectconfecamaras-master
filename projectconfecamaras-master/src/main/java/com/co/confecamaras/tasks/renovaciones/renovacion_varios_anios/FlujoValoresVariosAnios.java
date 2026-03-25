package com.co.confecamaras.tasks.renovaciones.renovacion_varios_anios;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoValoresVariosAnios implements Task {

    private final String valor;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String matricula = actor.recall("matriculaPnEstablecimiento");

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
                Click.on(CAMPO_NUEVO_VALOR_PERSONA_2),
                Enter.theValue(valor).into(CAMPO_NUEVO_VALOR_PERSONA_2),
                Click.on(CAMPO_NUEVO_VALOR_PERSONA_3),
                Enter.theValue(valor).into(CAMPO_NUEVO_VALOR_PERSONA_3)
        );

        if (CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS.isVisibleFor(actor)) {
            actor.attemptsTo(
                    Click.on(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS),
                    Enter.theValue(valor).into(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS),
                    Click.on(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS_2),
                    Enter.theValue(valor).into(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS_2),
                    Click.on(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS_3),
                    Enter.theValue(valor).into(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS_3)

                    );
        }

        actor.attemptsTo(
                Scroll.to(BOTON_CONTINUAR_RENOVACION_1),
                Click.on(BOTON_CONTINUAR_RENOVACION_1)
        );
    }

    public static FlujoValoresVariosAnios flujovaloresAnios(String valor) {
        return new FlujoValoresVariosAnios(valor);
    }
}
