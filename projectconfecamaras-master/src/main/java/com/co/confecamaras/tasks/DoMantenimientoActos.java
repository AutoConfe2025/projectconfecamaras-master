package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MantenimientoTres;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoActos implements Task {

    private String libro;
    private String libroDos;
    private String libroTres;

    public DoMantenimientoActos(String libro, String libroDos, String libroTres) {
        this.libro = libro;
        this.libroDos = libroDos;
        this.libroTres = libroTres;
    }

    public static Performable mantenimientoActos(String libro, String libroDos, String libroTres){
        return instrumented(DoMantenimientoActos.class, libro, libroDos, libroTres);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Actos").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_DOS_OPT),
                Switch.toNewWindow(),
                Click.on(MantenimientoTres.RE_SLC),
                Click.on(MantenimientoTres.GRABAR_A_BTN),
                SelectFromOptions.byVisibleText(libro).from(MantenimientoTres.LIBRO_SLC),
                WaitConstant.esperaConstante(),
                SelectFromOptions.byVisibleText(libroDos).from(MantenimientoTres.LIBRO_SLC),
                WaitConstant.esperaConstante(),
                SelectFromOptions.byVisibleText(libroTres).from(MantenimientoTres.LIBRO_SLC),
                WaitConstant.esperaConstante()
        );
    }
}
