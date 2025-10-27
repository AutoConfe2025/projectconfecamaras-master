package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.SubirArchivo;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import static com.co.confecamaras.models.VariableEstudioInscripcionDocumentosProponentes.setBarcode;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_REPARTO_ESCANEO;
import static com.co.confecamaras.userinterfaces.DataInscripcionDocumentosMercantilUI.*;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.TXT_CODIGO_BARRAS_ID;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.TXT_FECHA_INICIAL;

public class DataEstudioInscripcionDocumentosEsadl implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_CONSULTA_POR_DIDM),
                Scroll.to(SELECT_CONSULTA_POR_DIDM).andAlignToBottom(),
                SelectFromOptions.byVisibleText("Matricula").from(SELECT_CONSULTA_POR_DIDM),
                WaitInteractions.untilAppears(TXT_CRITERIO_DIDM),
                Enter.theValue("S0000019").into(TXT_CRITERIO_DIDM),
                WaitInteractions.untilAppears(BTN_CONTINUAR_DIDM),
                Scroll.to(BTN_CONTINUAR_DIDM).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_DIDM),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_DIDM),
                Click.on(BTN_ACCIONES_DISPONIBLES_DIDM),
                WaitInteractions.untilAppears(BTN_OPCIONES_MERCANTIL_ESADL_DIDM),
                Click.on(BTN_OPCIONES_MERCANTIL_ESADL_DIDM),
                WaitInteractions.untilAppears(BTN_INSCRIPCION_DOCUMENTOS_DIDM),
                Click.on(BTN_INSCRIPCION_DOCUMENTOS_DIDM),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_DIDM),
                Click.on(BTN_CONTINUAR_DOS_DIDM),
                WaitInteractions.untilAppears(SELECT_FILTRAR_DIDM),
                SelectFromOptions.byVisibleText("NOMBRAMIENTOS").from(SELECT_FILTRAR_DIDM),
                WaitInteractions.untilAppears(BTN_ACEPTACION_REPRESENTANTE_LEGAL_DIDM_ESADL),
                Click.on(BTN_ACEPTACION_REPRESENTANTE_LEGAL_DIDM_ESADL),
                WaitInteractions.untilAppears(SELECT_TIPO_DIDM),
                Scroll.to(SELECT_TIPO_DIDM).andAlignToBottom(),
                SelectFromOptions.byVisibleText("ACTA (01)").from(SELECT_TIPO_DIDM),
                Enter.theValue("N/A").into(SELECT_NUMERO_DIDM),
                WaitInteractions.untilAppears(TXT_ORIGEN_DOCUMENTO_DIDM),
                Scroll.to(TXT_ORIGEN_DOCUMENTO_DIDM).andAlignToBottom(),
                Enter.theValue("QA").into(TXT_ORIGEN_DOCUMENTO_DIDM)
        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_DIDM),
                Scroll.to(BTN_CONTINUAR_DOS_DIDM).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_DOS_DIDM),
                WaitInteractions.untilAppears(BTN_CONTINUAR_TRES_DIDM),
                Scroll.to(BTN_CONTINUAR_TRES_DIDM).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_TRES_DIDM),
                WaitInteractions.untilAppears(BTN_RECIBIR_PAGO_DIDM),
                Scroll.to(BTN_RECIBIR_PAGO_DIDM),
                Click.on(BTN_RECIBIR_PAGO_DIDM),
                WaitInteractions.untilAppears(BTN_CONTINUAR_TRES_DIDM),
                Click.on(BTN_CONTINUAR_TRES_DIDM),
                WaitInteractions.untilAppears(BTN_FACTURAR_CLIENTE_FINAL_GENERICO_DIDM),
                Scroll.to(BTN_FACTURAR_CLIENTE_FINAL_GENERICO_DIDM).andAlignToBottom(),
                Click.on(BTN_FACTURAR_CLIENTE_FINAL_GENERICO_DIDM),
                WaitInteractions.untilAppears(BTN_CONTINUAR_TRES_DIDM),
                Click.on(BTN_CONTINUAR_TRES_DIDM),
                WaitInteractions.untilAppears(BTN_DUPLICAR_DATOS_CLIENTE_DIDM),
                Scroll.to(BTN_DUPLICAR_DATOS_CLIENTE_DIDM).andAlignToBottom(),
                Click.on(BTN_DUPLICAR_DATOS_CLIENTE_DIDM),
                WaitInteractions.untilAppears(TXT_FECHA_EXPEDICION_DIDM),
                Scroll.to(TXT_FECHA_EXPEDICION_DIDM).andAlignToBottom(),
                Enter.theValue("26/05/2023").into(TXT_FECHA_EXPEDICION_DIDM),
                WaitInteractions.untilAppears(TXT_EMAIL_DIDM),
                Enter.theValue("analistaqa@confecamaras.org.co").into(TXT_EMAIL_DIDM)
        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(TXT_TELEFONO_FIJO_DIDM),
                Enter.theValue("6707475").into(TXT_TELEFONO_FIJO_DIDM),
                WaitInteractions.untilAppears(TXT_NRO_CELULAR_DIDM),
                Enter.theValue("3165376606").into(TXT_NRO_CELULAR_DIDM),
                WaitInterrupted2Segundos.esperaConstante2(),
                SubirArchivo.enConfecamaraSII(),
                WaitInteractions.untilAppears(BTN_GENERAR_RECIBO_DIDM),
                Scroll.to(BTN_GENERAR_RECIBO_DIDM).andAlignToBottom(),
                Click.on(BTN_GENERAR_RECIBO_DIDM),
                WaitInteractions.untilAppears(BTN_CONTINUAR_TRES_DIDM),
                Click.on(BTN_CONTINUAR_TRES_DIDM)
        );

        String barcode = LBL_CODIGO_BARRAS_DIDM.resolveFor(actor).getText();
        System.out.println("¡ESTE ES EL CODIGO DE BARRAS!" + barcode);
        setBarcode(barcode);

        actor.attemptsTo(
                Switch.toTheOtherWindow(),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCambioPestanaDos.toTab(),
                WaitInteractions.untilAppears(BTN_CERRAR_DIDM),
                Click.on(BTN_CERRAR_DIDM),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_BANDEJAS),
                Click.on(BTN_BANDEJAS),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS),
                Click.on(BTN_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_REPARTO_ESCANEO),
                Scroll.to(BTN_REPARTO_ESCANEO).andAlignToBottom(),
                Click.on(BTN_REPARTO_ESCANEO),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(TXT_CODIGO_BARRAS_DIDM),
                Enter.theValue(barcode).into(TXT_CODIGO_BARRAS_ID),
                Click.on(TXT_FECHA_INICIAL),
                WaitInteractions.untilAppears(BTN_FINALIZAR_ESCANEO_DIDM),
                Click.on(BTN_FINALIZAR_ESCANEO_DIDM),
                WaitInteractions.untilAppears(BTN_SIGUIENTE_DIDM),
                Click.on(BTN_SIGUIENTE_DIDM),
                WaitInteractions.untilAppears(SELECT_USUARIO_DIDM),
                SelectFromOptions.byVisibleText("CAJAQA(CAJAQA)").from(SELECT_USUARIO_DIDM),
                WaitInteractions.untilAppears(BTN_ASIGNAR_DIDM),
                Click.on(BTN_ASIGNAR_DIDM),
                Ensure.that(LBL_PROCESO_FINALIZADO_DIDM).isEnabled(),
                Switch.toTheOtherWindow(),
                RobotCambioPestanaDos.toTab()
        );
    }
    public static DataEstudioInscripcionDocumentosEsadl dataEstudioInscripcionDocumentosEsadl() {
        return Tasks.instrumented(DataEstudioInscripcionDocumentosEsadl.class);
    }
}
