package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MantenimientosAdmin;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoMaestroTramites implements Task {

    public static Performable mantenimientoMaestroTramites(){
        return instrumented(DoMantenimientoMaestroTramites.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Maestro de tramites sin costo").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Click.on(MantenimientosAdmin.SUBTIPO_ORD),
                Click.on(MantenimientosAdmin.EDITAR_MMT_BTN),
                Scroll.to(MantenimientosAdmin.GRABAR_MMT_BTN),
                Click.on(MantenimientosAdmin.GRABAR_MMT_BTN)
        );
    }
}
