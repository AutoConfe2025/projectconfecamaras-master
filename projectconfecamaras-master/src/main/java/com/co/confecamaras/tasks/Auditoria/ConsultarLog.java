package com.co.confecamaras.tasks.Auditoria;

import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.auditoria.LogCambioClavePage.*;

public class ConsultarLog implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_AUDITORIAS),
                Scroll.to(BTN_AUDITORIAS),
                JavaScriptClick.on(BTN_AUDITORIAS),
                WaitInteractions.untilBeEnable(BTN_AUDITORIAS_GENERALES),
                JavaScriptClick.on(BTN_AUDITORIAS_GENERALES),
                WaitInteractions.untilBeEnable(BTN_LOG_CAMBIO_CLAVE),
                JavaScriptClick.on(BTN_LOG_CAMBIO_CLAVE)
        );

        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(CALENDARIO),
                Click.on(CALENDARIO),
                WaitInteractions.untilBeEnable(BTN_FECHA_ATRAS),
                Click.on(BTN_FECHA_ATRAS),
                WaitInteractions.untilBeEnable(PRIMER_FECHA),
                Click.on(PRIMER_FECHA),
                WaitInteractions.untilBeEnable(SEGUNDA_FECHA),
                Click.on(SEGUNDA_FECHA),
                WaitInteractions.untilBeEnable(BTN_APLICAR),
                Click.on(BTN_APLICAR),
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_LOG),
                Click.on(BTN_CONSULTAR_LOG),
                WaitInteractions.untilBeEnable(BTN_EXPORTAR),
                Click.on(BTN_EXPORTAR)
//                WaitInteractions.untilBeEnable(BTN_CONSULTAR_LOG),
//                Click.on(BTN_CONSULTAR_LOG)
        );
    }

    public static ConsultarLog cambioDeClave() {
        return Tasks.instrumented(ConsultarLog.class);
    }
}
