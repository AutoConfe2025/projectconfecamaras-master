package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.userinterfaces.MantenimientoTresAdmin;
import com.co.confecamaras.userinterfaces.MenuSistema;
import io.cucumber.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.Random;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoFirmasDigitales implements Task {

    int min = 10000;
    int max = 99999;
    int randomNum = (int)(Math.random() * (max - min + 1)) + min;

    /*public void numeros{
        Random claseRandom = new Random();
        claseRandom.nextInt(7);
    }*/

    public static Performable firmasDigitales(){
        return instrumented(DoFirmasDigitales.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue("Firmas digitales").into(MenuSistema.BUSQUEDA_INPUT),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Clear.field(MantenimientoTresAdmin.PUBLIC_KEY_INPUT),
                Enter.theValue(Math.random() * 5 + "qa").into(MantenimientoTresAdmin.PUBLIC_KEY_INPUT),
                Clear.field(MantenimientoTresAdmin.TXT_PRIVATE_KEY),
                Enter.theValue(Math.random() * 2 + "qa").into(MantenimientoTresAdmin.TXT_PRIVATE_KEY),
                Clear.field(MantenimientoTresAdmin.TXT_CLAVE),
                Enter.theValue(randomNum + "").into(MantenimientoTresAdmin.TXT_CLAVE),
                Enter.theValue("22012050").into(MantenimientoTresAdmin.TXT_VENCIMIENTO),
                Click.on(MantenimientoTresAdmin.CONTINUAR_FD_BTN),
                WaitConstant.esperaConstante()
        );
    }
}
