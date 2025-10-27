package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FileUpload;
import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.RecibirPago;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.pagos.PagoUsuarioCaja;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static net.serenitybdd.screenplay.Tasks.*;

public class RenovacionMatriculaPNBajaActivos implements Task {

    private final String selectConsultaPor;
    private final String idMatricula;
    private final String idNuevosActivos;
    private final String idNuevosActivosDos;
    private final String idNroEmpleados;
    private final String selectEsEmprendimientoSocial;
    private final String selectAutorizaMensajesCorreo;
    private final String idActivoCorriente;
    private final String idPatrimonioNeto;
    private final String idIngresosActividadOrdinaria;
    private final String selectTipoIdentificacion;
    private final String idIdentificacion;
    private final String idEmailConfirmacion;

    public RenovacionMatriculaPNBajaActivos(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                            String idNuevosActivosDos, String idNroEmpleados, String selectEsEmprendimientoSocial,
                                            String selectAutorizaMensajesCorreo, String idActivoCorriente, String idPatrimonioNeto,
                                            String idIngresosActividadOrdinaria, String selectTipoIdentificacion,
                                            String idIdentificacion, String idEmailConfirmacion) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.idNuevosActivos = idNuevosActivos;
        this.idNuevosActivosDos = idNuevosActivosDos;
        this.idNroEmpleados = idNroEmpleados;
        this.selectEsEmprendimientoSocial = selectEsEmprendimientoSocial;
        this.selectAutorizaMensajesCorreo = selectAutorizaMensajesCorreo;
        this.idActivoCorriente = idActivoCorriente;
        this.idPatrimonioNeto = idPatrimonioNeto;
        this.idIngresosActividadOrdinaria = idIngresosActividadOrdinaria;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idIdentificacion = idIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(SELECT_CONSULTA_POR_EXPEDIENTES),
                Scroll.to(SELECT_CONSULTA_POR_EXPEDIENTES).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_EXPEDIENTES),
                Enter.theValue(idMatricula).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_RENOVACION_MATRICULA_SOCIEDAD),
                Click.on(BTN_RENOVACION_MATRICULA_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_CONTINUAR_SOCIEDAD),
                Scroll.to(BTN_CONTINUAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_SOCIEDAD)
                );

        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Enter.theValue(idNuevosActivos).into(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                Enter.theValue(idNuevosActivosDos).into(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                Scroll.to(TXT_NUMERO_EMPLEADOS_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idNroEmpleados).into(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_LIQUIDAR_SOCIEDAD),
                Scroll.to(BTN_LIQUIDAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_LIQUIDAR_SOCIEDAD)
        );

        //********************* FORMULARIO PERSONA ************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_SELECCIONAR_ARCHIVO_SOCIEDAD),
                Scroll.to(BTN_SELECCIONAR_ARCHIVO_SOCIEDAD).andAlignToBottom(),
                SendKeys.of(FileUpload.subirArchivo().archivoComandos()).into(BTN_SELECCIONAR_ARCHIVO_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                Click.on(BTN_CERRAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_VISULALIZAR_BALANCE_SOCIEDAD),
                Scroll.to(BTN_VISULALIZAR_BALANCE_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_VISULALIZAR_BALANCE_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                Click.on(BTN_CERRAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_FORMULARIO_SOCIEDAD),
                Scroll.to(BTN_FORMULARIO_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_FORMULARIO_SOCIEDAD)
                );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD))){
                int indexFila = i = 50;
                System.out.println("Ingreso al formulario");
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(

                WaitInteractions.untilAppears(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD),
                Scroll.to(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectEsEmprendimientoSocial).from(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD),
                WaitInteractions.untilAppears(SELECT_AUTORIZA_MENSAJES_CORREO_SOCIEDAD),
                Scroll.to(SELECT_AUTORIZA_MENSAJES_CORREO_SOCIEDAD).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectAutorizaMensajesCorreo).from(SELECT_AUTORIZA_MENSAJES_CORREO_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_ACTIVO_CORRIENTE_SOCIEDAD),
                Scroll.to(TXT_ACTIVO_CORRIENTE_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idActivoCorriente).into(TXT_ACTIVO_CORRIENTE_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_PATRIMONIO_NETO_SOCIEDAD),
                Scroll.to(TXT_PATRIMONIO_NETO_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idPatrimonioNeto).into(TXT_PATRIMONIO_NETO_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_SOCIEDAD),
                Scroll.to(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idIngresosActividadOrdinaria).into(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_SOCIEDAD),
                Enter.theValue("100").into(PERSONAL_OCUPADO_TXT),
                WaitInteractions.untilAppears(BTN_ALMACENAR_SOCIEDAD),
                Scroll.to(BTN_ALMACENAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_ALMACENAR_SOCIEDAD)
        );
        for (int i = 0; i <= 50; i++) {
            if (actor.asksFor(ElementoElegible.para(BTN_OK_DATOS_ALMACENADOS))) {
                int indexFila = i = 50;
                System.out.println("Ingreso al formulario");
            } else {
                int indexFila = i + 1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_OK_DATOS_ALMACENADOS),
                Click.on(BTN_OK_DATOS_ALMACENADOS)
        );
                //********************* FORMULARIO ESTABLECIMIENTO ************************************************//
                actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_FORMULARIO_DOS_SOCIEDAD),
                Scroll.to(BTN_FORMULARIO_DOS_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_FORMULARIO_DOS_SOCIEDAD)
                );
        for (int i = 0; i <= 50; i++) {
            if (actor.asksFor(ElementoElegible.para(TXT_ACTIVO_VINCULADO_EST))) {
                int indexFila = i = 50;
                System.out.println("Ingreso al formulario");
            } else {
                int indexFila = i + 1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(TXT_ACTIVO_VINCULADO_EST),
                Scroll.to(TXT_ACTIVO_VINCULADO_EST).andAlignToBottom(),
                Enter.theValue(idActivoCorriente).into(TXT_ACTIVO_VINCULADO_EST),
                WaitInteractions.untilAppears(BTN_ALMACENAR_SOCIEDAD),
                Scroll.to(BTN_ALMACENAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_ALMACENAR_SOCIEDAD)
        );
        for (int i = 0; i <= 50; i++) {
            if (actor.asksFor(ElementoElegible.para(BTN_OK_DATOS_ALMACENADOS))) {
                int indexFila = i = 50;
                System.out.println("Ingreso al formulario");
            } else {
                int indexFila = i + 1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_OK_DATOS_ALMACENADOS),
                Click.on(BTN_OK_DATOS_ALMACENADOS)
        );

        //********************* RECIBIR PAGO ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_RECIBIR_PAGO_SOCIEDAD),
                Scroll.to(BTN_RECIBIR_PAGO_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_RECIBIR_PAGO_SOCIEDAD),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_CERRAR_DOS_SOCIEDAD),
                Click.on(BTN_CERRAR_DOS_SOCIEDAD),
                PagoUsuarioCaja.pagoUsuarioCaja(),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_SOPORTES_SOCIEDAD),
                JavaScriptClick.on(BTN_SOPORTES_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_VER_RECIBO_CAJA_SOCIEDAD),
                JavaScriptClick.on(BTN_VER_RECIBO_CAJA_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_VER_FORMULARIO_RENOVACION_SOCIEDAD),
                JavaScriptClick.on(BTN_VER_FORMULARIO_RENOVACION_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_VER_RADICADO_SOCIEDAD),
                Scroll.to(BTN_VER_RADICADO_SOCIEDAD).andAlignToBottom(),
                JavaScriptClick.on(BTN_VER_RADICADO_SOCIEDAD)
        );
    }

    public static RenovacionMatriculaPNBajaActivos enConfecamarasSII(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                                                     String idNuevosActivosDos, String idNroEmpleados, String selectEsEmprendimientoSocial,
                                                                     String selectAutorizaMensajesCorreo, String idActivoCorriente, String idPatrimonioNeto,
                                                                     String idIngresosActividadOrdinaria, String selectTipoIdentificacion,
                                                                     String idIdentificacion, String idEmailConfirmacion){
        return instrumented(RenovacionMatriculaPNBajaActivos.class, selectConsultaPor, idMatricula, idNuevosActivos, idNuevosActivosDos,
                idNroEmpleados, selectEsEmprendimientoSocial, selectAutorizaMensajesCorreo, idActivoCorriente, idPatrimonioNeto,
                idIngresosActividadOrdinaria, selectTipoIdentificacion, idIdentificacion, idEmailConfirmacion);
    }
}