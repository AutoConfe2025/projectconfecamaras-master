package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ConsultaLiquidacionesUI.*;
import static com.co.confecamaras.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class ConsultaLiquidaciones implements Task {

    private String idIdentificacionUno;
    private String idNombre;
    private String idExpediente;
    private String idRecibo;
    private String idFechaInicial;
    private String idFechaFinal;
    private String idLiquidacion;

    public ConsultaLiquidaciones(String idIdentificacionUno, String idNombre, String idExpediente, String idRecibo,
                                 String idFechaInicial, String idFechaFinal, String idLiquidacion) {
        this.idIdentificacionUno = idIdentificacionUno;
        this.idNombre = idNombre;
        this.idExpediente = idExpediente;
        this.idRecibo = idRecibo;
        this.idFechaInicial = idFechaInicial;
        this.idFechaFinal = idFechaFinal;
        this.idLiquidacion = idLiquidacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_CONSULTAS_INTERNAS),
                Scroll.to(BTN_REGISTROS_PUBLICOS_CONSULTAS_INTERNAS).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_CONSULTAS_INTERNAS),
                WaitInteractions.untilAppears(BTN_CONSULTAS_LIQUIDACIONES),
                Scroll.to(BTN_CONSULTAS_LIQUIDACIONES).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONSULTAS_LIQUIDACIONES),
                /*----------Consulta por Identificacion----------*/
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(TXT_IDENTIFICACION_CL),
                Enter.theValue(idIdentificacionUno).into(TXT_IDENTIFICACION_CL),
                Scroll.to(BTN_CONTINUAR_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONTINUAR_CL),
                WaitInterrupted5Segundos.esperaConstante5(),
                WaitInteractions.untilAppears(BTN_REGRESAR_CL),
                JavaScriptClick.on(BTN_REGRESAR_CL),
                WaitInteractions.untilAppears(BTN_LIMPIAR_CL),
                Scroll.to(BTN_LIMPIAR_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_LIMPIAR_CL),
                /*----------Consulta por Nombre----------*/
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(TXT_NOMBRE_CL),
                Enter.theValue(idNombre).into(TXT_NOMBRE_CL),
                Scroll.to(BTN_CONTINUAR_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONTINUAR_CL),
                WaitInterrupted5Segundos.esperaConstante5(),
                WaitInteractions.untilAppears(BTN_REGRESAR_CL),
                JavaScriptClick.on(BTN_REGRESAR_CL),
                WaitInteractions.untilAppears(BTN_LIMPIAR_CL),
                Scroll.to(BTN_LIMPIAR_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_LIMPIAR_CL),
                /*----------Consulta por Expediente----------*/
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(TXT_EXPEDIENTE_CL),
                Enter.theValue(idExpediente).into(TXT_EXPEDIENTE_CL),
                Scroll.to(BTN_CONTINUAR_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONTINUAR_CL),
                WaitInteractions.untilAppears(BTN_REGRESAR_CL),
                JavaScriptClick.on(BTN_REGRESAR_CL),
                WaitInteractions.untilAppears(BTN_LIMPIAR_CL),
                Scroll.to(BTN_LIMPIAR_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_LIMPIAR_CL),
                /*----------Consulta por Recibo----------*/
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(TXT_RECIBO_CL),
                Enter.theValue(idRecibo).into(TXT_RECIBO_CL),
                Scroll.to(BTN_CONTINUAR_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONTINUAR_CL),
                WaitInteractions.untilAppears(BTN_REGRESAR_CL),
                JavaScriptClick.on(BTN_REGRESAR_CL),
                WaitInteractions.untilAppears(BTN_LIMPIAR_CL),
                Scroll.to(BTN_LIMPIAR_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_LIMPIAR_CL),
                /*----------Consulta por Fecha Inicial y Fecha Final----------*/
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(TXT_FECHA_INICIAL_CL),
                Enter.theValue("2025-01-01").into(TXT_FECHA_INICIAL_CL),
                WaitInteractions.untilBeEnable(TXT_FECHA_FINAL_CL),
                Enter.theValue("2025-01-03").into(TXT_FECHA_FINAL_CL),
                Scroll.to(BTN_CONTINUAR_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONTINUAR_CL),
                WaitInteractions.untilAppears(BTN_REGRESAR_CL),
                JavaScriptClick.on(BTN_REGRESAR_CL),
                WaitInteractions.untilAppears(BTN_LIMPIAR_CL),
                Scroll.to(BTN_LIMPIAR_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_LIMPIAR_CL),
                /*----------Consulta por Liquidacion----------*/
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(TXT_LIQUIDACION_CL),
                //Enter.theValue(idLiquidacion).into(TXT_LIQUIDACION_CL),
                Enter.theValue("1724102").into(TXT_LIQUIDACION_CL),
                Scroll.to(BTN_CONTINUAR_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONTINUAR_CL),
                ModalLoader.modalLoader(),
                Click.on(BTN_VER_SOPORTE_DE_PAGO_CL),
                ModalLoader.modalLoader(),
                Click.on(BTN_SOPORTES_CL),
                WaitInteractions.untilBeEnable(BTN_VER_CL),
                Scroll.to(BTN_VER_CL).andAlignToBottom(),
                JavaScriptClick.on(BTN_VER_CL),
                WaitInterrupted5Segundos.esperaConstante5(),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilAppears(BTN_CERRAR_CL),
                JavaScriptClick.on(BTN_CERRAR_CL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_VER_SOPORTE_DE_PAGO_CL),
                ModalLoader.modalLoader(),
                Click.on(BTN_SOPORTES_CL),
                Scroll.to(BTN_VER_SOPORTE_RADICACION_CL),
                JavaScriptClick.on(BTN_VER_SOPORTE_RADICACION_CL),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilAppears(LBL_VER_DOCUMENTO_CL),
                Ensure.that(LBL_VER_DOCUMENTO_CL).text().contains(VER_DOCUMENTO)
        );
    }

    public static ConsultaLiquidaciones enConfecamaraSII(String idIdentificacionUno, String idNombre, String idExpediente, String idRecibo,
                                                         String idFechaInicial, String idFechaFinal, String idLiquidacion){
        return instrumented(ConsultaLiquidaciones.class, idIdentificacionUno, idNombre, idExpediente, idRecibo,
                idFechaInicial, idFechaFinal, idLiquidacion);
    }
}