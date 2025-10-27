package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.ESPERA_BARRA;
import static com.co.confecamaras.userinterfaces.VerificacionAniUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class VerificacionAni implements Task {

    private String idCedula;
    private String idCedulaDos;

    public VerificacionAni(String idCedula, String idCedulaDos) {
        this.idCedula = idCedula;
        this.idCedulaDos = idCedulaDos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO_TIPO_TRAMIRE),
                Scroll.to(BTN_MODULO_REGISTRO_TIPO_TRAMIRE).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_TIPO_TRAMIRE),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_CONSULTAS_INTERNAS),
                Scroll.to(BTN_REGISTROS_PUBLICOS_CONSULTAS_INTERNAS).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_CONSULTAS_INTERNAS),
                WaitInteractions.untilAppears(BTN_VERIFICACION_ANI),
                Scroll.to(BTN_VERIFICACION_ANI).andAlignToBottom(),
                JavaScriptClick.on(BTN_VERIFICACION_ANI),
                WaitInteractions.untilAppears(TXT_CEDULA_VERIFICACION_ANI),
                Enter.theValue(idCedula).into(TXT_CEDULA_VERIFICACION_ANI),
                Click.on(BTN_CONTINUAR_VERIFICACION_ANI),
                WaitInteractions.untilDisappears(ESPERA_BARRA),
                Click.on(BTN_CERRAR_VERIFICACION_ANI),
                WaitInteractions.untilAppears(BTN_LIMPIAR_VERIFICACION_ANI),
                Click.on(BTN_LIMPIAR_VERIFICACION_ANI),
                Enter.theValue(idCedula).into(TXT_CEDULA_VERIFICACION_ANI),
                Click.on(BTN_MAS_VERIFICACION_ANI),
                Enter.theValue(idCedulaDos).into(TXT_CEDULA_DOS_VERIFICACION_ANI),
                Click.on(BTN_CONTINUAR_VERIFICACION_ANI),
                WaitInteractions.untilDisappears(ESPERA_BARRA)
        );
    }

    public static VerificacionAni enConfecamaraSII(String idCedula, String idCedulaDos){
        return instrumented(VerificacionAni.class, idCedula, idCedulaDos);
    }
}