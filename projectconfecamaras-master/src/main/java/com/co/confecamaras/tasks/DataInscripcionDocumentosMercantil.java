package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted10Segundos;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.DataInscripcionDocumentosMercantilUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DataInscripcionDocumentosMercantil implements Task {

    private final String selectConsultaPor;
    private final String idMatricula;
    private final String selectFiltrar;
    private final String selectTipo;
    private final String idOrigenDocumento;
    private final String selectVinculo;
    private final String idPrimerApellido;

    public DataInscripcionDocumentosMercantil(String selectConsultaPor, String idMatricula, String selectFiltrar,
                                              String selectTipo, String idOrigenDocumento, String selectVinculo,
                                              String idPrimerApellido) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.selectFiltrar = selectFiltrar;
        this.selectTipo = selectTipo;
        this.idOrigenDocumento = idOrigenDocumento;
        this.selectVinculo = selectVinculo;
        this.idPrimerApellido = idPrimerApellido;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_CONSULTA_POR_DIDM),
                Scroll.to(SELECT_CONSULTA_POR_DIDM).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_DIDM),
                WaitInteractions.untilAppears(TXT_CRITERIO_DIDM),
                Enter.theValue(idMatricula).into(TXT_CRITERIO_DIDM),
                WaitInteractions.untilAppears(BTN_CONTINUAR_DIDM),
                Scroll.to(BTN_CONTINUAR_DIDM).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_DIDM),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_DIDM),
                Click.on(BTN_ACCIONES_DISPONIBLES_DIDM),
                WaitInteractions.untilAppears(BTN_OPCIONES_MERCANTIL_ESADL_DIDM),
                Click.on(BTN_OPCIONES_MERCANTIL_ESADL_DIDM),
                WaitInteractions.untilAppears(BTN_INSCRIPCION_DOCUMENTOS_DIDM),
                Click.on(BTN_INSCRIPCION_DOCUMENTOS_DIDM),
                Switch.toNewWindow()
        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_DIDM),
                Click.on(BTN_CONTINUAR_DOS_DIDM),
                /*WaitInteractions.untilAppears(BTN_SELECCION_TRANSACCION_DIDM),
                Scroll.to(BTN_SELECCION_TRANSACCION_DIDM).andAlignToBottom(),
                Click.on(BTN_SELECCION_TRANSACCION_DIDM),*/
                WaitInteractions.untilAppears(SELECT_FILTRAR_DIDM),
                SelectFromOptions.byVisibleText("NOMBRAMIENTOS").from(SELECT_FILTRAR_DIDM),
                //SelectFromOptions.byVisibleText(selectFiltrar).from(SELECT_FILTRAR_DIDM),
                WaitInteractions.untilAppears(BTN_ACEPTACION_REPRESENTANTE_LEGAL_DIDM),
                Click.on(BTN_ACEPTACION_REPRESENTANTE_LEGAL_DIDM),
                WaitInteractions.untilAppears(SELECT_TIPO_DIDM),
                Scroll.to(SELECT_TIPO_DIDM).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectTipo).from(SELECT_TIPO_DIDM),
                Enter.theValue("N/A").into(SELECT_NUMERO_DIDM),
                WaitInteractions.untilAppears(TXT_ORIGEN_DOCUMENTO_DIDM),
                Scroll.to(TXT_ORIGEN_DOCUMENTO_DIDM).andAlignToBottom(),
                Enter.theValue(idOrigenDocumento).into(TXT_ORIGEN_DOCUMENTO_DIDM),
                WaitInteractions.untilAppears(SELECT_VINCULO_DIDM),
                Scroll.to(SELECT_VINCULO_DIDM).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectVinculo).from(SELECT_VINCULO_DIDM),
                WaitInteractions.untilAppears(TXT_PRIMER_APELLIDO_DIDM),
                Scroll.to(TXT_PRIMER_APELLIDO_DIDM).andAlignToBottom(),
                Enter.theValue(idPrimerApellido).into(TXT_PRIMER_APELLIDO_DIDM)
        );
    }

    public static DataInscripcionDocumentosMercantil enConfecamaraSII(String selectConsultaPor, String idMatricula, String selectFiltrar,
                                                                      String selectTipo, String idOrigenDocumento, String selectVinculo,
                                                                      String idPrimerApellido) {
        return instrumented(DataInscripcionDocumentosMercantil.class, selectConsultaPor, idMatricula, selectFiltrar, selectTipo,
                idOrigenDocumento, selectVinculo, idPrimerApellido);
    }
}