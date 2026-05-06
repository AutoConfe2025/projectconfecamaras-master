package com.co.confecamaras.tasks.renovaciones.renovacion_age_propietario_foraneo;

import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoValoresForaneo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        String matricula = actor.recall("matriculaPnEstablecimiento");
        System.out.println("Matrícula usada en flujo: " + matricula);

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
                WaitInterrupted3Segundos.esperaConstante3()

        );

        String mensajeErrorFinal = TextContent.of(MENSAJE_RENOVACION_PROPIETARIO_FORANEO).answeredBy(actor);

        System.out.println("mensaje de error encontrado" + mensajeErrorFinal);

    }

    public static FlujoValoresForaneo FlujoForaneo(){
        return instrumented(FlujoValoresForaneo.class);
    }
}
