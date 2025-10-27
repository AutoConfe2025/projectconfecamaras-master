package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitMilliseconds;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.pagos.PagoUsuarioCaja;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.RobotCerrarPestana;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static com.co.confecamaras.userinterfaces.RecibirPagoUI.BTN_POP_UP_ATENCION_CERRAR;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSucursalUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static net.serenitybdd.screenplay.Tasks.*;

public class RenovacionMatriculaSucursal implements Task {

    private String selectConsultaPor;
    private String idMatricula;
    private String idNuevosActivos;
    private String idNroEmpleados;
    private String selectAutorizaMensajes;
    private String selectTipoIdentificacion;
    private String idIdentificacion;
    private String idEmailConfirmacion;
    private String idNombre;

    public RenovacionMatriculaSucursal(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                       String idNroEmpleados, String selectAutorizaMensajes, String selectTipoIdentificacion,
                                       String idIdentificacion, String idEmailConfirmacion,String idNombre) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.idNuevosActivos = idNuevosActivos;
        this.idNroEmpleados = idNroEmpleados;
        this.selectAutorizaMensajes = selectAutorizaMensajes;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idIdentificacion = idIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
        this.idNombre = idNombre;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
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
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(TXT_NUEVOS_ACTIVOS_SOCIEDAD))){
                int indexFila = i = 50;
                System.out.println("Ingreso nuevos activos");
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitInteractions.untilBeEnable(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Enter.theValue(idNuevosActivos).into(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_NUMERO_EMPLEADOS_SUCURSAL),
                Enter.theValue(idNroEmpleados).into(TXT_NUMERO_EMPLEADOS_SUCURSAL),
                WaitInteractions.untilAppears(BTN_LIQUIDAR_SOCIEDAD),
                Scroll.to(BTN_LIQUIDAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_LIQUIDAR_SOCIEDAD)
        );

        //********************* FORMULARIO ************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_FORMULARIO_SUCURSAL),
                Scroll.to(BTN_FORMULARIO_SUCURSAL).andAlignToBottom(),
                Click.on(BTN_FORMULARIO_SUCURSAL)
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(SELECT_AUTORIZA_MENSAJES_SUCURSAL))){
                int indexFila = i = 50;
                System.out.println("Ingreso al formulario");
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_AUTORIZA_MENSAJES_SUCURSAL),
                Scroll.to(SELECT_AUTORIZA_MENSAJES_SUCURSAL).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectAutorizaMensajes).from(SELECT_AUTORIZA_MENSAJES_SUCURSAL),
                WaitInteractions.untilBeEnable(TXT_ACTIVO_VINCULADO_EST),
                Scroll.to(TXT_ACTIVO_VINCULADO_EST).andAlignToBottom(),
                Enter.theValue(idNuevosActivos).into(TXT_ACTIVO_VINCULADO_EST),
                WaitInteractions.untilAppears(BTN_ALMACENAR_SUCURSAL),
                Scroll.to(BTN_ALMACENAR_SUCURSAL).andAlignToBottom(),
                Click.on(BTN_ALMACENAR_SUCURSAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_OK_SUCURSAL),
                Click.on(BTN_OK_SUCURSAL),
                WaitMilliseconds.milliseconds(500),
                WaitInteractions.untilBeEnable(BTN_VER_SUCURSAL),
                Scroll.to(BTN_VER_SUCURSAL).andAlignToBottom(),
                Click.on(BTN_VER_SUCURSAL),
                WaitInteractions.untilAppears(BTN_EXPANDIR),
                Click.on(BTN_EXPANDIR),
                Click.on(BTN_EXPANDIR),
                WaitInteractions.untilAppears(BTN_CERRAR_SUCURSAL),
                Click.on(BTN_CERRAR_SUCURSAL),

                //********************* RECIBIR PAGO ************************************************//
                WaitInteractions.untilAppears(BTN_RECIBIR_PAGO_SUCURSAL),
                Scroll.to(BTN_RECIBIR_PAGO_SUCURSAL).andAlignToBottom(),
                Click.on(BTN_RECIBIR_PAGO_SUCURSAL),
                Switch.toNewWindow(),
                PagoUsuarioCaja.pagoUsuarioCaja(),
                RobotCerrarPestanas.toTab(),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_SOPORTES_SOCIEDAD),
                JavaScriptClick.on(BTN_SOPORTES_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_VER_RECIBO_CAJA_SOCIEDAD),
                JavaScriptClick.on(BTN_VER_RECIBO_CAJA_SOCIEDAD),
                WaitSeconds.seconds(1),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                WaitSeconds.seconds(1),
                WaitInteractions.untilAppears(BTN_VER_FORMULARIO_RENOVACION_SOCIEDAD),
                JavaScriptClick.on(BTN_VER_FORMULARIO_RENOVACION_SOCIEDAD),
                WaitSeconds.seconds(1),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                WaitSeconds.seconds(1),
                WaitInteractions.untilAppears(BTN_VER_RADICADO_DOS_SOCIEDAD),
                Scroll.to(BTN_VER_RADICADO_DOS_SOCIEDAD).andAlignToBottom(),
                JavaScriptClick.on(BTN_VER_RADICADO_DOS_SOCIEDAD),
                WaitSeconds.seconds(1),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                WaitSeconds.seconds(1)
                /*SeleccionarRadicado.enConfecamaraSII(LBL_NOMBRES_SOCIEDAD, BTN_VER_RADICADO_TABLE_SOCIEDAD, idNombre)*/
        );
    }

    public static RenovacionMatriculaSucursal enConfecamaraSII(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                                               String idNroEmpleados, String selectAutorizaMensajes, String selectTipoIdentificacion,
                                                               String idIdentificacion, String idEmailConfirmacion,String idNombre){
        return instrumented(RenovacionMatriculaSucursal.class, selectConsultaPor, idMatricula, idNuevosActivos, idNroEmpleados,
                selectAutorizaMensajes, selectTipoIdentificacion, idIdentificacion, idEmailConfirmacion, idNombre);
    }
}