package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MantenimientoClavesValorUI.*;
import static com.co.confecamaras.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MantenimientoClavesValor implements Task {

    private String idEditarCuentaPublica;
    private String idEditarCuentaPublicaDos;

    public MantenimientoClavesValor(String idEditarCuentaPublica, String idEditarCuentaPublicaDos) {
        this.idEditarCuentaPublica = idEditarCuentaPublica;
        this.idEditarCuentaPublicaDos = idEditarCuentaPublicaDos;
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
    }

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
                WaitInteractions.untilAppears(BTN_MANTENIMIENTO_CLAVES_VALOR),
                Scroll.to(BTN_MANTENIMIENTO_CLAVES_VALOR).andAlignToBottom(),
                JavaScriptClick.on(BTN_MANTENIMIENTO_CLAVES_VALOR),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_CUENTA_PUBLICA_CANCELACION_FACTURAS_MANTENIMIENTO_CLAVES),
                Scroll.to(BTN_CUENTA_PUBLICA_CANCELACION_FACTURAS_MANTENIMIENTO_CLAVES).andAlignToBottom(),
                DoubleClick.on(BTN_CUENTA_PUBLICA_CANCELACION_FACTURAS_MANTENIMIENTO_CLAVES),
                Enter.theValue(idEditarCuentaPublica).into(TXT_CUENTA_PUBLICA_CANCELACION_FACTURAS_MANTENIMIENTO_CLAVES),
                Click.on(BTN_GRABAR_MANTENIMIENTO_CLAVES),
                toAlert(),
                WaitInteractions.untilAppears(BTN_CUENTA_PUBLICA_CANCELACION_FACTURAS_MANTENIMIENTO_CLAVES),
                Scroll.to(BTN_CUENTA_PUBLICA_CANCELACION_FACTURAS_MANTENIMIENTO_CLAVES).andAlignToBottom(),
                Ensure.that(BTN_CUENTA_PUBLICA_CANCELACION_FACTURAS_MANTENIMIENTO_CLAVES).text().isEqualTo(CUENTA_PUBLICA),
                DoubleClick.on(BTN_CUENTA_PUBLICA_CANCELACION_FACTURAS_MANTENIMIENTO_CLAVES),
                Enter.theValue(idEditarCuentaPublicaDos).into(TXT_CUENTA_PUBLICA_CANCELACION_FACTURAS_MANTENIMIENTO_CLAVES),
                Click.on(BTN_GRABAR_MANTENIMIENTO_CLAVES),
                toAlert()
        );
    }

    public static MantenimientoClavesValor enConfecamaraSII(String idEditarCuentaPublica, String idEditarCuentaPublicaDos){
        return instrumented(MantenimientoClavesValor.class, idEditarCuentaPublica, idEditarCuentaPublicaDos);
    }
}