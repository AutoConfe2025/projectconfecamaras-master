package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.userinterfaces.RecibirPago;
import com.co.confecamaras.userinterfaces.SolicitudCertificadosUI;
import com.co.confecamaras.utils.RobotCambioPestana;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import com.co.confecamaras.utils.RobotCerrarPestana;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.SolicitudCertificadosUI.CONTINUAR_TRES_BTN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSolicitudCertificadosEsadl implements Task {

    private final String consulta;
    private final String numero;
    private final String certExistencia;
    private final String tipoIdent;
    private final String identificacion;
    private final String correo;

    public DoSolicitudCertificadosEsadl(String consulta, String numero, String certExistencia, String tipoIdent, String identificacion, String correo) {
        this.consulta = consulta;
        this.numero = numero;
        this.certExistencia = certExistencia;
        this.tipoIdent = tipoIdent;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    public static Performable solicitudCertificadosEsadl(String consulta, String numero, String certExistencia, String identificacion, String correo, String tipoIdent){
        return instrumented(DoSolicitudCertificadosEsadl.class, consulta, numero, certExistencia, identificacion, correo, tipoIdent);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitSeconds.seconds(2),
                Scroll.to(MenuSistema.CONSULTA_SLC).andAlignToBottom(),
                SelectFromOptions.byVisibleText(consulta).from(MenuSistema.CONSULTA_SLC),
                Enter.theValue(numero).into(MenuSistema.CRITERIO_INPUT),
                JavaScriptClick.on(MenuSistema.CONTINUAR_BTN),
                WaitUntil.the(SolicitudCertificadosUI.ACCIONES_BTN, WebElementStateMatchers.isClickable()),
                JavaScriptClick.on(SolicitudCertificadosUI.ACCIONES_BTN),
                WaitUntil.the(SolicitudCertificadosUI.OPERACIONES_MERCANTIL_ESADL_BTN, WebElementStateMatchers.isVisible()),
                JavaScriptClick.on(SolicitudCertificadosUI.OPERACIONES_MERCANTIL_ESADL_BTN),
                JavaScriptClick.on(SolicitudCertificadosUI.SOLICITUD_CERTIFICADOS_BTN),
                WaitInterrupted2Segundos.esperaConstante2(),
                JavaScriptClick.on(SolicitudCertificadosUI.AUTOMATICOS_BTN),
                ModalLoader.modalLoader(),
                Clear.field(SolicitudCertificadosUI.CERTIFICADOS_EXISTENCIA_INPUT_ESADL).then(Enter.theValue(certExistencia).into(SolicitudCertificadosUI.CERTIFICADOS_EXISTENCIA_INPUT_ESADL)),
                JavaScriptClick.on(SolicitudCertificadosUI.CONTINUAR_BTN),
                WaitSeconds.seconds(5),
                Switch.toNewWindow(),
                SelectFromOptions.byVisibleText(tipoIdent).from(RecibirPago.TIPO_IDENTIFICACION_SLC),
                Clear.field(RecibirPago.IDENTIFICACION_INPUT).then(Enter.theValue("1026265083").into(RecibirPago.IDENTIFICACION_INPUT)),
                WaitSeconds.seconds(2),
                JavaScriptClick.on(RecibirPago.VERIFICAR_IDENT_BTN),
                Enter.theValue("analistaqa@confecamaras.org.co").into(RecibirPago.EMAIL_CONFIRMACION_INPUT),
                Scroll.to(RecibirPago.GENERAR_RECIBO_DOS_BTN),
                JavaScriptClick.on(RecibirPago.GENERAR_RECIBO_DOS_BTN),
                JavaScriptClick.on(RecibirPago.CONTINUAR_BTN),
                WaitSeconds.seconds(5),
                Switch.toTheOtherWindow(),
                RobotCerrarPestanas.toTab(),
                WaitSeconds.seconds(2),
                JavaScriptClick.on(SolicitudCertificadosUI.OK_BTN),
                ModalLoader.modalLoader(),
                JavaScriptClick.on(SolicitudCertificadosUI.DESCARGAR_BTN),
                WaitSeconds.seconds(1),
                RobotCambioPestana.toTab(),
                WaitInteractions.untilBeEnable(CONTINUAR_TRES_BTN),
                JavaScriptClick.on(CONTINUAR_TRES_BTN),
                JavaScriptClick.on(SolicitudCertificadosUI.SERVICIOS_BTN),
                JavaScriptClick.on(SolicitudCertificadosUI.SOPORTES_BTN),
                JavaScriptClick.on(SolicitudCertificadosUI.VER_BTN)
        );
    }


}
