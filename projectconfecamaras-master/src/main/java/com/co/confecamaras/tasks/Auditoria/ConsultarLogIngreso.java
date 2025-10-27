package com.co.confecamaras.tasks.Auditoria;

import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.auditoria.LogCambioClavePage.BTN_AUDITORIAS;
import static com.co.confecamaras.userinterfaces.auditoria.LogCambioClavePage.BTN_AUDITORIAS_GENERALES;
import static com.co.confecamaras.userinterfaces.auditoria.LogIngresoPage.*;
import static com.co.confecamaras.utils.LogIngresoConstants.FECHA_LOG;

public class ConsultarLogIngreso implements Task {
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
                WaitInteractions.untilBeEnable(BTN_LOG_INGRESO),
                JavaScriptClick.on(BTN_LOG_INGRESO),
                ModalLoader.modalLoader()
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(CALENDARIO_LOG_INGRESO),
                Enter.theValue(FECHA_LOG).into(CALENDARIO_LOG_INGRESO),
                WaitInteractions.untilBeEnable(SELECT_TIPO_USUARIO),
                SelectFromOptions.byValue("E").from(SELECT_TIPO_USUARIO),
                WaitInteractions.untilBeEnable(BTN_CONSULT),
                Click.on(BTN_CONSULT),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_DESCARGAR_LOG),
                Click.on(BTN_DESCARGAR_LOG)
        );

    }

    public static ConsultarLogIngreso SII3() {
        return Tasks.instrumented(ConsultarLogIngreso.class);
    }
}
