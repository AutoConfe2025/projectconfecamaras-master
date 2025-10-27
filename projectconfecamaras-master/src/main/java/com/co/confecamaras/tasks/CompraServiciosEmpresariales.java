package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.*;
import static com.co.confecamaras.userinterfaces.CompraServiciosEmpresarialesUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class CompraServiciosEmpresariales implements Task {

    private String selectIdentificacion;
    private String idNumeroIdentificacion;
    private String idEmailConfirmacion;

    public CompraServiciosEmpresariales(String selectIdentificacion, String idNumeroIdentificacion, String idEmailConfirmacion) {
        this.selectIdentificacion = selectIdentificacion;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_TRAMITES_REGISTROS_PUBLICOS),
                WaitUntil.the(BTN_COMPRA_SERVICIOS_EMPRESARIALES, isCurrentlyVisible()).forNoMoreThan(40).seconds(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_COMPRA_SERVICIOS_EMPRESARIALES),
                WaitUntil.the(BTN_SEMINARIOS_CAPACITACIONES_COMPRA, isCurrentlyVisible()).forNoMoreThan(40).seconds(),
                Click.on(BTN_SEMINARIOS_CAPACITACIONES_COMPRA),
                Click.on(BTN_ANADIR_COMPRA),
                Click.on(BTN_PAGAR_COMPRA),
                WaitUntil.the(BTN_RECIBIR_PAGO_COMPRA, isCurrentlyVisible()).forNoMoreThan(40).seconds(),
                Click.on(BTN_RECIBIR_PAGO_COMPRA),
                SwitchToNewWindow.switchToNewTab(),
                SelectFromOptions.byVisibleText(selectIdentificacion).from(SELECT_TIPO_IDENTIFICACION_COMPRA),
                Enter.theValue(idNumeroIdentificacion).into(TXT_IDENTIFICACION_COMPRA),
                Click.on(BTN_VERIFICAR_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                Enter.theValue(idEmailConfirmacion).into(TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA),
                Click.on(BTN_GENERAR_RECIBO_CAPTURAR_EVIDENCIA),
                Click.on(BTN_CONTINUAR_CAPTURAR_EVIDENCIA)
        );
    }

    public static CompraServiciosEmpresariales enConfecamaraSII(String selectIdentificacion, String idNumeroIdentificacion,
                                                                String idEmailConfirmacion){
        return instrumented(CompraServiciosEmpresariales.class, selectIdentificacion, idNumeroIdentificacion, idEmailConfirmacion);
    }
}