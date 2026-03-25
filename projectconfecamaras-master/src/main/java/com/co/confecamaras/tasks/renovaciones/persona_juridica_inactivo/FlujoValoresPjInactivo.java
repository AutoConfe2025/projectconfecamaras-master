package com.co.confecamaras.tasks.renovaciones.persona_juridica_inactivo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_CONTINUAR_RENOVACION_1;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoValoresPjInactivo implements Task {
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
                Click.on(BOTON_ACEPTAR_MENSAJE_IMPORTANTE)
        );

        String valorCapturado = Attribute.of(CAMPO_NUEVO_VALOR_PERSONA)
                .named("value")
                .answeredBy(actor);

        actor.remember("valorNuevo", valorCapturado);

        actor.attemptsTo(
                WaitUntil.the(CAMPO_NUEVO_VALOR_PERSONA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUEVO_VALOR_PERSONA),
                Enter.theValue(valorCapturado).into(CAMPO_NUEVO_VALOR_PERSONA),
                Click.on(CAMPO_NUEVO_VALOR_PERSONA_2),
                Enter.theValue(valorCapturado).into(CAMPO_NUEVO_VALOR_PERSONA_2),
                Click.on(CAMPO_NUEVO_VALOR_PERSONA_3),
                Enter.theValue(valorCapturado).into(CAMPO_NUEVO_VALOR_PERSONA_3),
                Click.on(CAMPO_NUEVO_VALOR_PERSONA_4),
                Enter.theValue(valorCapturado).into(CAMPO_NUEVO_VALOR_PERSONA_4),
                Click.on(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS_2),
                Enter.theValue(valorCapturado).into(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS_2),
                Click.on(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS_3),
                Enter.theValue(valorCapturado).into(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS_3),
                Click.on(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_INACTIVA_3),
                Enter.theValue(valorCapturado).into(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_INACTIVA_3),
                Click.on(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_INACTIVA_4),
                Enter.theValue(valorCapturado).into(CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_INACTIVA_4),
                Scroll.to(BOTON_CONTINUAR_RENOVACION_1),
                Click.on(BOTON_CONTINUAR_RENOVACION_1)
        );
    }

    public static FlujoValoresPjInactivo flujoValorInactiva(){
        return instrumented(FlujoValoresPjInactivo.class);
    }
}
