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
import static com.co.confecamaras.userinterfaces.MantenimientoCommonXXUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MantenimientoCommonXX implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilAppears(BTN_ASEGURAMIENTO_SII),
                Scroll.to(BTN_ASEGURAMIENTO_SII).andAlignToBottom(),
                JavaScriptClick.on(BTN_ASEGURAMIENTO_SII),
                WaitInteractions.untilAppears(BTN_MANTENIMIENTO_SII),
                Scroll.to(BTN_MANTENIMIENTO_SII).andAlignToBottom(),
                JavaScriptClick.on(BTN_MANTENIMIENTO_SII),
                WaitInteractions.untilAppears(BTN_MANTENIMIENTO_COMMONXX),
                Scroll.to(BTN_MANTENIMIENTO_COMMONXX).andAlignToBottom(),
                JavaScriptClick.on(BTN_MANTENIMIENTO_COMMONXX),
                Switch.toNewWindow(),
                Scroll.to(BTN_GRABAR_MANTENIMIENTO_COMMONXX).andAlignToBottom(),
                Click.on(BTN_GRABAR_MANTENIMIENTO_COMMONXX)
        );
    }

    public static MantenimientoCommonXX enConfecamaraSII(){
        return instrumented(MantenimientoCommonXX.class);
    }
}