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
import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.BTN_DESCARGAR_CERTIFICADO_CODIGO_CAPTURAR_EVIDENCIA;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.BTN_OPERACIONES_MERCANTIL_EXPEDIENTES;
import static com.co.confecamaras.userinterfaces.SolicitudCertificadosUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class SolicitudCertificadosProponentes implements Task {

    private String selectConsultaPor;
    private String idProponente;
    private String idCertificadosProponentes;
    private String selectTipoIdentificacion;
    private String idNumeroIdentificacion;
    private String idEmailConfirmacion;

    public SolicitudCertificadosProponentes(String selectConsultaPor, String idProponente, String idCertificadosProponentes,
                                            String selectTipoIdentificacion, String idNumeroIdentificacion, String idEmailConfirmacion) {
        this.selectConsultaPor = selectConsultaPor;
        this.idProponente = idProponente;
        this.idCertificadosProponentes = idCertificadosProponentes;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(SELECT_CONSULTA_POR_EXPEDIENTES),
                Scroll.to(SELECT_CONSULTA_POR_EXPEDIENTES).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_EXPEDIENTES),
                Enter.theValue(idProponente).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_OPERACIONES_PROPONENTES_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_PROPONENTES_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_SOLICITAR_CERTIFICADOS_DOS),
                Click.on(BTN_SOLICITAR_CERTIFICADOS_DOS),
                WaitInteractions.untilAppears(BTN_C_AUTOMATICOS_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_C_AUTOMATICOS_SOLICITUD_CERTIFICADOS),
                Clear.field(TXT_CERTIFICADOS_PROPONENTES_SOLICITUD_CERTIFICADOS),
                Enter.theValue(idCertificadosProponentes).into(TXT_CERTIFICADOS_PROPONENTES_SOLICITUD_CERTIFICADOS),
                WaitInteractions.untilAppears(BTN_CONTINUAR_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFICADOS),
                WaitInteractions.untilDisappears(ESPERA_BARRA),
                Switch.toWindowTitled("SISTEMA INTEGRADO DE INFORMACION VER. 1.0"),
                FormularioPago.enConfecamaraSII(selectTipoIdentificacion, idNumeroIdentificacion, idEmailConfirmacion),
                Scroll.to(BTN_DESCARGAR_RECIBO_CAJA_IM7_CAPTURAR_EVIDENCIA).andAlignToBottom(),
                //Click.on(BTN_DESCARGAR_RECIBO_CAJA_IM7_CAPTURAR_EVIDENCIA),
                Click.on(BTN_DESCARGAR_RECIBO_CAJA_CAPTURAR_EVIDENCIA),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCambioPestana1.toTab(),
                Scroll.to(BTN_DESCARGAR_CERTIFICADO_CODIGO_CAPTURAR_EVIDENCIA),
                Click.on(BTN_DESCARGAR_CERTIFICADO_CODIGO_CAPTURAR_EVIDENCIA),
                RobotCambioPestana1.toTab(),
                Switch.toTheOtherWindow(),
                WaitInteractions.untilAppears(BTN_OK_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_OK_SOLICITUD_CERTIFICADOS),
                WaitInteractions.untilAppears(BTN_DESCARGAR_CERTIFICADO_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_DESCARGAR_CERTIFICADO_SOLICITUD_CERTIFICADOS),
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

    public static SolicitudCertificadosProponentes enConfecamaraSII(String selectConsultaPor, String idProponente, String idCertificadosProponentes,
                                                                    String selectTipoIdentificacion, String idNumeroIdentificacion, String idEmailConfirmacion){
        return instrumented(SolicitudCertificadosProponentes.class, selectConsultaPor, idProponente, idCertificadosProponentes, selectTipoIdentificacion,
                idNumeroIdentificacion, idEmailConfirmacion);
    }
}