package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MantenimientoTresAdmin;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoUsuariosWs implements Task {

    private final String clave;
    private final String numero = "1";

    public DoMantenimientoUsuariosWs(String clave) {
        this.clave = clave;
    }

    public static Performable usuariosWs(String clave){
        return instrumented(DoMantenimientoUsuariosWs.class, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Usuarios Ws").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Click.on(MantenimientoTresAdmin.EDITAR_BTN),
                Enter.theValue(numero).into(MantenimientoTresAdmin.CLAVE_INPUT),
                Click.on(MantenimientoTresAdmin.GUARDAR_BTN),
                WaitConstant.esperaConstante(),
                Click.on(MantenimientoTresAdmin.EDITAR_BTN),
                Clear.field(MantenimientoTresAdmin.CLAVE_INPUT).then(Enter.theValue(clave).into(MantenimientoTresAdmin.CLAVE_INPUT)),
                Click.on(MantenimientoTresAdmin.GUARDAR_BTN),
                WaitConstant.esperaConstante()
        );
    }
}
