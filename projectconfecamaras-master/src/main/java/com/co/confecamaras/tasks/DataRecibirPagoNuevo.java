package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static com.co.confecamaras.userinterfaces.RecibirPago.*;
import static com.co.confecamaras.models.VariableRecibirPagoNuevo.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class DataRecibirPagoNuevo implements Task {

    private final String selectConsultaPor;
    private final String idMatricula;
    private final String idCertificadosMatricula;

    public DataRecibirPagoNuevo(String selectConsultaPor, String idMatricula, String idCertificadosMatricula) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.idCertificadosMatricula = idCertificadosMatricula;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_CONSULTA_POR_RP),
                Scroll.to(SELECT_CONSULTA_POR_RP).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_RP),
                WaitInteractions.untilAppears(TXT_INGRESAR_INFORMACION_RP),
                Enter.theValue(idMatricula).into(TXT_INGRESAR_INFORMACION_RP),
                WaitInteractions.untilAppears(BTN_CONTINUAR_RP),
                Scroll.to(BTN_CONTINUAR_RP).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_RP),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_RP),
                Click.on(BTN_ACCIONES_DISPONIBLES_RP),
                WaitInteractions.untilAppears(BTN_OPERACIONES_MERCANTIL_ESADL_RP),
                Click.on(BTN_OPERACIONES_MERCANTIL_ESADL_RP),
                WaitInteractions.untilAppears(BTN_SOLICITAR_CERTIFICADOS_RP),
                Click.on(BTN_SOLICITAR_CERTIFICADOS_RP),
                WaitInteractions.untilAppears(BTN_C_AUTOMATICOS_RP),
                Click.on(BTN_C_AUTOMATICOS_RP),
                WaitInteractions.untilAppears(TXT_CERTIFICADOS_MATRICULA_RP),
                Scroll.to(TXT_CERTIFICADOS_MATRICULA_RP).andAlignToBottom(),
                Enter.theValue(idCertificadosMatricula).into(TXT_CERTIFICADOS_MATRICULA_RP),
                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_RP),
                Click.on(BTN_CONTINUAR_DOS_RP),
                WaitInteractions.untilDisappears(ESPERA_BARRA),
                Switch.toNewWindow(),
                Ensure.that(LBL_NUMERO_RECUPERACION_RP).isEnabled()
        );
        String numeroRecuperacion = LBL_NUMERO_RECUPERACION_RP.resolveFor(actor).getText();
        String [] arrayNumRecuperacion = numeroRecuperacion.split("/");
        numeroRecuperacion = arrayNumRecuperacion[0].trim();
        System.out.println("ESTE ES EL NUMERO DE RECUPERACION:" + numeroRecuperacion);
        setNumRecuperacion(numeroRecuperacion);
        actor.attemptsTo(
                Switch.toTheOtherWindow(),
                RobotCambioPestanaDos.toTab(),
                WaitInteractions.untilAppears(BTN_OK_RP),
                Click.on(BTN_OK_RP),
                WaitInteractions.untilAppears(BTN_HOME_RP),
                Click.on(BTN_HOME_RP)
        );
    }

    public static DataRecibirPagoNuevo enConfecamaraSII(String selectConsultaPor, String idMatricula, String idCertificadosMatricula) {
        return instrumented(DataRecibirPagoNuevo.class, selectConsultaPor, idMatricula, idCertificadosMatricula);
    }
}