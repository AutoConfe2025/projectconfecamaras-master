package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.OpcionMisTramitesUsuarioCajeroUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpcionMisTramitesUsuarioCajeroDos implements Task {

    private final String selectTipoIdentificacion;
    private final String idIdentificacion;
    private final String idEmailConfirmacion;
    private final String idFechaExpedicion;
    private final String selectUsuario;

    public OpcionMisTramitesUsuarioCajeroDos(String selectTipoIdentificacion, String idIdentificacion,
                                             String idEmailConfirmacion, String idFechaExpedicion,
                                             String selectUsuario) {
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idIdentificacion = idIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
        this.idFechaExpedicion = idFechaExpedicion;
        this.selectUsuario = selectUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_TIPO_IDENTIFICACION_MIS_TRAMITES),
                Scroll.to(SELECT_TIPO_IDENTIFICACION_MIS_TRAMITES).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectTipoIdentificacion).from(SELECT_TIPO_IDENTIFICACION_MIS_TRAMITES),
                WaitInteractions.untilAppears(TXT_IDENTIFICACION_MIS_TRAMITES),
                Enter.theValue(idIdentificacion).into(TXT_IDENTIFICACION_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),
//                WaitInteractions.untilAppears(BTN_VERIFICAR_IDENTIFICACION_MIS_TRAMITES),
                Scroll.to(BTN_VERIFICAR_IDENTIFICACION_MIS_TRAMITES).andAlignToBottom(),
                Click.on(BTN_VERIFICAR_IDENTIFICACION_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),
                //WaitInteractions.untilAppears(TXT_EMAIL_CONFIRMACION_MIS_TRAMITES),
                Scroll.to(TXT_EMAIL_CONFIRMACION_MIS_TRAMITES).andAlignToBottom(),
                Enter.theValue(idEmailConfirmacion).into(TXT_EMAIL_CONFIRMACION_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),
                //WaitInteractions.untilAppears(BTN_DUPLICAR_DATOS_CLIENTES_MIS_TRAMITES),
                Scroll.to(BTN_DUPLICAR_DATOS_CLIENTES_MIS_TRAMITES).andAlignToBottom(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_DUPLICAR_DATOS_CLIENTES_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),
                //WaitInteractions.untilAppears(TXT_FECHA_EXPEDICION_MIS_TRAMITES),
                Scroll.to(TXT_FECHA_EXPEDICION_MIS_TRAMITES).andAlignToBottom(),
                Enter.theValue(idFechaExpedicion).into(TXT_FECHA_EXPEDICION_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),
                //WaitInteractions.untilAppears(BTN_GENERAR_RECIBO_MIS_TRAMITES),
                Scroll.to(BTN_GENERAR_RECIBO_MIS_TRAMITES).andAlignToBottom(),
                Click.on(BTN_GENERAR_RECIBO_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),
                //WaitInteractions.untilAppears(BTN_CONTINUAR_MIS_TRAMITES),
                Click.on(BTN_CONTINUAR_MIS_TRAMITES),
                Switch.toTheOtherWindow(),
                RobotCambioPestanaDos.toTab(),
                WaitInterrupted3Segundos.esperaConstante3(),

                //WaitInteractions.untilAppears(BTN_CERRAR_MIS_TRAMITES),
                Click.on(BTN_CERRAR_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),

                //WaitInteractions.untilAppears(BTN_HOME_MIS_TRAMITES),
                Click.on(BTN_HOME_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),

                //WaitInteractions.untilAppears(BTN_BUSCAR_MIS_TRAMITES),
                JavaScriptClick.on(BTN_BUSCAR_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),

                //WaitInteractions.untilAppears(BTN_VER_RUTA_DOCUMENTO_MIS_TRAMITES),
                WaitInterrupted5Segundos.esperaConstante5(),
                Click.on(BTN_VER_RUTA_DOCUMENTO_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),

                //WaitInteractions.untilAppears(LBL_CONSULTA_RUTA_DOCUMENTOS_MIS_TRAMITES),
                Ensure.that(LBL_CONSULTA_RUTA_DOCUMENTOS_MIS_TRAMITES).isEnabled(),
                WaitInterrupted3Segundos.esperaConstante3(),

                //WaitInteractions.untilAppears(BTN_HOME_MIS_TRAMITES),
                Click.on(BTN_HOME_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),

                //WaitInteractions.untilAppears(BTN_BUSCAR_MIS_TRAMITES),
                JavaScriptClick.on(BTN_BUSCAR_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),

                //WaitInteractions.untilAppears(BTN_FINALIZAR_DIGITALIZACION_MIS_TRAMITES),
                Click.on(BTN_FINALIZAR_DIGITALIZACION_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),

                WaitInteractions.untilBeEnable(SELECT_USUARIO_MIS_TRAMITES),
                Click.on(SELECT_USUARIO_MIS_TRAMITES),
                WaitInteractions.untilBeEnable(SELECT_USUARIO_MIS_TRAMITES2),
                Enter.theValue("CAJAQA - CAJAQA").into(SELECT_USUARIO_MIS_TRAMITES2).thenHit(Keys.ENTER),
                //SelectFromOptions.byVisibleText("CAJAQAA - DIEGO ALBERTO RIOS  - CAJAQAA").from(SELECT_USUARIO_MIS_TRAMITES2),
                //SelectFromOptions.byVisibleText(selectUsuario).from(SELECT_USUARIO_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),

                //WaitInteractions.untilAppears(BTN_ASIGNAR_USUARIO_MIS_TRAMITES),
                Click.on(BTN_ASIGNAR_USUARIO_MIS_TRAMITES),
                WaitInterrupted3Segundos.esperaConstante3(),

                //WaitInteractions.untilAppears(LBL_PROCESO_FINALIZADO_MIS_TRAMITES),
                Ensure.that(LBL_PROCESO_FINALIZADO_MIS_TRAMITES).isEnabled(),
                WaitInterrupted3Segundos.esperaConstante3()

                /*WaitInteractions.untilAppears(BTN_OK_MIS_TRAMITES),
                Click.on(BTN_OK_MIS_TRAMITES),
                WaitConstant.esperaConstante(),
                WaitInteractions.untilAppears(BTN_HOME_MIS_TRAMITES),
                Click.on(BTN_HOME_MIS_TRAMITES)*/
        );
    }

    public static OpcionMisTramitesUsuarioCajeroDos enConfecamaraSII(String selectTipoIdentificacion, String idIdentificacion,
                                                                     String idEmailConfirmacion, String idFechaExpedicion,
                                                                     String selectUsuario){
        return instrumented(OpcionMisTramitesUsuarioCajeroDos.class, selectTipoIdentificacion, idIdentificacion,
                idEmailConfirmacion, idFechaExpedicion, selectUsuario);
    }
}