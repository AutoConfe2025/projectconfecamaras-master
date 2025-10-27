package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MantenimientoServiciosRuesUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MantenimientoServiciosRues implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Scroll.to(BTN_MODULO_REGISTRO).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_SERVICIOS_RUES),
                Scroll.to(BTN_SERVICIOS_RUES).andAlignToBottom(),
                JavaScriptClick.on(BTN_SERVICIOS_RUES),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_EDITAR_MANTENIMIENTO_SERVICIOS_RUES),
                Click.on(BTN_EDITAR_MANTENIMIENTO_SERVICIOS_RUES),
                WaitInteractions.untilAppears(BTN_GRABAR_REGISTRO_MANTENIMIENTO_SERVICIOS_RUES),
                Click.on(BTN_GRABAR_REGISTRO_MANTENIMIENTO_SERVICIOS_RUES),
                WaitInteractions.untilAppears(BTN_EDITAR_MANTENIMIENTO_SERVICIOS_RUES),
                Click.on(BTN_EDITAR_MANTENIMIENTO_SERVICIOS_RUES),
                WaitInteractions.untilAppears(BTN_REGRESAR_MANTENIMIENTO_SERVICIOS_RUES),
                Click.on(BTN_REGRESAR_MANTENIMIENTO_SERVICIOS_RUES)
        );
    }

    public static MantenimientoServiciosRues enConfecamaraSII(){
        return instrumented(MantenimientoServiciosRues.class);
    }
}