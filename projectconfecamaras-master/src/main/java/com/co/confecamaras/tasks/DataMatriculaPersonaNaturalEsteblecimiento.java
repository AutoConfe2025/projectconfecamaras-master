package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted7Segundos;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MariculaPersonaNaturalEstablecimiento.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class DataMatriculaPersonaNaturalEsteblecimiento implements Task {

    private final String selectConsultaPor;
    private final String idIdentificacion;
    private final String selectEstadoMatriculaRegistro;
    private final String idFechaCancelacion;
    private final String selectMotivoCancelacion;

    public DataMatriculaPersonaNaturalEsteblecimiento(String selectConsultaPor, String idIdentificacion,
                                                      String selectEstadoMatriculaRegistro, String idFechaCancelacion,
                                                      String selectMotivoCancelacion) {
        this.selectConsultaPor = selectConsultaPor;
        this.idIdentificacion = idIdentificacion;
        this.selectEstadoMatriculaRegistro = selectEstadoMatriculaRegistro;
        this.idFechaCancelacion = idFechaCancelacion;
        this.selectMotivoCancelacion = selectMotivoCancelacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                //WaitSeconds.seconds(7),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(SELECT_CONSULTA_POR_MPNE),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_MPNE),
                WaitSeconds.seconds(7),
                WaitInteractions.untilBeEnable(TXT_INGRESAR_INFORMACION_MPNE),
                Enter.theValue(idIdentificacion).into(TXT_INGRESAR_INFORMACION_MPNE),
                WaitInteractions.untilAppears(BTN_CONTINUAR_MPNE),
                Scroll.to(BTN_CONTINUAR_MPNE).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_MPNE),
                Scroll.to(BTN_ESTADO_MATRICULA_MPNE).andAlignToBottom(),
                JavaScriptClick.on(BTN_ESTADO_MATRICULA_MPNE),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_MPNE),
                Click.on(BTN_ACCIONES_DISPONIBLES_MPNE),
                WaitInteractions.untilAppears(BTN_ESPECIALES_MPNE),
                Click.on(BTN_ESPECIALES_MPNE),
                WaitInteractions.untilAppears(BTN_ACTUALLIZACIONES_ACTUALIZAR_MATRICULADOS_MPNE),
                Click.on(BTN_ACTUALLIZACIONES_ACTUALIZAR_MATRICULADOS_MPNE),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(SELECT_ESTADO_MATRICULA_REGISTRO_MPNE),
                SelectFromOptions.byVisibleText(selectEstadoMatriculaRegistro).from(SELECT_ESTADO_MATRICULA_REGISTRO_MPNE),
                WaitInteractions.untilAppears(BTN_CANCELACION_MPNE),
                Click.on(BTN_CANCELACION_MPNE),
                WaitInteractions.untilAppears(TXT_FECHA_CANCELACION_MPNE),
                Enter.theValue(idFechaCancelacion).into(TXT_FECHA_CANCELACION_MPNE),
                WaitInteractions.untilAppears(SELECT_MOTIVO_CANCELACION_MPNE),
                SelectFromOptions.byVisibleText(selectMotivoCancelacion).from(SELECT_MOTIVO_CANCELACION_MPNE),
                WaitInteractions.untilAppears(BTN_GRABAR_MPNE),
                Click.on(BTN_GRABAR_MPNE),
                WaitInteractions.untilAppears(BTN_OK_MPNE),
                Click.on(BTN_OK_MPNE),
                Switch.toTheOtherWindow(),
                RobotCambioPestanaDos.toTab(),
                WaitInteractions.untilAppears(BTN_ACTUALIZACION_MATRICULADOS_RUES_MPNE),
                Click.on(BTN_ACTUALIZACION_MATRICULADOS_RUES_MPNE),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_ACTUALIZAR_RUES_MPNE),
                //WaitInterrupted10Segundos.esperaConstante10()
                //WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_ACTUALIZAR_RUES_MPNE),
               /* WaitInteractions.untilAppears(LBL_ACTUALIZAR_RUES_MPNE),
                Click.on(LBL_ACTUALIZAR_RUES_MPNE),*/
                //Ensure.that(LBL_ACTUALIZAR_RUES_MPNE).isEnabled(),
                Switch.toTheOtherWindow(),
                RobotCambioPestanaDos.toTab(),
                WaitInteractions.untilAppears(BTN_CERRAR_MPNE),
                Click.on(BTN_CERRAR_MPNE),
                WaitInteractions.untilAppears(BTN_HOME_MPNE),
                Click.on(BTN_HOME_MPNE)
        );
    }

    public static DataMatriculaPersonaNaturalEsteblecimiento enConfecamaraSII(String selectConsultaPor, String idIdentificacion,
                                                                              String selectEstadoMatriculaRegistro, String idFechaCancelacion,
                                                                              String selectMotivoCancelacion) {
        return  instrumented(DataMatriculaPersonaNaturalEsteblecimiento.class, selectConsultaPor, idIdentificacion,
                selectEstadoMatriculaRegistro, idFechaCancelacion, selectMotivoCancelacion);
    }
}