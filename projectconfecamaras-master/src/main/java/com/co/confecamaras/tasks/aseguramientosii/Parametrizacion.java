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
import static com.co.confecamaras.userinterfaces.aseguramientosii.ParametrizaciónBatchPage.*;
import static com.co.confecamaras.utils.aeguramientosii.InventarioScriptsContants.INVENTARIO_SCRIPTS_BUSQUEDA;
import static com.co.confecamaras.utils.aeguramientosii.ParametrizacionConstants.PROCESOS_ENTRADA_BATCH;

public class Parametrizacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(PROCESOS_ENTRADA_BATCH).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(PROCESOS_BATCH),
                JavaScriptClick.on(PROCESOS_BATCH)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(BTN_EDITAR_PROCESO_BATCH),
                Click.on(BTN_EDITAR_PROCESO_BATCH),
                WaitInteractions.untilBeEnable(BTN_GRABAR_PROCESO),
                Click.on(BTN_GRABAR_PROCESO)
        );
    }

    public static Parametrizacion procesosBatch() {
        return Tasks.instrumented(Parametrizacion.class);
    }
}
