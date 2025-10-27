package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted10Segundos;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ReversionParcialUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReversionParcial implements Task {

    private final String idNumeroRecibo;
    private final String idValorDevolver;
    private final String idJustificacion;

    public ReversionParcial(String idNumeroRecibo, String idValorDevolver, String idJustificacion) {
        this.idNumeroRecibo = idNumeroRecibo;
        this.idValorDevolver = idValorDevolver;
        this.idJustificacion = idJustificacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitInteractions.untilDisappears(ESPERA),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_INTEGRACION_ERP_RUES_CFE),
                Scroll.to(BTN_INTEGRACION_ERP_RUES_CFE).andAlignToBottom(),
                JavaScriptClick.on(BTN_INTEGRACION_ERP_RUES_CFE),
                WaitInteractions.untilAppears(BTN_MANTENIMIENTO_INFORMES),
                Scroll.to(BTN_MANTENIMIENTO_INFORMES).andAlignToBottom(),
                JavaScriptClick.on(BTN_MANTENIMIENTO_INFORMES),
                WaitInteractions.untilAppears(BTN_REVERSION_PARCIAL),
                Scroll.to(BTN_REVERSION_PARCIAL),
                JavaScriptClick.on(BTN_REVERSION_PARCIAL),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(TXT_NUMERO_RECIBO_RP),
                Enter.theValue(idNumeroRecibo).into(TXT_NUMERO_RECIBO_RP),
                WaitInteractions.untilAppears(BTN_CONTINUAR_RP),
                Click.on(BTN_CONTINUAR_RP),
                WaitInteractions.untilAppears(TXT_VALOR_DEVOLVER_RP),
                Scroll.to(TXT_VALOR_DEVOLVER_RP).andAlignToBottom(),
                Enter.theValue(idValorDevolver).into(TXT_VALOR_DEVOLVER_RP),
                WaitInteractions.untilAppears(TXT_JUSTIFICACION_RP),
                Scroll.to(TXT_JUSTIFICACION_RP).andAlignToBottom(),
                Enter.theValue(idJustificacion).into(TXT_JUSTIFICACION_RP),
                WaitInteractions.untilAppears(BTN_CONTINUAR_RP),
                Scroll.to(BTN_CONTINUAR_RP).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_RP),
                WaitInteractions.untilAppears(BTN_GENERAR_NOTA_REVERSION_RP),
                Scroll.to(BTN_GENERAR_NOTA_REVERSION_RP).andAlignToBottom(),
                Click.on(BTN_GENERAR_NOTA_REVERSION_RP),
                WaitInteractions.untilAppears(BTN_REVERSAR_PARCIALMENTE_RP),
                Click.on(BTN_REVERSAR_PARCIALMENTE_RP),
                WaitInteractions.untilAppears(LBL_REVERSION_RP),
                Ensure.that(LBL_REVERSION_RP).isDisplayed(),
                Switch.toTheOtherWindow(),
                RobotCerrarPestanas.toTab()
        );
    }

    public static ReversionParcial enConfecamaraSII(String idNumeroRecibo, String idValorDevolver, String idJustificacion){
        return instrumented(ReversionParcial.class, idNumeroRecibo, idValorDevolver, idJustificacion);
    }
}