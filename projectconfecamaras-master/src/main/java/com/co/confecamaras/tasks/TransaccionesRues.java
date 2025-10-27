package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.*;
import static com.co.confecamaras.userinterfaces.TransaccionesRuesUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TransaccionesRues implements Task {

    private String idConsultaRues;
    private String idCcResponsable;
    private String idMatricula;
    private String idBeneficio;
    private String idIr;
    private String idGrupoActos;
    private String idServicioRues;
    private String selectIdentificacion;
    private String idNumeroIdentificacion;
    private String idEmailConfirmacion;
    private String idFechaExpedicion;

    public TransaccionesRues(String idConsultaRues, String idCcResponsable, String idMatricula,
                             String idBeneficio, String idIr, String idGrupoActos, String idServicioRues,
                             String selectIdentificacion, String idNumeroIdentificacion, String idEmailConfirmacion,
                             String idFechaExpedicion) {
        this.idConsultaRues = idConsultaRues;
        this.idCcResponsable = idCcResponsable;
        this.idMatricula = idMatricula;
        this.idBeneficio = idBeneficio;
        this.idIr = idIr;
        this.idGrupoActos = idGrupoActos;
        this.idServicioRues = idServicioRues;
        this.selectIdentificacion = selectIdentificacion;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
        this.idFechaExpedicion = idFechaExpedicion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //ModalLoader.modalLoader(),
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_GESTION_CAJA),
                Scroll.to(BTN_TRANSACCIONES_RUES).andAlignToBottom(),
                //WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_TRANSACCIONES_RUES),
                Click.on(BTN_TRANSACCIONES_RUES),
                SwitchToNewWindow.switchToNewTab(),
                Click.on(BTN_CONSULTAR_EXPEDIENTES_RUES),
                SeleccionarConsultaRues.enConfecamaraSII(SELECT_TIPO_CONSULTA_RUES, idConsultaRues),
                SelectFromOptions.byVisibleText(idCcResponsable).from(SELECT_CC_RESPONSABLE_RUES),
                Enter.theValue(idMatricula).into(TXT_MATRICULA_RUES),
                Click.on(BTN_CONSULTAR_MATRICULA_RUES),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_RADICAR_ACTOS_DOCUMENTOS_RUES),
                Click.on(BTN_RADICAR_ACTOS_DOCUMENTOS_RUES),
                SelectFromOptions.byVisibleText(idBeneficio).from(SELECT_BENEFICIO_RUES),
                SelectFromOptions.byVisibleText(idIr).from(SELECT_IR_RUES),
                SelectFromOptions.byVisibleText(idGrupoActos).from(SELECT_GRUPO_ACTOS_RUES),
                SelectFromOptions.byVisibleText(idServicioRues).from(SELECT_SERVICIO_RUES),
                Click.on(BTN_RADICAR_RUES),
                Click.on(BTN_LIQUIDAR_TRANSACCION_RUES),
                AcceptAlertFour.enConfecamaraSII(),
                Click.on(BTN_CONTINUAR_CAPTURAR_EVIDENCIA),
                SelectFromOptions.byVisibleText(selectIdentificacion).from(SELECT_TIPO_IDENTIFICACION_RUES),
                Enter.theValue(idNumeroIdentificacion).into(TXT_IDENTIFICACION_RUES),
                Click.on(BTN_VERIFICAR_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                Enter.theValue(idEmailConfirmacion).into(TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA),
                Click.on(BTN_DUPLICAR_DOS_CAPTURAR_EVIDENCIA),
                Enter.theValue(idFechaExpedicion).into(TXT_FECHA_EXPEDICION_CAPTURAR_EVIDENCIA),
                SubirArchivo.enConfecamaraSII(),
                Click.on(BTN_GENERAR_RECIBO_CAPTURAR_EVIDENCIA),
                Click.on(BTN_CONTINUAR_CAPTURAR_EVIDENCIA)
        );
    }

    public static TransaccionesRues enConfecamaraSII(String idConsultaRues, String idCcResponsable, String idMatricula,
                                                     String idBeneficio, String idIr, String idGrupoActos, String idServicioRues,
                                                     String selectIdentificacion, String idNumeroIdentificacion, String idEmailConfirmacion,
                                                     String idFechaExpedicion){
        return instrumented(TransaccionesRues.class, idConsultaRues, idCcResponsable, idMatricula, idBeneficio, idIr, idGrupoActos,
                idServicioRues, selectIdentificacion, idNumeroIdentificacion, idEmailConfirmacion, idFechaExpedicion);
    }
}