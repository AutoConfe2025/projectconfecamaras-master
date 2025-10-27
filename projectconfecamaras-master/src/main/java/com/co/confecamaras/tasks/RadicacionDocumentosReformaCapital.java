package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.SubirArchivo;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.userinterfaces.CapturarEvidenciaUI;
import com.co.confecamaras.userinterfaces.ExpedientesUI;
import com.co.confecamaras.utils.RobotCambioPestana;
import com.co.confecamaras.utils.RobotCambioPestana1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.ESPERA;
import static com.co.confecamaras.userinterfaces.RadicacionDocumentosReformaCapitalUI.*;

public class RadicacionDocumentosReformaCapital implements Task {

    private String idConsultaPor;
    private String idMatricula;
    private String selectFiltrar;
    private String selectTipoDocumento;
    private String idNumero;
    private String idOrigenDocumento;
    private String idCapitalSuscrito;
    private String selectDocumento;
    private String idIdentificacion;
    private String idEmailConfirmacion;
    private String idFechaExpedicion;


    public RadicacionDocumentosReformaCapital(String idConsultaPor, String idMatricula, String selectFiltrar,
                                              String selectTipoDocumento, String idNumero, String idOrigenDocumento,
                                              String idCapitalSuscrito, String selectDocumento, String idIdentificacion,
                                              String idEmailConfirmacion, String idFechaExpedicion) {
        this.idConsultaPor = idConsultaPor;
        this.idMatricula = idMatricula;
        this.selectFiltrar = selectFiltrar;
        this.selectTipoDocumento = selectTipoDocumento;
        this.idNumero = idNumero;
        this.idOrigenDocumento = idOrigenDocumento;
        this.idCapitalSuscrito = idCapitalSuscrito;
        this.selectDocumento = selectDocumento;
        this.idIdentificacion = idIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
        this.idFechaExpedicion = idFechaExpedicion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                Scroll.to(ExpedientesUI.BTN_CONTINUAR_EXPEDIENTES).andAlignToBottom(),
                SelectFromOptions.byVisibleText(idConsultaPor).from(ExpedientesUI.SELECT_CONSULTA_POR_EXPEDIENTES),
                WaitInterrupted2Segundos.esperaConstante2(),
                Scroll.to(ExpedientesUI.TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Enter.theValue(idMatricula).into(ExpedientesUI.TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Click.on(ExpedientesUI.BTN_CONTINUAR_EXPEDIENTES),
                JavaScriptClick.on(BTN_ACCIONES_DISPONIBLES_REFORMA_CAPITAL),
                Click.on(ExpedientesUI.BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                Click.on(BTN_INSCRIPCION_DOCUMENTOS_REFORMA_CAPITAL),
                SwitchToNewWindow.switchToNewTab(),
                Click.on(BTN_CONTINUAR_REFORMA_CAPITAL),
                //Click.on(BTN_SELECCIONE_TRANSACCION_INCLUIR_REFORMA_CAPITAL),
                SelectFromOptions.byVisibleText(selectFiltrar).from(BTN_SELECT_FILTRAR_REFORMA_CAPITAL),
                Click.on(BTN_REFORMAS_COMERCIALES_CAPITAL_SUSCRITO_REFORMA_CAPITAL),
                SelectFromOptions.byVisibleText(selectTipoDocumento).from(SELECT_TIPO_DOCUMENTO_REFORMA_CAPITAL),
                Enter.theValue(idNumero).into(TXT_NUMERO_REFORMA_CAPITAL),
                Enter.theValue(idOrigenDocumento).into(TXT_ORIGEN_DOCUMENTO_REFORMA_CAPITAL),
                Clear.field(TXT_CAPITAL_SUSCRITO_REFORMA_CAPITAL),
                Enter.theValue(idCapitalSuscrito).into(TXT_CAPITAL_SUSCRITO_REFORMA_CAPITAL),
                Click.on(BTN_CONTINUAR_REFORMA_CAPITAL),
                Click.on(ExpedientesUI.BTN_CONTINUAR_EXPEDIENTES),
                Click.on(BTN_RECIBIR_PAGO_REFORMA_CAPITAL),
                Click.on(CapturarEvidenciaUI.BTN_CONTINUAR_CAPTURAR_EVIDENCIA),
                //SelectFromOptions.byVisibleText(selectDocumento).from(CapturarEvidenciaUI.SELECT_TIPO_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                SelectFromOptions.byVisibleText("Cédula de ciudadania").from(CapturarEvidenciaUI.SELECT_TIPO_IDENTIFICACION_CAPTURAR_EVIDENCIA_1),
                //Enter.theValue(idIdentificacion).into(CapturarEvidenciaUI.TXT_IDENTIFICACION_CAPTURAR_EVIDENCIA_1),
                Enter.theValue("1026265083").into(CapturarEvidenciaUI.TXT_IDENTIFICACION_CAPTURAR_EVIDENCIA_1),
                Click.on(CapturarEvidenciaUI.BTN_VERIFICAR_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                Enter.theValue(idEmailConfirmacion).into(CapturarEvidenciaUI.TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA),
                Click.on(CapturarEvidenciaUI.BTN_DUPLICAR_DOS_CAPTURAR_EVIDENCIA),
                Enter.theValue(idFechaExpedicion).into(CapturarEvidenciaUI.TXT_FECHA_EXPEDICION_CAPTURAR_EVIDENCIA),
                SubirArchivo.enConfecamaraSII(),
                Click.on(CapturarEvidenciaUI.BTN_GENERAR_RECIBO_CAPTURAR_EVIDENCIA),
                Click.on(CapturarEvidenciaUI.BTN_CONTINUAR_CAPTURAR_EVIDENCIA),
                Click.on(CapturarEvidenciaUI.BTN_DESCARGAR_RECIBO_CAJA_CAPTURAR_EVIDENCIA),
                RobotCambioPestana1.toTab()
        );
    }

    public static RadicacionDocumentosReformaCapital enConfecamaraSII(String idConsultaPor, String idMatricula, String selectFiltrar,
                                                                      String selectTipoDocumento, String idNumero, String idOrigenDocumento,
                                                                      String idCapitalSuscrito, String selectDocumento, String idIdentificacion,
                                                                      String idEmailConfirmacion, String idFechaExpedicion){
        return Tasks.instrumented(RadicacionDocumentosReformaCapital.class, idConsultaPor, idMatricula, selectFiltrar, selectTipoDocumento,
                idNumero, idOrigenDocumento, idCapitalSuscrito, selectDocumento, idIdentificacion, idEmailConfirmacion, idFechaExpedicion);
    }
}