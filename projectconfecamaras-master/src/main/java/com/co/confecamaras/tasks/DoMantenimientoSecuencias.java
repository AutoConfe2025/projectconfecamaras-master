package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
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

public class DoMantenimientoSecuencias implements Task {

    private final String valorOrig;
    private final String valorModf;

    public DoMantenimientoSecuencias(String valorModf, String valorOrig ) {
        this.valorOrig = valorOrig;
        this.valorModf = valorModf;
    }

    public static Performable mantenimientoSecuencias(String valorModf, String valorOrig){
        return instrumented(DoMantenimientoSecuencias.class, valorModf, valorOrig);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Secuencias").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                DoubleClick.on(MantenimientoDosAdmin.ID_BTN),
                Click.on(MantenimientoDosAdmin.REGISTRO_SLC),
                Click.on(MantenimientoDosAdmin.REGISTRO_MODF_INPUT),
                DoubleClick.on(MantenimientoDosAdmin.REGISTRO_MODF_INPUT),
                Clear.field(MantenimientoDosAdmin.REGISTRO_MODF_INPUT_DOS).then(Enter.theValue(valorModf).into(MantenimientoDosAdmin.REGISTRO_MODF_INPUT_DOS)),
                Click.on(MantenimientoDosAdmin.GRABAR_BTN),
                WaitConstant.esperaConstante(),
                DoubleClick.on(MantenimientoDosAdmin.ID_BTN),
                Click.on(MantenimientoDosAdmin.REGISTRO_SLC),
                DoubleClick.on(MantenimientoDosAdmin.REGISTRO_MODF_INPUT),
                Clear.field(MantenimientoDosAdmin.REGISTRO_MODF_INPUT_DOS).then(Enter.theValue(valorOrig).into(MantenimientoDosAdmin.REGISTRO_MODF_INPUT_DOS)),
                Click.on(MantenimientoDosAdmin.GRABAR_BTN)
        );
    }

}