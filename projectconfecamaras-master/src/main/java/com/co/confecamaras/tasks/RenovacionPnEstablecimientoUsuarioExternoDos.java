package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.TXT_ACTIVO_VINCULADO_EST;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.PERSONAL_OCUPADO_TXT;
import static com.co.confecamaras.userinterfaces.RenovacionPnEstablecimientoUsuarioExternoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RenovacionPnEstablecimientoUsuarioExternoDos implements Task {

    private final String selectEsEmprendimientoSocial;
    private final String selectAutorizaEnvioMensajes;
    private final String idActivoCorriente;
    private final String idPatrimonioNeto;
    private final String idIngresosActividadOrdinaria;
    private final String idIdentificacionCliente;
    private final String idEmailConfirmacion;

    public RenovacionPnEstablecimientoUsuarioExternoDos(String selectEsEmprendimientoSocial, String selectAutorizaEnvioMensajes,
                                                        String idActivoCorriente, String idPatrimonioNeto,
                                                        String idIngresosActividadOrdinaria, String idIdentificacionCliente,
                                                        String idEmailConfirmacion) {
        this.selectEsEmprendimientoSocial = selectEsEmprendimientoSocial;
        this.selectAutorizaEnvioMensajes = selectAutorizaEnvioMensajes;
        this.idActivoCorriente = idActivoCorriente;
        this.idPatrimonioNeto = idPatrimonioNeto;
        this.idIngresosActividadOrdinaria = idIngresosActividadOrdinaria;
        this.idIdentificacionCliente = idIdentificacionCliente;
        this.idEmailConfirmacion = idEmailConfirmacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_ES_EMPRENDIMIENTO_SOCIAL_USUARIO_EXTERNO),
                Scroll.to(SELECT_ES_EMPRENDIMIENTO_SOCIAL_USUARIO_EXTERNO).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectEsEmprendimientoSocial).from(SELECT_ES_EMPRENDIMIENTO_SOCIAL_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(SELECT_AUTORIZA_MENSAJES_CORREO_USUARIO_EXTERNO),
                Scroll.to(SELECT_AUTORIZA_MENSAJES_CORREO_USUARIO_EXTERNO).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectAutorizaEnvioMensajes).from(SELECT_AUTORIZA_MENSAJES_CORREO_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(TXT_ACTIVO_CORRIENTE_USUARIO_EXTERNO),
                Scroll.to(TXT_ACTIVO_CORRIENTE_USUARIO_EXTERNO).andAlignToBottom(),
                Enter.theValue(idActivoCorriente).into(TXT_ACTIVO_CORRIENTE_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(TXT_PATRIMONIO_NETO_USUARIO_EXTERNO),
                Scroll.to(TXT_PATRIMONIO_NETO_USUARIO_EXTERNO).andAlignToBottom(),
                Enter.theValue(idPatrimonioNeto).into(TXT_PATRIMONIO_NETO_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_USUARIO_EXTERNO),
                Scroll.to(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_USUARIO_EXTERNO).andAlignToBottom(),
                Enter.theValue(idIngresosActividadOrdinaria).into(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(PERSONAL_OCUPADO_TXT),
                Scroll.to(PERSONAL_OCUPADO_TXT).andAlignToBottom(),
                Enter.theValue("10").into(PERSONAL_OCUPADO_TXT),
                WaitInteractions.untilAppears(BTN_ALMACENAR_USUARIO_EXTERNO),
                Scroll.to(BTN_ALMACENAR_USUARIO_EXTERNO).andAlignToBottom(),
                Click.on(BTN_ALMACENAR_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_OK_USUARIO_EXTERNO),
                Click.on(BTN_OK_USUARIO_EXTERNO)
        );

        //********************* FORMULARIO ESTABLECIMIENTO ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_FORMULARIO_DOS_USUARIO_EXTERNO),
                Scroll.to(BTN_FORMULARIO_DOS_USUARIO_EXTERNO).andAlignToBottom(),
                Click.on(BTN_FORMULARIO_DOS_USUARIO_EXTERNO),
                WaitInteractions.untilBeEnable(TXT_ACTIVO_VINCULADO_EST),
                Scroll.to(TXT_ACTIVO_VINCULADO_EST).andAlignToBottom(),
                Enter.theValue(idActivoCorriente).into(TXT_ACTIVO_VINCULADO_EST),
                WaitInteractions.untilAppears(BTN_ALMACENAR_USUARIO_EXTERNO),
                Scroll.to(BTN_ALMACENAR_USUARIO_EXTERNO),
                Click.on(BTN_ALMACENAR_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_OK_USUARIO_EXTERNO),
                Click.on(BTN_OK_USUARIO_EXTERNO)
        );

        //********************* FIRMA ELECTRONICA ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_FIRMA_ELECTRONICA_USUARIO_EXTERNO),
                Scroll.to(BTN_FIRMA_ELECTRONICA_USUARIO_EXTERNO).andAlignToBottom(),
                Click.on(BTN_FIRMA_ELECTRONICA_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_VER_USUARIO_EXTERNO),
                Click.on(BTN_VER_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_CERRAR_USUARIO_EXTERNO),
                Click.on(BTN_CERRAR_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_VER_DOS_USUARIO_EXTERNO),
                Click.on(BTN_VER_DOS_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_CERRAR_USUARIO_EXTERNO),
                Click.on(BTN_CERRAR_USUARIO_EXTERNO),
                WaitInterrupted2Segundos.esperaConstante2(),
                Scroll.to(BTN_FIRMAR_USUARIO_EXTERNO).andAlignToBottom(),
                WaitInteractions.untilAppears(BTN_FIRMAR_USUARIO_EXTERNO),
                Click.on(BTN_FIRMAR_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_SI_USUARIO_EXTERNO),
                Click.on(BTN_SI_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_CONTINUAR_TRES_USUARIO_EXTERNO),
                Click.on(BTN_CONTINUAR_TRES_USUARIO_EXTERNO),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilAppears(BTN_OBTENER_SOBRE_DIGITAL_USUARIO_EXTERNO),
                Scroll.to(BTN_OBTENER_SOBRE_DIGITAL_USUARIO_EXTERNO).andAlignToBottom(),
                Click.on(BTN_OBTENER_SOBRE_DIGITAL_USUARIO_EXTERNO),
                Scroll.to(BTN_CERRAR_DOS_USUARIO_EXTERNO).andAlignToBottom(),
                WaitInteractions.untilAppears(BTN_CERRAR_DOS_USUARIO_EXTERNO),
                Click.on(BTN_CERRAR_DOS_USUARIO_EXTERNO)
        );

        //********************* RECIBIR PAGO ************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_PAGO_ELECTRONICO_USUARIO_EXTERNO),
                Scroll.to(BTN_PAGO_ELECTRONICO_USUARIO_EXTERNO).andAlignToBottom(),
                Click.on(BTN_PAGO_ELECTRONICO_USUARIO_EXTERNO),
                PagoUsuarioPublicoNoPresencial.enConfecamaras()
        );
    }

    public static RenovacionPnEstablecimientoUsuarioExternoDos enConfecamaraSII(String selectEsEmprendimientoSocial, String selectAutorizaEnvioMensajes,
                                                                                String idActivoCorriente, String idPatrimonioNeto,
                                                                                String idIngresosActividadOrdinaria, String idIdentificacionCliente,
                                                                                String idEmailConfirmacion){
        return instrumented(RenovacionPnEstablecimientoUsuarioExternoDos.class, selectEsEmprendimientoSocial, selectAutorizaEnvioMensajes,
                idActivoCorriente, idPatrimonioNeto, idIngresosActividadOrdinaria, idIdentificacionCliente, idEmailConfirmacion);
    }
}