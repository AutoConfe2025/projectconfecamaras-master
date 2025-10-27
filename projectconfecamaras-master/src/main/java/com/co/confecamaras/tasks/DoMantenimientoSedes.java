package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.userinterfaces.MantenimientoTres;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.BUSQUEDA_INPUT_1;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoSedes implements Task {

    private String dup;
    private String dupDos;

    public DoMantenimientoSedes(String dup, String dupDos) {
        this.dup = dup;
        this.dupDos = dupDos;
    }

    public static Performable mantenimientoSedes(String dup, String dupDos){
        return instrumented(DoMantenimientoSedes.class, dup, dupDos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilAppears(BUSQUEDA_INPUT_1),
                Enter.theValue("Sedes").into(MenuSistema.BUSQUEDA_INPUT),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(MenuSistema.SELECCIONAR_DOS_OPT),
                Switch.toNewWindow(),
                DoubleClick.on(MantenimientoTres.EDITAR_S_TD),
                Clear.field(MantenimientoTres.EDITAR_S_INPUT).then(Enter.theValue(dupDos).into(MantenimientoTres.EDITAR_S_INPUT)),
                DoubleClick.on(MantenimientoTres.EDITAR_S_DOS_TD),
                Clear.field(MantenimientoTres.EDITAR_S_DOS_INPUT).then(Enter.theValue(dup).into(MantenimientoTres.EDITAR_S_DOS_INPUT)),
                Click.on(MantenimientoTres.GRABAR_S_BTN),
                DoubleClick.on(MantenimientoTres.EDITAR_S_TD),
                Clear.field(MantenimientoTres.EDITAR_S_INPUT).then(Enter.theValue(dup).into(MantenimientoTres.EDITAR_S_INPUT)),
                DoubleClick.on(MantenimientoTres.EDITAR_S_DOS_TD),
                Clear.field(MantenimientoTres.EDITAR_S_DOS_INPUT).then(Enter.theValue(dupDos).into(MantenimientoTres.EDITAR_S_DOS_INPUT)),
                Click.on(MantenimientoTres.GRABAR_S_BTN)
        );
    }
}
