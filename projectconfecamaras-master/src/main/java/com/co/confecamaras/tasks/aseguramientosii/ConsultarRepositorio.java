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
import static com.co.confecamaras.userinterfaces.aseguramientosii.AdministradorRepositorioImagnesPage.*;
import static com.co.confecamaras.userinterfaces.aseguramientosii.EvaluarVariablesSessionPage.EVALUAR_VARIABLES;
import static com.co.confecamaras.utils.aeguramientosii.EvaluarConstants.EVALUAR_VARIABLES_SESSION;
import static com.co.confecamaras.utils.aeguramientosii.RepositorioImagenesConstants.REPOSITORIO_IMAGANES_TEXTO;

public class ConsultarRepositorio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(REPOSITORIO_IMAGANES_TEXTO).into(TXT_BUSQUEDA_INPUT),
                Click.on(ADMINSTRADOR_IMAGENES)
        );
        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(DIRECTORIO_FORMATOS),
                Click.on(DIRECTORIO_FORMATOS),
                WaitInteractions.untilBeEnable(DESCARGA_FORMATO),
                Click.on(DESCARGA_FORMATO),
                WaitInteractions.untilBeEnable(TABLA_FORMATOS_IMAGENES)
        );
    }

    public static ConsultarRepositorio imagenes() {
        return Tasks.instrumented(ConsultarRepositorio.class);
    }
}
