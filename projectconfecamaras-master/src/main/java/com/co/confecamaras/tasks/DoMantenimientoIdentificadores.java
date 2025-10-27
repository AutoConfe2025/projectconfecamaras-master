package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
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

public class DoMantenimientoIdentificadores implements Task {

    public static Performable identificadores(){
        return instrumented(DoMantenimientoIdentificadores.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Maestro Identificadores").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Click.on(MantenimientoDosAdmin.DESCRIPCION_CERT),
                Click.on(MantenimientoDosAdmin.RM_IDENTF),
                DoubleClick.on(MantenimientoDosAdmin.RM_IDENTF),
                Enter.theValue("X").into(MantenimientoDosAdmin.RM_IDENTF_INPUT),
                Click.on(MantenimientoDosAdmin.GRABAR_DEV_BTN),
                WaitConstant.esperaConstante(),
                Click.on(MantenimientoDosAdmin.DESCRIPCION_CERT),
                Click.on(MantenimientoDosAdmin.RM_IDENTF),
                DoubleClick.on(MantenimientoDosAdmin.RM_IDENTF),
                Clear.field(MantenimientoDosAdmin.RM_IDENTF_INPUT),
                Click.on(MantenimientoDosAdmin.GRABAR_DEV_BTN),
                WaitConstant.esperaConstante()
        );
    }
}
