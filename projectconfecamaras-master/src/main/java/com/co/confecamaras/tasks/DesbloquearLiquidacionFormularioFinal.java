package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.userinterfaces.ExpedientesUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.DesbloquearLiquidacionUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DesbloquearLiquidacionFormularioFinal implements Task {

    private String idNumeroRecuperacion;

    public DesbloquearLiquidacionFormularioFinal(String idNumeroRecuperacion) {
        this.idNumeroRecuperacion = idNumeroRecuperacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_PROCESOS_ESPECIALES),
                Scroll.to(BTN_REGISTROS_PUBLICOS_PROCESOS_ESPECIALES).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_PROCESOS_ESPECIALES),
                WaitInteractions.untilAppears(BTN_DESBLOQUEAR_LIQUIDACION_FORMULARIO_FINAL),
                Scroll.to(BTN_DESBLOQUEAR_LIQUIDACION_FORMULARIO_FINAL).andAlignToBottom(),
                JavaScriptClick.on(BTN_DESBLOQUEAR_LIQUIDACION_FORMULARIO_FINAL),
                WaitInteractions.untilAppears(TXT_NUMERO_RECUPERACION_DESBLOQUEAR_LIQUIDACION),
                Enter.theValue(idNumeroRecuperacion).into(TXT_NUMERO_RECUPERACION_DESBLOQUEAR_LIQUIDACION),
                Click.on(ExpedientesUI.BTN_CONTINUAR_EXPEDIENTES),
                JavaScriptClick.on(BTN_CONTINUAR_DOS_DESBLOQUEAR_LIQUIDACION)
        );
    }

    public static DesbloquearLiquidacionFormularioFinal enConfecamaraSII(String idNumeroRecuperacion) {
        return instrumented(DesbloquearLiquidacionFormularioFinal.class, idNumeroRecuperacion);
    }
}