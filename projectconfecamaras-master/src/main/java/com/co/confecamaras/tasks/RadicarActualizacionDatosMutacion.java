package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.pagos.PagoUsuarioCaja;
import com.co.confecamaras.userinterfaces.CapturarEvidenciaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.BTN_CERRAR_PROCESO_PAGO;
import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.LBL_MENSAJE_FINAL_TRANSACCION_DOS;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class RadicarActualizacionDatosMutacion implements Task {

    private String idConsultaPor;
    private String idMatricula;
    private String idCheckbox;
    private String idDireccion;
    private String idTelefono;
    private String idNumeroIdentificacion;
    private String idEmailConfirmacion;
    private String idFechaExpedicion;

    public RadicarActualizacionDatosMutacion(String idConsultaPor, String idMatricula, String idCheckbox, String idDireccion,
                                             String idTelefono, String idNumeroIdentificacion, String idEmailConfirmacion,
                                             String idFechaExpedicion) {
        this.idConsultaPor = idConsultaPor;
        this.idMatricula = idMatricula;
        this.idCheckbox = idCheckbox;
        this.idDireccion = idDireccion;
        this.idTelefono = idTelefono;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
        this.idFechaExpedicion = idFechaExpedicion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilAppears(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                Click.on(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_EXPEDIENTES),
                Click.on(BTN_EXPEDIENTES),
                SelectFromOptions.byVisibleText(idConsultaPor).from(SELECT_CONSULTA_POR_EXPEDIENTES),
                Enter.theValue(idMatricula).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_ACTUALIZACION_DATOS_MUTACION_EXPEDIENTES),
                JavaScriptClick.on(BTN_ACTUALIZACION_DATOS_MUTACION_EXPEDIENTES),
                WaitInterrupted2Segundos.esperaConstante2(),
                CheckboxDatosModificar.enConfecamaraSII(CHK_DATOS_MODIFICAR_EXPEDIENTES, idCheckbox),
                WaitInteractions.untilAppears(BTN_ACEPTAR_ALERTA_MUTACION),
                Click.on(BTN_ACEPTAR_ALERTA_MUTACION),
                FormularioRadicarActualizacionDatosMutacion.enConfecamaraSII(TXT_DIRECCION_EXPEDIENTES, idDireccion,
                        TXT_TELEFONO_EXPEDIENTES, idTelefono),
                Scroll.to(BTN_CONTINUAR_TRES_EXPEDIENTES),
                JavaScriptClick.on(BTN_CONTINUAR_TRES_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_VER_SOPORTE_EXPEDIENTES),
                JavaScriptClick.on(BTN_VER_SOPORTE_EXPEDIENTES),
                WaitUntil.the(BTN_CERRAR_EXPEDIENTES, isCurrentlyVisible()).forNoMoreThan(120).seconds(),
                Click.on(BTN_CERRAR_EXPEDIENTES),
                JavaScriptClick.on(BTN_RECIBIR_PAGO_EXPEDIENTES),
                Switch.toNewWindow(),
                Click.on(CapturarEvidenciaUI.BTN_CONTINUAR_CAPTURAR_EVIDENCIA),
                PagoUsuarioCaja.pagoUsuarioCaja(),
                WaitInteractions.untilBeEnable(BTN_CERRAR_PROCESO_PAGO),
                Click.on(BTN_CERRAR_PROCESO_PAGO),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(LBL_MENSAJE_FINAL_TRANSACCION_DOS)
        );
    }

    public static RadicarActualizacionDatosMutacion enConfecamaraSII(String idConsultaPor, String idMatricula, String idCheckbox, String idDireccion,
                                                                     String idTelefono, String idNumeroIdentificacion, String idEmailConfirmacion,
                                                                     String idFechaExpedicion){
        return instrumented(RadicarActualizacionDatosMutacion.class, idConsultaPor, idMatricula, idCheckbox, idDireccion,
                idTelefono, idNumeroIdentificacion, idEmailConfirmacion, idFechaExpedicion);
    }
}