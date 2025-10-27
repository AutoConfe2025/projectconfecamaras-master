package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.CapturarEvidenciaUI;
import com.co.confecamaras.userinterfaces.CompraServiciosEmpresarialesUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class RadicacionActualizacionProponente implements Task {

    private String idConsultaPor;
    private String idProponente;
    private String selectCelebradoPor;
    private String idNombreContratante;
    private String idFechaEjecucion;
    private String idValorPesos;
    private String idClasificacion;
    private String idIdentificacionAnexo;
    private String idNumeroIdentificacion;
    private String idFechaDocumento;
    private String idOrigenDocumento;
    private String idRutaArchivo;
    private String selectTipoIdentificacion;
    private String idIdentificacion;
    private String idEmailConfirmacion;
    private String idFechaExpedicion;

    public RadicacionActualizacionProponente(String idConsultaPor, String idProponente, String selectCelebradoPor, String idNombreContratante,
                                             String idFechaEjecucion, String idValorPesos, String idClasificacion,
                                             String idIdentificacionAnexo, String idNumeroIdentificacion, String idFechaDocumento,
                                             String idOrigenDocumento, String idRutaArchivo, String selectTipoIdentificacion,
                                             String idIdentificacion, String idEmailConfirmacion, String idFechaExpedicion) {
        this.idConsultaPor = idConsultaPor;
        this.idProponente = idProponente;
        this.selectCelebradoPor = selectCelebradoPor;
        this.idNombreContratante = idNombreContratante;
        this.idFechaEjecucion = idFechaEjecucion;
        this.idValorPesos = idValorPesos;
        this.idClasificacion = idClasificacion;
        this.idIdentificacionAnexo = idIdentificacionAnexo;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.idFechaDocumento = idFechaDocumento;
        this.idOrigenDocumento = idOrigenDocumento;
        this.idRutaArchivo = idRutaArchivo;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idIdentificacion = idIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
        this.idFechaExpedicion = idFechaExpedicion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                Click.on(BTN_EXPEDIENTES),
                SelectFromOptions.byVisibleText(idConsultaPor).from(SELECT_CONSULTA_POR_EXPEDIENTES),
                Enter.theValue(idProponente).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                WaitInteractions.untilBeEnable(BTN_OPERACIONES_PROPONENTES_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_PROPONENTES_EXPEDIENTES),
                Click.on(BTN_ACTUALIZACION_REGISTRO_PROPONENTES_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_CONTINUAR_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_INICIAR_TRAMITE_EXPEDIENTES),
                Scroll.to(BTN_INICIAR_TRAMITE_EXPEDIENTES),
                Click.on(BTN_INICIAR_TRAMITE_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_FORMULARIO_EXPEDIENTES),
                Scroll.to(BTN_FORMULARIO_EXPEDIENTES),
                JavaScriptClick.on(BTN_FORMULARIO_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_BLOQUE_EXPEDIENTES),
                Scroll.to(BTN_BLOQUE_EXPEDIENTES).andAlignToBottom(),
                Click.on(BTN_BLOQUE_EXPEDIENTES),
                Scroll.to(BTN_ANADIR_CONTRATO_EXPEDIENTES).andAlignToBottom(),
                Click.on(BTN_ANADIR_CONTRATO_EXPEDIENTES),
                WaitUntil.the(SELECT_CELEBRADO_EXPEDIENTES, isCurrentlyVisible()).forNoMoreThan(40).seconds(),
                SelectFromOptions.byVisibleText(selectCelebradoPor).from(SELECT_CELEBRADO_EXPEDIENTES),
                Enter.theValue(idNombreContratante).into(TXT_NOMBRE_CONTRATANTE_EXPEDIENTES),
                Enter.theValue(idFechaEjecucion).into(TXT_FECHA_EJECUCION_EXPEDIENTES),
                Enter.theValue(idValorPesos).into(TXT_VALOR_PESOS_EXPEDIENTES),
                Enter.theValue(idClasificacion).into(TXT_CLASIFICACION_EXPEDIENTES),
                Click.on(BTN_GRABAR_EXPEDIENTES),
                WaitInteractions.untilBeEnable(ESPERA_MODAL_EXPEDIENTES),
                JavaScriptClick.on(BTN_OK_EXPEDIENTES),
                Scroll.to(BTN_CARGAR_SOPORTE_EXPEDIENTES),
                JavaScriptClick.on(BTN_CARGAR_SOPORTE_EXPEDIENTES),
                Enter.theValue(idIdentificacionAnexo).into(TXT_IDENTIFICACION_ANEXO_EXPEDIENTES),
                Enter.theValue(idNumeroIdentificacion).into(TXT_NUMERO_IDENTIFICACION_EXPEDIENTES),
                Enter.theValue(idFechaDocumento).into(TXT_FECHA_DOCUMENTO_EXPEDIENTES),
                Enter.theValue(idOrigenDocumento).into(TXT_ORIGEN_DOCUMENTO_EXPEDIENTES),
                SendKeys.of(FileUpload.subirArchivo().archivoComandos()).into(BTN_SUBIR_ARCHIVO_EXPEDIENTES),
                Scroll.to(BTN_GRABAR_DOS_EXPEDIENTES),
                JavaScriptClick.on(BTN_GRABAR_DOS_EXPEDIENTES),
                WaitInteractions.untilBeEnable(ESPERA_MODAL_EXPEDIENTES),
                JavaScriptClick.on(BTN_OK_EXPEDIENTES),
                WaitInteractions.untilBeEnable(BTN_VALIDAR_FORMULARIO_EXPEDIENTES),
                JavaScriptClick.on(BTN_VALIDAR_FORMULARIO_EXPEDIENTES),
                WaitInteractions.untilBeEnable(ESPERA_MODAL_EXPEDIENTES),
                JavaScriptClick.on(BTN_OK_EXPEDIENTES),
                JavaScriptClick.on(BTN_VALIDAR_SOPORTES_EXPEDIENTES),
                WaitInteractions.untilBeEnable(ESPERA_MODAL_EXPEDIENTES),
                JavaScriptClick.on(BTN_OK_EXPEDIENTES),
                /*JavaScriptClick.on(BTN_IMPRIMIR_BORRADOR_EXPEDIENTES),
                Click.on(BTN_REPRESENTANTE_LEGAL_EXPEDIENTES),
                WaitInteractions.untilBeEnable(ESPERA_MODAL_DOS_EXPEDIENTES),
                Click.on(BTN_CERRAR_EXPEDIENTES),*/
                JavaScriptClick.on(BTN_IMPRIMIR_FORMULARIO_FINAL_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_SI_EXPEDIENTES),
                JavaScriptClick.on(BTN_SI_EXPEDIENTES),
                //Click.on(BTN_REPRESENTANTE_LEGAL_EXPEDIENTES),
                //WaitInteractions.untilBeEnable(ESPERA_MODAL_DOS_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_CERRAR_EXPEDIENTES),
                JavaScriptClick.on(BTN_CERRAR_EXPEDIENTES),
                JavaScriptClick.on(BTN_RECIBIR_PAGO_DOS_EXPEDIENTES),
                SwitchToNewWindow.switchToNewTab(),
                Click.on(CapturarEvidenciaUI.BTN_CONTINUAR_CAPTURAR_EVIDENCIA),
                SelectFromOptions.byVisibleText(selectTipoIdentificacion).from(CompraServiciosEmpresarialesUI.SELECT_TIPO_IDENTIFICACION_COMPRA),
                //Enter.theValue(idIdentificacion).into(CompraServiciosEmpresarialesUI.TXT_IDENTIFICACION_COMPRA),
                Enter.theValue("1026265083").into(CompraServiciosEmpresarialesUI.TXT_IDENTIFICACION_COMPRA),
                Click.on(CapturarEvidenciaUI.BTN_VERIFICAR_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                Enter.theValue(idEmailConfirmacion).into(CapturarEvidenciaUI.TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA),
                Click.on(CapturarEvidenciaUI.BTN_DUPLICAR_DOS_CAPTURAR_EVIDENCIA),
                Enter.theValue(idFechaExpedicion).into(CapturarEvidenciaUI.TXT_FECHA_EXPEDICION_CAPTURAR_EVIDENCIA),
                SubirArchivo.enConfecamaraSII(),
                Click.on(CapturarEvidenciaUI.BTN_GENERAR_RECIBO_CAPTURAR_EVIDENCIA),
                Click.on(CapturarEvidenciaUI.BTN_CONTINUAR_CAPTURAR_EVIDENCIA)
        );
    }

    public static RadicacionActualizacionProponente enConfecamaraSII(String idConsultaPor, String idProponente, String selectCelebradoPor, String idNombreContratante,
                                                                     String idFechaEjecucion, String idValorPesos, String idClasificacion,
                                                                     String idIdentificacionAnexo, String idNumeroIdentificacion, String idFechaDocumento,
                                                                     String idOrigenDocumento, String idRutaArchivo, String selectTipoIdentificacion,
                                                                     String idIdentificacion, String idEmailConfirmacion, String idFechaExpedicion){
        return Tasks.instrumented(RadicacionActualizacionProponente.class, idConsultaPor, idProponente, selectCelebradoPor, idNombreContratante,
                idFechaEjecucion, idValorPesos, idClasificacion, idIdentificacionAnexo, idNumeroIdentificacion, idFechaDocumento,
                idOrigenDocumento, idRutaArchivo, selectTipoIdentificacion, idIdentificacion, idEmailConfirmacion, idFechaExpedicion);
    }
}