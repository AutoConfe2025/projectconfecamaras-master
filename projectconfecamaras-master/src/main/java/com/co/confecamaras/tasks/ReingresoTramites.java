package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.ReingresoTramitesInteraccion;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ReingresoTramitesUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ReingresoTramites implements Task {

    private String idCodigoBarras;
    private String idNombreCompleto;
    private String selectTipoIdentificacion;
    private String idNumeroIdentificacion;
    private String idFechaExpedicion;
    private String idEmail;
    private String idTelefonoFijo;
    private String idCelular;

    public ReingresoTramites(String idCodigoBarras, String idNombreCompleto, String selectTipoIdentificacion,
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
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitSeconds.seconds(3),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_GESTION_CAJA),
                Scroll.to(BTN_REGISTROS_PUBLICOS_GESTION_CAJA).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_GESTION_CAJA),
                WaitUntil.the(BTN_REINGRESO_TRAMITES, isCurrentlyVisible()).forNoMoreThan(40).seconds(),
                Scroll.to(BTN_REINGRESO_TRAMITES).andAlignToBottom(),
                Click.on(BTN_REINGRESO_TRAMITES),
                ReingresoTramitesInteraccion.enConfecamaraSII(idCodigoBarras, idNombreCompleto, selectTipoIdentificacion,
                        idNumeroIdentificacion, idFechaExpedicion, idEmail, idTelefonoFijo, idCelular),
                //Wait.seconds(3),
                WaitInteractions.untilBeEnable(BTN_REINGRESAR_TRAMITES),
                Click.on(BTN_REINGRESAR_TRAMITES),
                //Wait.seconds(3),
                WaitInteractions.untilBeEnable(BTN_SI_TRAMITES),
                Click.on(BTN_SI_TRAMITES),
                //Wait.seconds(5),
                WaitInteractions.untilBeEnable(BTN_RUTA_DOCUMENTOS_TRAMITES),
                JavaScriptClick.on(BTN_RUTA_DOCUMENTOS_TRAMITES),
                WaitSeconds.seconds(5)
                );
    }

    public static ReingresoTramites enConfecamaraSII(String idCodigoBarras, String idNombreCompleto, String selectTipoIdentificacion,
                                                     String idNumeroIdentificacion, String idFechaExpedicion, String idEmail,
                                                     String idTelefonoFijo, String idCelular){
        return instrumented(ReingresoTramites.class, idCodigoBarras, idNombreCompleto, selectTipoIdentificacion, idNumeroIdentificacion,
                idFechaExpedicion, idEmail, idTelefonoFijo, idCelular);
    }
}