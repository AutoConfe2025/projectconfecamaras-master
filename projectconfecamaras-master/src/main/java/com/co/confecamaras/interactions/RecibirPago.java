package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.RecibirPagoUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class RecibirPago implements Interaction {

    private String selectTipoIdentificacion;
    private String idIdentificacion;
    private String idEmailConfirmacion;

    public RecibirPago(String selectTipoIdentificacion, String idIdentificacion, String idEmailConfirmacion) {
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idIdentificacion = idIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_TIPO_IDENTIFICACION_PAGO),
                SelectFromOptions.byVisibleText(selectTipoIdentificacion).from(SELECT_TIPO_IDENTIFICACION_PAGO),
                Enter.theValue(idIdentificacion).into(TXT_IDENTIFICACION_PAGO),
                Scroll.to(BTN_VERIFICAR_IDENTIFICACION_PAGO).andAlignToBottom(),
                Click.on(BTN_VERIFICAR_IDENTIFICACION_PAGO),
                Scroll.to(TXT_EMAIL_CONFIRMACION_PAGO).andAlignToBottom(),
                Enter.theValue(idEmailConfirmacion).into(TXT_EMAIL_CONFIRMACION_PAGO),
                Scroll.to(BTN_GENERAR_RECIBO_PAGO).andAlignToBottom(),
                Click.on(BTN_GENERAR_RECIBO_PAGO),
                WaitInteractions.untilAppears(BTN_CONTINUAR_PAGO),
                Click.on(BTN_CONTINUAR_PAGO),
                Switch.toTheOtherWindow()
        );
    }

    public static RecibirPago enConfecamarasSii(String selectTipoIdentificacion, String idIdentificacion, String idEmailConfirmacion){
        return instrumented(RecibirPago.class, selectTipoIdentificacion, idIdentificacion, idEmailConfirmacion);
    }
}