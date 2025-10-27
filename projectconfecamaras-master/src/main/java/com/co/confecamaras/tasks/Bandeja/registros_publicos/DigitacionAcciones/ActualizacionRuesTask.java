package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.interactions.News.ContainsText;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ActualizacionRuesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(DigitacionPage.LINK_ACT_RUES))){
            actor.attemptsTo(
                    Click.on(DigitacionPage.LINK_ACT_RUES),
                    Click.on(DigitacionPage.BTN_ACT_RUES_V2),
                    WaitSeconds.seconds(1),
                    ContainsText.contains(DigitacionPage.TXT_INFO, "\"codigo_error\": \"\""),
                    Click.on(DigitacionPage.BTN_VOLVER)
            );
        }
    }

    public static ActualizacionRuesTask actualizar() {
        return new ActualizacionRuesTask();
    }
}
