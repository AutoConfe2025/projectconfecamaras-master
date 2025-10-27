package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FileUpload;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.ESPERA_BARRA;
import static com.co.confecamaras.userinterfaces.ReingresoTramitesBloqueUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ReingresoTramitesBloque implements Task {

    private String idCodigoBarras;
    private String idNombreCompleto;
    private String selectTipoIdentificacion;
    private String idNumeroIdentificacion;
    private String idFechaExpedicion;

    public ReingresoTramitesBloque(String idCodigoBarras, String idNombreCompleto, String selectTipoIdentificacion,
                                   String idNumeroIdentificacion, String idFechaExpedicion) {
        this.idCodigoBarras = idCodigoBarras;
        this.idNombreCompleto = idNombreCompleto;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.idFechaExpedicion = idFechaExpedicion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
               /* WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO),*/
                WaitSeconds.seconds(3),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_GESTION_CAJA),
                Scroll.to(BTN_REGISTROS_PUBLICOS_GESTION_CAJA),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_GESTION_CAJA),
                WaitUntil.the(BTN_REINGRESO_TRAMITES_BLOQUE, isCurrentlyVisible()).forNoMoreThan(40).seconds(),
                Scroll.to(BTN_REINGRESO_TRAMITES_BLOQUE).andAlignToBottom(),
                Click.on(BTN_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Enter.keyValues(idCodigoBarras).into(TXT_CODIGO_BARRAS_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_CONTINUAR_REINGRESO_TRAMITES_BLOQUE)
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(TXT_NOMBRE_COMPLETO_REINGRESO_TRAMITES_BLOQUE))){
                int indexFila = i = 50;
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(3));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                Scroll.to(TXT_NOMBRE_COMPLETO_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Enter.keyValues(idNombreCompleto).into(TXT_NOMBRE_COMPLETO_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                SelectFromOptions.byVisibleText("Cédula de ciudadania").from(SELECT_TIPO_IDENTIFICACION_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                //SelectFromOptions.byVisibleText(selectTipoIdentificacion).from(SELECT_TIPO_IDENTIFICACION_REINGRESO_TRAMITES_BLOQUE)
                Enter.keyValues(idNumeroIdentificacion).into(TXT_NUMERO_IDENTIFICACION_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Enter.keyValues(idFechaExpedicion).into(TXT_FECHA_EXPEDICION_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_FOTO_USUARIO_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_CAPTURAR_IMAGEN_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_GUARDAR_IMAGEN_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_FRENTE_DOCUMENTO_IDENTIDAD_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_CAPTURAR_IMAGEN_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_GUARDAR_IMAGEN_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_REVERSO_DOCUMENTO_IDENTIDAD_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_CAPTURAR_IMAGEN_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_GUARDAR_IMAGEN_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                SendKeys.of(FileUpload.subirArchivo().archivoComandos()).into(BTN_SELECCIONAR_ARCHIVO_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_REINGRESAR_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                Click.on(BTN_SI_REINGRESO_TRAMITES_BLOQUE),
                WaitSeconds.seconds(3),
                WaitInteractions.untilDisappears(ESPERA_BARRA)
        );
    }

    public static ReingresoTramitesBloque enConfecamaraSII(String idCodigoBarras, String idNombreCompleto, String selectTipoIdentificacion,
                                                           String idNumeroIdentificacion, String idFechaExpedicion){
        return instrumented(ReingresoTramitesBloque.class, idCodigoBarras, idNombreCompleto, selectTipoIdentificacion,
                idNumeroIdentificacion, idFechaExpedicion);
    }
}