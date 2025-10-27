package com.co.confecamaras.tasks.administracion;

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
import static com.co.confecamaras.userinterfaces.administracion.KillProcessPage.*;
import static com.co.confecamaras.userinterfaces.administracion.MaestroClasesVinculosPage.MAESTRO_CLASES_VINCULOS;
import static com.co.confecamaras.utils.administracion.KillProcessConstants.KILL_PROCESS;
import static com.co.confecamaras.utils.administracion.KillProcessConstants.VALOR_FILTRAR;
import static com.co.confecamaras.utils.administracion.MaestroClasesVinculosConstants.BUSQUEDA_MAESTRO_CLASES_VINCULOS;

public class Kill implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(KILL_PROCESS).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BUSQUEDA_KILL_PROCESS),
                Click.on(BUSQUEDA_KILL_PROCESS)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_BSUQUEDA),
                Enter.theValue(VALOR_FILTRAR).into(INPUT_BSUQUEDA),
                WaitInteractions.untilBeEnable(BTN_LIBERAR),
                Click.on(BTN_LIBERAR),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_LIBERAR_PROCESO),
                Click.on(BTN_ACEPTAR_LIBERAR_PROCESO)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_BSUQUEDA),
                Enter.theValue(VALOR_FILTRAR).into(INPUT_BSUQUEDA)
        );
    }

    public static Kill process(){
        return Tasks.instrumented(Kill.class);
    }
}
