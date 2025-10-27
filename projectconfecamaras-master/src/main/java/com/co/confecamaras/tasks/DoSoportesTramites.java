package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.userinterfaces.SoporteTramites;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.SELECCIONAR_OPT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSoportesTramites implements Task {

    private String obs;

    public DoSoportesTramites(String obs) {
        this.obs = obs;
    }

    public static Performable soportesTramites(String obs){
        return instrumented(DoSoportesTramites.class, obs);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue("Soportes Tramites").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Click.on(SoporteTramites.EDITAR_BTN),
                Enter.theValue(obs).into(SoporteTramites.OBS_TXT),
                Click.on(SoporteTramites.GRABAR_BTN),
                Click.on(SoporteTramites.EDITAR_BTN),
                Scroll.to(SoporteTramites.OBS_TXT)
        );
    }
}
