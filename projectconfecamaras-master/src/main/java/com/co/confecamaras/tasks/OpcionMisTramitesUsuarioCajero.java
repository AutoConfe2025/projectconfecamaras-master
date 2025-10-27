package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.OpcionMisTramitesUsuarioCajeroUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpcionMisTramitesUsuarioCajero implements Task {

    private final String selectConsultaPor;
    private final String idMatricula;
    private final String selectFiltrar;
    private final String selectTipo;
    private final String idNumero;
    private final String idOrigenDocumento;
    private final String idCapitalSuscrito;

    public OpcionMisTramitesUsuarioCajero(String selectConsultaPor, String idMatricula, String selectFiltrar,
                                          String selectTipo, String idNumero, String idOrigenDocumento,
                                          String idCapitalSuscrito) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.selectFiltrar = selectFiltrar;
        this.selectTipo = selectTipo;
        this.idNumero = idNumero;
        this.idOrigenDocumento = idOrigenDocumento;
        this.idCapitalSuscrito = idCapitalSuscrito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                //WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                //Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(SELECT_CONSULTA_POR_MIS_TRAMITES),
                Scroll.to(SELECT_CONSULTA_POR_MIS_TRAMITES).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_MIS_TRAMITES),
                WaitInteractions.untilAppears(TXT_INGRESAR_INFORMACION_MIS_TRAMITES),
                Enter.theValue(idMatricula).into(TXT_INGRESAR_INFORMACION_MIS_TRAMITES),
                WaitInteractions.untilAppears(BTN_CONTINUAR_MIS_TRAMITES),
                Scroll.to(BTN_CONTINUAR_MIS_TRAMITES).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_MIS_TRAMITES),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_MIS_TRAMITES),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_ACCIONES_DISPONIBLES_MIS_TRAMITES),
                WaitInteractions.untilAppears(BTN_OPERACIONES_MERCANTIL_MIS_TRAMITES),
                Click.on(BTN_OPERACIONES_MERCANTIL_MIS_TRAMITES),
                WaitInteractions.untilAppears(BTN_INSCRIPCION_DOCUMENTOS_MIS_TRAMITES),
                Click.on(BTN_INSCRIPCION_DOCUMENTOS_MIS_TRAMITES),
                Switch.toNewWindow()
        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_MIS_TRAMITES),
                Click.on(BTN_CONTINUAR_DOS_MIS_TRAMITES),
                WaitInteractions.untilAppears(BTN_SELECCIONE_TRANSACCION_INCLUIR_MIS_TRAMITES),
                Scroll.to(BTN_SELECCIONE_TRANSACCION_INCLUIR_MIS_TRAMITES).andAlignToBottom(),
                Click.on(BTN_SELECCIONE_TRANSACCION_INCLUIR_MIS_TRAMITES),
                WaitInteractions.untilAppears(SELECT_FILTRAR_MIS_TRAMITES),
                SelectFromOptions.byVisibleText(selectFiltrar).from(SELECT_FILTRAR_MIS_TRAMITES),
                WaitInteractions.untilAppears(BTN_AUMENTO_CAPITAL_SUSCRITO_MIS_TRAMITES),
                Click.on(BTN_AUMENTO_CAPITAL_SUSCRITO_MIS_TRAMITES),
                WaitInteractions.untilAppears(SELECT_TIPO_MIS_TRAMITES),
                Scroll.to(SELECT_TIPO_MIS_TRAMITES).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectTipo).from(SELECT_TIPO_MIS_TRAMITES),
                WaitInteractions.untilAppears(TXT_NUMERO_MIS_TRAMITES),
                Enter.theValue(idNumero).into(TXT_NUMERO_MIS_TRAMITES),
                WaitInteractions.untilAppears(TXT_ORIGEN_DOCUMENTO_MIS_TRAMITES),
                Scroll.to(TXT_ORIGEN_DOCUMENTO_MIS_TRAMITES).andAlignToBottom(),
                Enter.theValue(idOrigenDocumento).into(TXT_ORIGEN_DOCUMENTO_MIS_TRAMITES),
                WaitInteractions.untilAppears(TXT_CAPITAL_SUSCRITO_MIS_TRAMITES),
                Scroll.to(TXT_CAPITAL_SUSCRITO_MIS_TRAMITES).andAlignToBottom(),
                Enter.theValue(idCapitalSuscrito).into(TXT_CAPITAL_SUSCRITO_MIS_TRAMITES),
                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_MIS_TRAMITES),
                Scroll.to(BTN_CONTINUAR_DOS_MIS_TRAMITES).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_DOS_MIS_TRAMITES),
                WaitInteractions.untilAppears(BTN_CONTINUAR_MIS_TRAMITES),
                Scroll.to(BTN_CONTINUAR_MIS_TRAMITES).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_MIS_TRAMITES),
                WaitInteractions.untilAppears(BTN_RECIBIR_PAGO_MIS_TRAMITES),
                Scroll.to(BTN_RECIBIR_PAGO_MIS_TRAMITES).andAlignToBottom(),
                Click.on(BTN_RECIBIR_PAGO_MIS_TRAMITES),
                WaitInteractions.untilAppears(BTN_CONTINUAR_MIS_TRAMITES),
                Click.on(BTN_CONTINUAR_MIS_TRAMITES)
        );
    }

    public static OpcionMisTramitesUsuarioCajero enConfecamaraSII(String selectConsultaPor, String idMatricula, String selectFiltrar,
                                                                  String selectTipo, String idNumero, String idOrigenDocumento,
                                                                  String idCapitalSuscrito){
        return instrumented(OpcionMisTramitesUsuarioCajero.class, selectConsultaPor, idMatricula, selectFiltrar, selectTipo,
                idNumero, idOrigenDocumento, idCapitalSuscrito);
    }
}