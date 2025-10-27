package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.pagos.PagoUsuarioCaja;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class RenovacionMatriculaSociedad implements Task {

    private String selectConsultaPor;
    private String idMatricula;
    private String idNuevosActivos;
    private String idNuevosActivosDos;
    private String idNumerosEmpleados;
    private String selectEsEmprendimientoSocial;
    private String selectAutorizaMensajesCorreo;
    private String idActivoCorriente;
    private String idPatrimonioNeto;
    private String idIngresosActividadOrdinaria;
    private String selectTipoIdentificacion;
    private String idIdentificacion;
    private String idEmailConfirmacion;

    public RenovacionMatriculaSociedad(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                       String idNuevosActivosDos, String idNumerosEmpleados, String selectEsEmprendimientoSocial,
                                       String selectAutorizaMensajesCorreo, String idActivoCorriente, String idPatrimonioNeto,
                                       String idIngresosActividadOrdinaria, String selectTipoIdentificacion,
                                       String idIdentificacion, String idEmailConfirmacion) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.idNuevosActivos = idNuevosActivos;
        this.idNuevosActivosDos = idNuevosActivosDos;
        this.idNumerosEmpleados = idNumerosEmpleados;
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
                Scroll.to(SELECT_CONSULTA_POR_EXPEDIENTES).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_EXPEDIENTES),
                Enter.theValue(idMatricula).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_RENOVACION_MATRICULA_SOCIEDAD),
                Click.on(BTN_RENOVACION_MATRICULA_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_CONTINUAR_SOCIEDAD),
                Scroll.to(BTN_CONTINUAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_SOCIEDAD),
                ModalLoader.modalLoader()
        );

        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(POP_UP_INFORMATIVO),
                Click.on(POP_UP_INFORMATIVO),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Enter.theValue(idNuevosActivos).into(TXT_NUEVOS_ACTIVOS_SOCIEDAD)
        );
        if(actor.asksFor(ElementoElegible.para(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD))){
            actor.attemptsTo(
                    WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                    Enter.theValue(idNuevosActivosDos).into(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                Scroll.to(TXT_NUMERO_EMPLEADOS_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idNumerosEmpleados).into(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_LIQUIDAR_SOCIEDAD),
                Scroll.to(BTN_LIQUIDAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_LIQUIDAR_SOCIEDAD)
        );

        //********************* FORMULARIO PERSONA JURIDICA ************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
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
                SelectFromOptions.byVisibleText("NO").from(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD),
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
                Scroll.to(PERSONAL_OCUPADO_TXT),
                Enter.theValue("100").into(PERSONAL_OCUPADO_TXT),
                Enter.theValue("5").into(NUM_CARGOS_DIRECTIVOS_TXT),
                WaitInteractions.untilAppears(BTN_ALMACENAR_SOCIEDAD),
                Scroll.to(BTN_ALMACENAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_ALMACENAR_SOCIEDAD)
        );
        for (int i = 0; i <= 50; i++) {
            if (actor.asksFor(ElementoElegible.para(BTN_OK))) {
                int indexFila = i = 50;
                System.out.println("Ingreso al formulario");
            } else {
                int indexFila = i + 1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                //WaitInteractions.untilAppears(BTN_OK_SOCIEDAD),
                //Click.on(BTN_OK_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_OK),
                Click.on(BTN_OK)
        );

        //********************* FORMULARIO ESTABLECIMIENTO ************************************************//
        if(actor.asksFor(ElementoElegible.para(BTN_FORMULARIO_DOS_SOCIEDAD))){
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
                if (actor.asksFor(ElementoElegible.para(BTN_OK))) {
                    int indexFila = i = 50;
                    System.out.println("Ingreso al formulario");
                } else {
                    int indexFila = i + 1;
                    actor.attemptsTo(WaitSeconds.seconds(2));
                    System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
                }
            }
            actor.attemptsTo(
                    //WaitInteractions.untilAppears(BTN_OK_SOCIEDAD),
                    //Click.on(BTN_OK_SOCIEDAD),
                    WaitInteractions.untilAppears(BTN_OK),
                    Click.on(BTN_OK)
            );
        }

        //********************* RECIBIR PAGO ************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_RECIBIR_PAGO_SOCIEDAD),
                Scroll.to(BTN_RECIBIR_PAGO_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_RECIBIR_PAGO_SOCIEDAD),
                Switch.toNewWindow(),
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

    public static RenovacionMatriculaSociedad enConfecamaraSII(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                                               String idNuevosActivosDos, String idNumerosEmpleados, String selectEsEmprendimientoSocial,
                                                               String selectAutorizaMensajesCorreo, String idActivoCorriente, String idPatrimonioNeto,
                                                               String idIngresosActividadOrdinaria, String selectTipoIdentificacion,
                                                               String idIdentificacion, String idEmailConfirmacion){
        return instrumented(RenovacionMatriculaSociedad.class, selectConsultaPor, idMatricula, idNuevosActivos, idNuevosActivosDos,
                idNumerosEmpleados,selectEsEmprendimientoSocial, selectAutorizaMensajesCorreo, idActivoCorriente, idPatrimonioNeto,
                idIngresosActividadOrdinaria, selectTipoIdentificacion, idIdentificacion, idEmailConfirmacion);
    }
}