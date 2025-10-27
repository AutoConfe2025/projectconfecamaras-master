package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitMilliseconds;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MariculaPersonaNaturalEstablecimiento.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class DataMatriculaSoloEstablecimientoComercio implements Task {

    private final String selectConsultaPor;
    private final String idNombre;
    private final String selectEstadoMatriculaRegistro;
    private final String idFechaCancelacion;
    private final String selectMotivoCancelacion;

    public DataMatriculaSoloEstablecimientoComercio(String selectConsultaPor, String idNombre,
                                                    String selectEstadoMatriculaRegistro, String idFechaCancelacion,
                                                    String selectMotivoCancelacion) {
        this.selectConsultaPor = selectConsultaPor;
        this.idNombre = idNombre;
        this.selectEstadoMatriculaRegistro = selectEstadoMatriculaRegistro;
        this.idFechaCancelacion = idFechaCancelacion;
        this.selectMotivoCancelacion = selectMotivoCancelacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                JavaScriptClick.on(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilAppears(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                JavaScriptClick.on(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_EXPEDIENTES),
                JavaScriptClick.on(BTN_EXPEDIENTES),
                WaitInteractions.untilAppears(SELECT_CONSULTA_POR_MPNE),
                Scroll.to(SELECT_CONSULTA_POR_MPNE).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_MPNE),
                Enter.theValue(idNombre).into(TXT_INGRESAR_INFORMACION_MPNE),
                WaitInteractions.untilAppears(BTN_CONTINUAR_MPNE),
                Scroll.to(BTN_CONTINUAR_MPNE).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_MPNE),
                WaitInteractions.untilAppears(BTN_X_MPNE),
                Click.on(BTN_X_MPNE),
                Scroll.to(BTN_ESTADO_MATRICULA_MPNE).andAlignToBottom(),
                JavaScriptClick.on(BTN_ESTADO_MATRICULA_MPNE),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_MPNE),
                Click.on(BTN_ACCIONES_DISPONIBLES_MPNE),
                WaitInteractions.untilAppears(BTN_ESPECIALES_MPNE),
                Click.on(BTN_ESPECIALES_MPNE),
                WaitInteractions.untilAppears(BTN_ACTUALLIZACIONES_ACTUALIZAR_MATRICULADOS_MPNE),
                Click.on(BTN_ACTUALLIZACIONES_ACTUALIZAR_MATRICULADOS_MPNE),
                Switch.toNewWindow(),
                WaitMilliseconds.milliseconds(500),
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
                WaitMilliseconds.milliseconds(500),
                RobotCambioPestanaDos.toTab(),
                WaitMilliseconds.milliseconds(500),
                WaitInteractions.untilAppears(BTN_ACTUALIZACION_MATRICULADOS_RUES_MPNE),
                Click.on(BTN_ACTUALIZACION_MATRICULADOS_RUES_MPNE),
                Switch.toNewWindow(),
                WaitMilliseconds.milliseconds(500),
                WaitInteractions.untilAppears(BTN_ACTUALIZAR_RUES_MPNE),
                Click.on(BTN_ACTUALIZAR_RUES_MPNE),
                //WaitInteractions.untilAppears(LBL_ACTUALIZAR_RUES_MPNE),
                //Ensure.that(LBL_ACTUALIZAR_RUES_MPNE).isEnabled(),
                Switch.toTheOtherWindow(),
                WaitMilliseconds.milliseconds(500),
                RobotCambioPestanaDos.toTab(),
                WaitMilliseconds.milliseconds(500),
                WaitInteractions.untilAppears(BTN_CERRAR_MPNE),
                Click.on(BTN_CERRAR_MPNE),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_HOME_MPNE),
                Click.on(BTN_HOME_MPNE),
                WaitInteractions.untilAppears(BTN_MENU_MPNE),
                Click.on(BTN_MENU_MPNE)
        );
    }

    public static DataMatriculaSoloEstablecimientoComercio enConfecamaraSII(String selectConsultaPor, String idNombre,
                                                                            String selectEstadoMatriculaRegistro, String idFechaCancelacion,
                                                                            String selectMotivoCancelacion) {
        return instrumented(DataMatriculaSoloEstablecimientoComercio.class, selectConsultaPor, idNombre,
                selectEstadoMatriculaRegistro, idFechaCancelacion, selectMotivoCancelacion);
    }
}