package com.co.confecamaras.tasks.aseguramientosii;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.aseguramientosii.InventarioScriptsPage.INVENTARIO_SCRIPTS;
import static com.co.confecamaras.utils.aeguramientosii.InventarioScriptsContants.INVENTARIO_SCRIPTS_BUSQUEDA;

public class Inventario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(INVENTARIO_SCRIPTS_BUSQUEDA).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(INVENTARIO_SCRIPTS),
                JavaScriptClick.on(INVENTARIO_SCRIPTS)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente()
        );
    }
    public static Inventario Scripts(){
        return Tasks.instrumented(Inventario.class);
    }
}
