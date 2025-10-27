package com.co.confecamaras.tasks.aseguramientosii;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.aseguramientosii.ExportarEstructuraPage.EXPORTAR_ESTRUCTURA;
import static com.co.confecamaras.userinterfaces.aseguramientosii.VisorDeLogsPage.*;
import static com.co.confecamaras.utils.aeguramientosii.VisualizarConstants.VISOR_DE_LOGS_;

public class Visualizar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(VISOR_DE_LOGS_).into(TXT_BUSQUEDA_INPUT),
                Click.on(VISOR_DE_LOGS)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(SELECT_TIPO_LOG),
                SelectFromOptions.byValue("0").from(SELECT_TIPO_LOG),
                WaitInteractions.untilBeEnable(BTN_VER_LOGS),
                Click.on(BTN_VER_LOGS)
        );
    }

    public static Visualizar logs(){
        return Tasks.instrumented(Visualizar.class);
    }
}
