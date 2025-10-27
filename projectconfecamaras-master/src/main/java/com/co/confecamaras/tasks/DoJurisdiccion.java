package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import com.co.confecamaras.userinterfaces.LoginSistema;
import com.co.confecamaras.userinterfaces.MantenimientoTres;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoJurisdiccion implements Task {

    private String cos;
    private String pri;


    public DoJurisdiccion(String cos, String pri) {
        this.cos = cos;
        this.pri = pri;
    }

    public static Performable jurisdiccion(String cos, String pri){
        return instrumented(DoJurisdiccion.class, cos, pri);
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept() );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInterrupted3Segundos.esperaConstante3(),
                Enter.theValue("Municipios Jurisdiccion").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                DoubleClick.on(MantenimientoTres.PUB_SLC).then(Enter.theValue(cos).into(MantenimientoTres.PUB_INPUT)),
                DoubleClick.on(MantenimientoTres.PRI_SLC).then(Enter.theValue(pri).into(MantenimientoTres.PRI_INPUT)),
                Click.on(MantenimientoTres.GRABAR_J_BTN),
                toAlert(),
                DoubleClick.on(MantenimientoTres.PUB_SLC).then(Clear.field(MantenimientoTres.PUB_INPUT)),
                DoubleClick.on(MantenimientoTres.PRI_SLC).then(Clear.field(MantenimientoTres.PRI_INPUT)),
                Click.on(MantenimientoTres.GRABAR_J_BTN),
                toAlert(),
                Click.on(MantenimientoTres.VER_J_BTN)
        );
    }

}
