package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MantenimientoTerminosCondicionesUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MantenimientoTerminosCondiciones implements Task {

    private String idPantalla;

    public MantenimientoTerminosCondiciones(String idPantalla) {
        this.idPantalla = idPantalla;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO),
                Scroll.to(BTN_MODULO_REGISTRO).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_T_C),
                Scroll.to(BTN_T_C).andAlignToBottom(),
                JavaScriptClick.on(BTN_T_C),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_EDITAR_MANTENIMIENTO_TERMINOS),
                Click.on(BTN_EDITAR_MANTENIMIENTO_TERMINOS),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue("Prueba QA").into(TXT_NOMBRE_PANTALLA),
                Switch.toFrame(0),
                Scroll.to(TXT_PANTALLA_MANTENIMIENTO_TERMINOS).andAlignToBottom(),
                WaitInterrupted5Segundos.esperaConstante5(),
                WaitInterrupted3Segundos.esperaConstante3(),
                Enter.theValue(idPantalla).into(TXT_PANTALLA_MANTENIMIENTO_TERMINOS),
                SendKeys.of(Keys.CONTROL + "A").into(TXT_PANTALLA_MANTENIMIENTO_TERMINOS),
                Switch.toParentFrame(),
                Click.on(BTN_NEGRITA_MANTENIMIENTO_TERMINOS),
                Click.on(BTN_CONTINUAR_MANTENIMIENTO_TERMINOS),
                WaitInteractions.untilAppears(BTN_EDITAR_MANTENIMIENTO_TERMINOS),
                Click.on(BTN_EDITAR_MANTENIMIENTO_TERMINOS),
                Scroll.to(BTN_NEGRITA_MANTENIMIENTO_TERMINOS).andAlignToBottom(),
                Scroll.to(BTN_REGRESAR_MANTENIMIENTO_TERMINOS).andAlignToBottom(),
                Click.on(BTN_REGRESAR_MANTENIMIENTO_TERMINOS)
        );
    }

    public static MantenimientoTerminosCondiciones enConfecamaraSII(String idPantalla){
        return instrumented(MantenimientoTerminosCondiciones.class, idPantalla);
    }
}