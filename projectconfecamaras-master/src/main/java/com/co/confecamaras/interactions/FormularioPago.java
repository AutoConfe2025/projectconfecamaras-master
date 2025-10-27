package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.*;


public class FormularioPago implements Interaction {

    private String selectTipoIdentificacion;
    private String idNumeroIdentificacion;
    private String idEmailConfirmacion;

    public FormularioPago(String selectTipoIdentificacion, String idNumeroIdentificacion, String idEmailConfirmacion) {
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SELECT_TIPO_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                //SelectFromOptions.byVisibleText(selectTipoIdentificacion).from(SELECT_TIPO_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                SelectFromOptions.byVisibleText("Cédula de ciudadania").from(SELECT_TIPO_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                Enter.theValue(idNumeroIdentificacion).into(TXT_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                Click.on(BTN_VERIFICAR_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                WaitInteractions.untilBeEnable(TXT_EMAIL_CAPTURAR_EVIDENCIA),
                Clear.field(TXT_EMAIL_CAPTURAR_EVIDENCIA),
                Enter.theValue(idEmailConfirmacion).into(TXT_EMAIL_CAPTURAR_EVIDENCIA),
                Enter.theValue(idEmailConfirmacion).into(TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA),
                Click.on(BTN_GENERAR_RECIBO_DOS_CAPTURAR_EVIDENCIA),
                Click.on(BTN_CONTINUAR_CAPTURAR_EVIDENCIA)
        );
    }

    public static FormularioPago enConfecamaraSII(String selectTipoIdentificacion, String idNumeroIdentificacion, String idEmailConfirmacion){
        return new FormularioPago(selectTipoIdentificacion, idNumeroIdentificacion, idEmailConfirmacion);
    }
}