package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.userinterfaces.CancelacionRegMercantil;
import com.co.confecamaras.userinterfaces.RecibirPago;
import com.co.confecamaras.userinterfaces.RenovacionPersona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.CancelacionRegMercantil.BTN_DIA;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoCancelacionRegMercantil implements Task {

    private String numMatriculaCancelacion;
    private final String consulta;
    private final String numero;
    private final String motivo;
    private final String observacion;
    private final String fecha;
    private final String entidad;
    private final String cedula;
    private final String email;

    public DoCancelacionRegMercantil(String consulta, String numero, String motivo, String observacion, String fecha, String entidad, String cedula, String email, String numMatriculaCancelacion) {
        this.numMatriculaCancelacion = numMatriculaCancelacion;
        this.consulta = consulta;
        this.numero = numero;
        this.motivo = motivo;
        this.observacion = observacion;
        this.fecha = fecha;
        this.entidad = entidad;
        this.cedula = cedula;
        this.email = email;
    }

    public static Performable cancelacionRegMercantil(String consulta, String numero, String motivo, String observacion, String fecha, String entidad, String cedula, String email, String numMatriculaCancelacion){
        return instrumented(DoCancelacionRegMercantil.class, consulta, numero, motivo, observacion, fecha, entidad, cedula, email, numMatriculaCancelacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                Scroll.to(RenovacionPersona.CONSULTA_SLC),
                SelectFromOptions.byVisibleText(consulta).from(RenovacionPersona.CONSULTA_SLC),
                Enter.theValue(numMatriculaCancelacion).into(RenovacionPersona.INFO_INPUT),
                Click.on(RenovacionPersona.CONTINUAR_BTN),
                WaitConstant.esperaConstante(),
                WaitUntil.the(RenovacionPersona.ACCIONES_BTN, WebElementStateMatchers.isClickable()),
                JavaScriptClick.on(RenovacionPersona.ACCIONES_BTN),
                WaitUntil.the(RenovacionPersona.OPERACIONES_MERCANTIL_BTN, WebElementStateMatchers.isClickable()),
                JavaScriptClick.on(RenovacionPersona.OPERACIONES_MERCANTIL_BTN),
                WaitUntil.the(CancelacionRegMercantil.CANCELACION_MATRICULA, WebElementStateMatchers.isClickable()),
                JavaScriptClick.on(CancelacionRegMercantil.CANCELACION_MATRICULA),
                WaitConstant.esperaConstante(),
                WaitUntil.the(CancelacionRegMercantil.MOTIVO_CANCELACION_SLC, WebElementStateMatchers.isEnabled()).forNoMoreThan(60).seconds(),
                SelectFromOptions.byVisibleText(motivo).from(CancelacionRegMercantil.MOTIVO_CANCELACION_SLC),
                Enter.theValue(observacion).into(CancelacionRegMercantil.OBSERVACION_TXT),
                JavaScriptClick.on(CancelacionRegMercantil.CONTINUAR_BTN),
                WaitConstant.esperaConstante(),
                WaitUntil.the(CancelacionRegMercantil.SI_BTN, WebElementStateMatchers.isEnabled()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(CancelacionRegMercantil.SI_BTN),
                WaitConstant.esperaConstante(),
                JavaScriptClick.on(CancelacionRegMercantil.CARGAR_BTN),
                Enter.theValue(UploadFile.subirArchivo().uploadFile()).into(CancelacionRegMercantil.ARCHIVO_CARGAR_INPUT),
                //Enter.theValue("PRUEBAS QA").into(CancelacionRegMercantil.OBSERVACIONES_TXT),
                Enter.theValue(fecha).into(CancelacionRegMercantil.FECHA_INPUT),
                Scroll.to(CancelacionRegMercantil.CARGAR_DOS_BTN),
                JavaScriptClick.on(CancelacionRegMercantil.FECHA_INPUT),
                JavaScriptClick.on(BTN_DIA),
                Enter.theValue("PRUEBAS QA").into(CancelacionRegMercantil.OBSERVACIONES_TXT),
              /*  Enter.theValue(fecha).into(CancelacionRegMercantil.FECHA_INPUT),
                JavaScriptClick.on(CancelacionRegMercantil.FECHA_INPUT),
                Enter.keyValues(Keys.ENTER).into(CancelacionRegMercantil.CALENDAR),*/
                Enter.theValue(entidad).into(CancelacionRegMercantil.ENTIDAD_INPUT),
                JavaScriptClick.on(CancelacionRegMercantil.CARGAR_DOS_BTN),
                WaitUntil.the(CancelacionRegMercantil.CERRAR_BTN, WebElementStateMatchers.isEnabled()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(CancelacionRegMercantil.CERRAR_BTN),
                WaitInterrupted2Segundos.esperaConstante2(),
                JavaScriptClick.on(CancelacionRegMercantil.RECIBIR_PAGO_BTN),
                Switch.toNewWindow(),
                JavaScriptClick.on(RecibirPago.CONTINUAR_BTN),
                Clear.field(RecibirPago.IDENTIFICACION_INPUT).then(Enter.theValue("1026265083").into(RecibirPago.IDENTIFICACION_INPUT)),
                JavaScriptClick.on(RecibirPago.VERIFICAR_IDENT_BTN),
                Enter.theValue("analistaqa@confecamaras.org.co").into(RecibirPago.EMAIL_CONFIRMACION_INPUT),
                JavaScriptClick.on(RecibirPago.DUPLICAR_DATOS_BTN),
                JavaScriptClick.on(RecibirPago.GENERAR_RECIBO_BTN),
                JavaScriptClick.on(RecibirPago.CONTINUAR_BTN),
                WaitConstant.esperaConstante()
        );

    }
}
