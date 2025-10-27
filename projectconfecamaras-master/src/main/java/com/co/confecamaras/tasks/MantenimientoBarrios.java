package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MantenimientoBarriosUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MantenimientoBarrios implements Task {

    private String idMunicipio;

    public MantenimientoBarrios(String idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
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
                WaitInteractions.untilAppears(BTN_BARRIOS),
                Scroll.to(BTN_BARRIOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_BARRIOS),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(SELECT_MUNICIPIO_MANTENIMIENTO_BARRIOS),
                SelectFromOptions.byVisibleText(idMunicipio).from(SELECT_MUNICIPIO_MANTENIMIENTO_BARRIOS),
                Click.on(BTN_GRABAR_MANTENIMIENTO_BARRIOS),
                toAlert()
        );
    }

    public static MantenimientoBarrios enConfecamaraSII(String idMunicipio){
        return instrumented(MantenimientoBarrios.class, idMunicipio);
    }
}