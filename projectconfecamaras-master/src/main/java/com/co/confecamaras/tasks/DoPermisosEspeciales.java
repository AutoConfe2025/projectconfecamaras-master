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

public class DoPermisosEspeciales implements Task {

    private final String descrip;
    private final String numero = "1";

    public DoPermisosEspeciales(String descrip) {
        this.descrip = descrip;
    }

    public static Performable permisosEspeciales(String descrip){
        return instrumented(DoPermisosEspeciales.class, descrip);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Permisos especiales").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Click.on(MantenimientoTresAdmin.EDITAR_PE_BTN),
                Enter.theValue(numero).into(MantenimientoTresAdmin.DESCRIPCION_PE_INPUT),
                Click.on(MantenimientoTresAdmin.GRABAR_PE_BTN),
                WaitConstant.esperaConstante(),
                Click.on(MantenimientoTresAdmin.EDITAR_PE_BTN),
                Clear.field(MantenimientoTresAdmin.DESCRIPCION_PE_INPUT).then(Enter.theValue(descrip).into(MantenimientoTresAdmin.DESCRIPCION_PE_INPUT)),
                Click.on(MantenimientoTresAdmin.GRABAR_PE_BTN),
                WaitConstant.esperaConstante()
        );
    }
}
