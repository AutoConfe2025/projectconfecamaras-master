package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.utils.RobotCambioPestana;
import com.co.confecamaras.utils.RobotCambioPestana1;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.ESPERA;
import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static com.co.confecamaras.userinterfaces.SolicitudCertificadosUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class SolicitudCertificadosPersonaJuridicaExistencia implements Task {

    private String selectConsultaPor;
    private String idMatricula;
    private String idCertificadosExistencia;
    private String selectTipoIdentificacion;
    private String idNumeroIdentificacion;
    private String idEmailConfirmacion;

    public SolicitudCertificadosPersonaJuridicaExistencia(String selectConsultaPor, String idMatricula, String idCertificadosExistencia,
                                                          String selectTipoIdentificacion, String idNumeroIdentificacion, String idEmailConfirmacion) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.idCertificadosExistencia = idCertificadosExistencia;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                //WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                //Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(SELECT_CONSULTA_POR_EXPEDIENTES),
                Scroll.to(SELECT_CONSULTA_POR_EXPEDIENTES).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_EXPEDIENTES),
                Enter.theValue(idMatricula).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                WaitInteractions.untilBeEnable(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                WaitInteractions.untilBeEnable(BTN_SOLICITAR_CERTIFICADOS),
                Click.on(BTN_SOLICITAR_CERTIFICADOS),
                WaitInteractions.untilBeEnable(BTN_C_AUTOMATICOS_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_C_AUTOMATICOS_SOLICITUD_CERTIFICADOS),
                ModalLoader.modalLoader(),
                Clear.field(TXT_CERTIFICADOS_EXISTENCIA_SOLICITUD_CERTIFICADOS),
                Enter.theValue(idCertificadosExistencia).into(TXT_CERTIFICADOS_EXISTENCIA_SOLICITUD_CERTIFICADOS),
                WaitInteractions.untilAppears(BTN_CONTINUAR_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFICADOS),
                //WaitInteractions.untilDisappears(ESPERA_BARRA),
                ModalLoader.modalLoader(),
                Switch.toWindowTitled("SISTEMA INTEGRADO DE INFORMACION VER. 1.0"),
                FormularioPago.enConfecamaraSII(selectTipoIdentificacion, idNumeroIdentificacion, idEmailConfirmacion),
                Scroll.to(BTN_DESCARGAR_RECIBO_CAJA_IM7_CAPTURAR_EVIDENCIA).andAlignToBottom(),
                //Click.on(BTN_DESCARGAR_RECIBO_CAJA_IM7_CAPTURAR_EVIDENCIA),
                Click.on(BTN_DESCARGAR_RECIBO_CAJA_CAPTURAR_EVIDENCIA),
                RobotCambioPestana1.toTab(),
                Scroll.to(BTN_DESCARGAR_CERTIFICADO_CODIGO_CAPTURAR_EVIDENCIA),
                Click.on(BTN_DESCARGAR_CERTIFICADO_CODIGO_CAPTURAR_EVIDENCIA),
                RobotCambioPestana1.toTab(),
                Switch.toTheOtherWindow(),
                WaitInteractions.untilAppears(BTN_OK_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_OK_SOLICITUD_CERTIFICADOS),
                WaitInteractions.untilAppears(BTN_DESCARGAR_CERTIFICADO_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_DESCARGAR_CERTIFICADO_SOLICITUD_CERTIFICADOS),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCambioPestanaDos.toTab(),
                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_CONTINUAR_DOS_SOLICITUD_CERTIFICADOS),
                WaitInteractions.untilAppears(BTN_SERVICIOS_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_SERVICIOS_SOLICITUD_CERTIFICADOS),
                WaitInteractions.untilAppears(BTN_SOPORTES_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_SOPORTES_SOLICITUD_CERTIFICADOS),
                WaitInteractions.untilAppears(BTN_VER_SOLICITUD_CERTIFICADOS),
                JavaScriptClick.on(BTN_VER_SOLICITUD_CERTIFICADOS),
                WaitInteractions.untilAppears(MODAL_SOLICITUD_CERTIFICADOS)
        );
    }
    
    public static SolicitudCertificadosPersonaJuridicaExistencia enConfecamaraSII(String selectConsultaPor, String idMatricula, String idCertificadosExistencia,
                                                                                  String selectTipoIdentificacion, String idNumeroIdentificacion, String idEmailConfirmacion){
        return instrumented(SolicitudCertificadosPersonaJuridicaExistencia.class, selectConsultaPor, idMatricula,
                idCertificadosExistencia, selectTipoIdentificacion, idNumeroIdentificacion, idEmailConfirmacion);
    }
}