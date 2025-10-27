package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.ReingresoTramitesUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ReingresoTramitesInteraccion implements Interaction {

    private String idCodigoBarras;
    private String idNombreCompleto;
    private String selectTipoIdentificacion;
    private String idNumeroIdentificacion;
    private String idFechaExpedicion;
    private String idEmail;
    private String idTelefonoFijo;
    private String idCelular;

    public ReingresoTramitesInteraccion(String idCodigoBarras, String idNombreCompleto, String selectTipoIdentificacion,
                                        String idNumeroIdentificacion, String idFechaExpedicion, String idEmail,
                                        String idTelefonoFijo, String idCelular) {
        this.idCodigoBarras = idCodigoBarras;
        this.idNombreCompleto = idNombreCompleto;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.idFechaExpedicion = idFechaExpedicion;
        this.idEmail = idEmail;
        this.idTelefonoFijo = idTelefonoFijo;
        this.idCelular = idCelular;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Enter.theValue(idCodigoBarras).into(TXT_CODIGO_BARRAS_TRAMITES),
                Click.on(BTN_CONTINUAR_TRAMITES),
                WaitUntil.the(TXT_NOMBRE_COMPLETO_TRAMITES, isCurrentlyVisible()).forNoMoreThan(40).seconds(),
                WaitInteractions.untilBeEnable(TXT_NOMBRE_COMPLETO_TRAMITES),
                Enter.theValue(idNombreCompleto).into(TXT_NOMBRE_COMPLETO_TRAMITES),
                WaitInteractions.untilBeEnable(SELECT_TIPO_IDENTIFICACION_TRAMITES),
                SelectFromOptions.byVisibleText("Cédula de ciudadania").from(SELECT_TIPO_IDENTIFICACION_TRAMITES),
                WaitInteractions.untilBeEnable(TXT_NUMERO_IDENTIFICACION_TRAMITES),
                Enter.theValue(idNumeroIdentificacion).into(TXT_NUMERO_IDENTIFICACION_TRAMITES),
                Enter.theValue(idFechaExpedicion).into(TXT_FECHA_EXPEDICION_TRAMITES),
                Enter.theValue(idEmail).into(TXT_EMAIL_TRAMITES),
                Enter.theValue(idTelefonoFijo).into(TXT_TELEFONO_FIJO_TRAMITES),
                Enter.theValue(idCelular).into(TXT_CELULAR_TRAMITES),
                Scroll.to(BTN_FOTO_USUARIO).andAlignToBottom(),
                Click.on(BTN_FOTO_USUARIO),
                WaitInteractions.untilBeEnable(BTN_CANTURAR),
                Click.on(BTN_CANTURAR),
                WaitInteractions.untilBeEnable(BTN_GUARDAR_IMAGEN),
                Click.on(BTN_GUARDAR_IMAGEN),
                Scroll.to(BTN_SUBIR_ARCHIVO_TRAMITES).andAlignToBottom(),
                SendKeys.of(FileUpload.subirArchivo().archivoComandos()).into(BTN_SUBIR_ARCHIVO_TRAMITES)
        );
    }

    public static ReingresoTramitesInteraccion enConfecamaraSII(String idCodigoBarras, String idNombreCompleto, String selectTipoIdentificacion,
                                                                String idNumeroIdentificacion, String idFechaExpedicion, String idEmail,
                                                                String idTelefonoFijo, String idCelular){
        return new ReingresoTramitesInteraccion(idCodigoBarras, idNombreCompleto, selectTipoIdentificacion, idNumeroIdentificacion, idFechaExpedicion,
                idEmail, idTelefonoFijo, idCelular);
    }
}