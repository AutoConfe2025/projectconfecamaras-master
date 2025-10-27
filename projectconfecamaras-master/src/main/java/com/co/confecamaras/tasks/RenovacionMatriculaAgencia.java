package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.RecibirPago;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.pagos.PagoUsuarioCaja;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSucursalUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSucursalUI.BTN_LIQUIDAR_SUCURSAL;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static net.serenitybdd.screenplay.Tasks.*;

public class RenovacionMatriculaAgencia implements Task {

    private String selectConsultaPor;
    private String idMatricula;
    private String idNuevosActivos;
    private String idNroEmpleados;
    private String selectTipoIdentificacion;
    private String idIdentificacion;
    private String idEmailConfirmacion;

    public RenovacionMatriculaAgencia(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                      String idNroEmpleados, String selectTipoIdentificacion,
                                      String idIdentificacion, String idEmailConfirmacion) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.idNuevosActivos = idNuevosActivos;
        this.idNroEmpleados = idNroEmpleados;
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
                Click.on(BTN_CONTINUAR_SOCIEDAD),
                ModalLoader.modalLoader()
        );

        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Enter.theValue("99500000").into(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
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
            if(actor.asksFor(ElementoElegible.para(TXT_ACTIVO_VINCULADO_EST))){
                int indexFila = i = 50;
                System.out.println("Ingreso al formulario");
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(TXT_ACTIVO_VINCULADO_EST),
                Scroll.to(TXT_ACTIVO_VINCULADO_EST).andAlignToBottom(),
                Enter.theValue("99500000").into(TXT_ACTIVO_VINCULADO_EST),
                SelectFromOptions.byVisibleText("NO PROPIO - ARRENDADO").from(MENU_DES_TIPO_LOCAL),
                WaitInteractions.untilAppears(BTN_ALMACENAR_SUCURSAL),
                Scroll.to(BTN_ALMACENAR_SUCURSAL).andAlignToBottom(),
                Click.on(BTN_ALMACENAR_SUCURSAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_OK_SUCURSAL),
                Click.on(BTN_OK_SUCURSAL)
        );

        //********************* RECIBIR PAGO ************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_RECIBIR_PAGO_SUCURSAL),
                Scroll.to(BTN_RECIBIR_PAGO_SUCURSAL).andAlignToBottom(),
                Click.on(BTN_RECIBIR_PAGO_SUCURSAL),
                Switch.toNewWindow(),
                PagoUsuarioCaja.pagoUsuarioCaja(),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                WaitSeconds.seconds(1),
                WaitInteractions.untilAppears(BTN_SOPORTES_SOCIEDAD),
                JavaScriptClick.on(BTN_SOPORTES_SOCIEDAD),
                WaitSeconds.seconds(1),
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
                RobotCerrarPestanas.toTab()
        );
    }

    public static RenovacionMatriculaAgencia enConfecamaraSII(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                                              String idNroEmpleados, String selectTipoIdentificacion,
                                                              String idIdentificacion, String idEmailConfirmacion){
        return instrumented(RenovacionMatriculaAgencia.class, selectConsultaPor, idMatricula, idNuevosActivos, idNroEmpleados,
                selectTipoIdentificacion, idIdentificacion, idEmailConfirmacion);
    }
}