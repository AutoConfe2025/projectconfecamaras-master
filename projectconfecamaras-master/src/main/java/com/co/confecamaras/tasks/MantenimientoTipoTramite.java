package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MantenimientoTipoTramiteUI.*;

public class MantenimientoTipoTramite implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Scroll.to(BTN_MODULO_REGISTRO_TIPO_TRAMIRE).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_TIPO_TRAMIRE),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_TIPO_TRAMITE),
                Scroll.to(BTN_TIPO_TRAMITE).andAlignToBottom(),
                JavaScriptClick.on(BTN_TIPO_TRAMITE),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_EDITAR_MANTENIMIENTO_TIPO_TRAMITE),
                Click.on(BTN_EDITAR_MANTENIMIENTO_TIPO_TRAMITE),
                Scroll.to(BTN_CONTINUAR_MANTENIMIENTO_TIPO_TRAMITE).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_MANTENIMIENTO_TIPO_TRAMITE),
                WaitInteractions.untilAppears(BTN_EDITAR_MANTENIMIENTO_TIPO_TRAMITE),
                Click.on(BTN_EDITAR_MANTENIMIENTO_TIPO_TRAMITE),
                Scroll.to(BTN_REGRESAR_MANTENIMIENTO_TIPO_TRAMITE).andAlignToBottom(),
                Click.on(BTN_REGRESAR_MANTENIMIENTO_TIPO_TRAMITE)
        );
    }

    public static MantenimientoTipoTramite enConfecamaraSII(){
        return Tasks.instrumented(MantenimientoTipoTramite.class);
    }
}