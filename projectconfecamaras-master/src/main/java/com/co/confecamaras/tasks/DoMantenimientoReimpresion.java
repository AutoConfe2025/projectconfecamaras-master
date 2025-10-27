package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MantenimientoDosAdmin;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoReimpresion implements Task {

    private final String id;
    private final String nombre;

    public DoMantenimientoReimpresion(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public static Performable reimpresion(String id, String nombre){
        return instrumented(DoMantenimientoReimpresion.class, id, nombre);
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept() );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Motivos de Reimpresion").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Click.on(MantenimientoDosAdmin.ID_IMPRE),
                DoubleClick.on(MantenimientoDosAdmin.ID_IMPRE),
                Enter.theValue(id).into(MantenimientoDosAdmin.ID_IMPRE_INPUT),
                Click.on(MantenimientoDosAdmin.NOMBRE_IMPRE),
                DoubleClick.on(MantenimientoDosAdmin.NOMBRE_IMPRE),
                Enter.theValue(nombre).into(MantenimientoDosAdmin.NOMBRE_IMPRE_INPUT),
                Click.on(MantenimientoDosAdmin.GRABAR_IMPRE_BTN),
                toAlert(),
                Click.on(MantenimientoDosAdmin.ID_IMPRE),
                DoubleClick.on(MantenimientoDosAdmin.ID_IMPRE),
                Clear.field(MantenimientoDosAdmin.ID_IMPRE_INPUT),
                Click.on(MantenimientoDosAdmin.NOMBRE_IMPRE),
                DoubleClick.on(MantenimientoDosAdmin.NOMBRE_IMPRE),
                Clear.field(MantenimientoDosAdmin.NOMBRE_IMPRE_INPUT),
                Click.on(MantenimientoDosAdmin.GRABAR_IMPRE_BTN),
                toAlert()
        );
    }
}
