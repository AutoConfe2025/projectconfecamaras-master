package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ModulosApiIntegracionRestFullUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class ModulosApiIntegracionRestFull implements Task {

    private String idInactivar;
    private String idActivar;

    public ModulosApiIntegracionRestFull(String idInactivar, String idActivar) {
        this.idInactivar = idInactivar;
        this.idActivar = idActivar;
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_MODULOS_API_INTEGRACION_REST_FULL),
                Scroll.to(BTN_MODULOS_API_INTEGRACION_REST_FULL).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULOS_API_INTEGRACION_REST_FULL),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_ACTIVO_MODULOS_API),
                Scroll.to(BTN_ACTIVO_MODULOS_API).andAlignToBottom(),
                DoubleClick.on(BTN_ACTIVO_MODULOS_API),
                Enter.theValue(idInactivar).into(TXT_ACTIVO_MODULOS_API),
                Click.on(BTN_GRABAR_MODULOS_API),
                toAlert(),
                WaitInteractions.untilAppears(BTN_ACTIVO_MODULOS_API),
                Scroll.to(BTN_ACTIVO_MODULOS_API).andAlignToBottom(),
                DoubleClick.on(BTN_ACTIVO_MODULOS_API),
                Enter.theValue(idActivar).into(TXT_ACTIVO_MODULOS_API),
                Click.on(BTN_GRABAR_MODULOS_API),
                toAlert()
        );
    }

    public static ModulosApiIntegracionRestFull enConfecamaraSII(String idInactivar, String idActivar){
        return instrumented(ModulosApiIntegracionRestFull.class, idInactivar, idActivar);
    }
}