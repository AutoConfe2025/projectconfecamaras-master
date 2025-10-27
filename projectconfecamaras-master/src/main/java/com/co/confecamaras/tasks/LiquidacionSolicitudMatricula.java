package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.LiquidacionSolicitudMatriculaUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LiquidacionSolicitudMatricula implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(PROGRESO_ESPERA),
                WaitInteractions.untilBeEnable(BTN_CERRAR_LIQUIDACION),
                Click.on(BTN_CERRAR_LIQUIDACION)
        );
    }

    public static LiquidacionSolicitudMatricula enConfecamaraSII(){
        return instrumented(LiquidacionSolicitudMatricula.class);
    }
}
