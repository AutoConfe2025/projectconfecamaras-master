package com.co.confecamaras.tasks.mantenimientoeinformes;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.MantenimientoPucJspPage.BTN_MANTENIMIENTO_PUC;
import static com.co.confecamaras.utils.mantenimientoeinformes.MantenimientoPucJspConstants.BUSQUEDA_MANTENIMIENTO_PUC_JSP;

public class MantenimientoPuc implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_MANTENIMIENTO_PUC_JSP).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BTN_MANTENIMIENTO_PUC),
                Click.on(BTN_MANTENIMIENTO_PUC)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente()
        );
    }

    public static MantenimientoPuc consultar(){
        return Tasks.instrumented(MantenimientoPuc.class);
    }
}
