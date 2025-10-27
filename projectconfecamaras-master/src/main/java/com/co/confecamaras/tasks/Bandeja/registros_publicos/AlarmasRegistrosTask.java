package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AlarmasRegistrosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class AlarmasRegistrosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(AlarmasRegistrosPage.MSG_DETECTOR_ALARMAS),
                GetTextOfElement.de(AlarmasRegistrosPage.MSG_DETECTOR_ALARMAS),
                Click.on(AlarmasRegistrosPage.BTN_SINCRONIZAR),
                WaitSeconds.seconds(1)
        );
    }

    public static AlarmasRegistrosTask alarmasRegistros() {
        return Tasks.instrumented(AlarmasRegistrosTask.class);
    }

}
