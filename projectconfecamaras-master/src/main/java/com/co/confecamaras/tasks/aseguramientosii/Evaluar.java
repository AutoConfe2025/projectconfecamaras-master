package com.co.confecamaras.tasks.aseguramientosii;

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
import static com.co.confecamaras.userinterfaces.aseguramientosii.EvaluarVariablesSessionPage.EVALUAR_VARIABLES;
import static com.co.confecamaras.userinterfaces.aseguramientosii.VisorDeLogsPage.VISOR_DE_LOGS;
import static com.co.confecamaras.utils.aeguramientosii.EvaluarConstants.EVALUAR_VARIABLES_SESSION;

public class Evaluar  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(EVALUAR_VARIABLES_SESSION).into(TXT_BUSQUEDA_INPUT),
                Click.on(EVALUAR_VARIABLES)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente()
        );
    }

    public static Evaluar variablesSesion(){
        return Tasks.instrumented(Evaluar.class);
    }
}
