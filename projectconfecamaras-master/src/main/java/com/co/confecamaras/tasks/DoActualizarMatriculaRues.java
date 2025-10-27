package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.userinterfaces.Actualizar;

import com.co.confecamaras.userinterfaces.RenovacionPersona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoActualizarMatriculaRues implements Task {

    private final String consulta;
    private final String num;

    public DoActualizarMatriculaRues(String consulta, String num) {
        this.consulta = consulta;
        this.num = num;
    }

    public static Performable actualizarMatriculaRues(String consulta, String num){
        return instrumented(DoActualizarMatriculaRues.class, consulta, num);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(RenovacionPersona.CONSULTA_SLC),
                SelectFromOptions.byVisibleText(consulta).from(RenovacionPersona.CONSULTA_SLC),
                Enter.theValue(num).into(RenovacionPersona.INFO_INPUT),
                Click.on(RenovacionPersona.CONTINUAR_BTN),
                WaitConstant.esperaConstante(),
                WaitUntil.the(RenovacionPersona.ACCIONES_BTN, WebElementStateMatchers.isClickable()),
                JavaScriptClick.on(RenovacionPersona.ACCIONES_BTN),
                WaitUntil.the(Actualizar.DIGITACION_BTN, WebElementStateMatchers.isClickable()),
                JavaScriptClick.on(Actualizar.DIGITACION_BTN),
                WaitUntil.the(Actualizar.ENVIO_MATRICULAS_BTN, WebElementStateMatchers.isClickable()),
                JavaScriptClick.on(Actualizar.ENVIO_MATRICULAS_BTN),
                Switch.toNewWindow(),
                WaitUntil.the(Actualizar.ACTUALIZAR_RUES_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(Actualizar.ACTUALIZAR_RUES_BTN),
                WaitConstant.esperaConstante()
        );
    }
}