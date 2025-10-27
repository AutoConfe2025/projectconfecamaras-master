package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitConstantTwo;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.userinterfaces.TablaNombreCortos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DriverTask;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.SELECCIONAR_OPT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoNombresCortos implements Task {

    public static Performable nombresCortos(){
        return instrumented(DoNombresCortos.class);
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept() );
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitSeconds.seconds(2),
                Enter.theValue("Tabla Nombres Cortos").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Click.on(TablaNombreCortos.OPC_SLC),
                Click.on(TablaNombreCortos.GRABAR_BTN),
                toAlert(),
                WaitConstantTwo.esperaConstante()
        );
    }
}
