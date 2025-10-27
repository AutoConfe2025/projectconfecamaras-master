package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

public class RevisarExpedientesTask implements Task {
    private final String codigo_barras;

    public RevisarExpedientesTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(DigitacionPage.LINK_REV_EXPEDIENTES))){
            actor.attemptsTo(
                    Click.on(DigitacionPage.LINK_REV_EXPEDIENTES),
                    ChangeToLastWindow.changeToLastWindow(),
                    Scroll.to(DigitacionPage.BTN_DOC_TRAMITE),
                    JavaScriptClick.on(DigitacionPage.BTN_DOC_TRAMITE),
                    WaitSeconds.seconds(1),
                    ContainsText.contains(DigitacionPage.TABLE_TRAMITE,codigo_barras),
                    WaitSeconds.seconds(1),
                    CloseCurrentWindowAndSwitchBack.closeAndSwitchBack()
            );
        }
    }

    public static RevisarExpedientesTask revisar(String codigo_barras) {
        return new RevisarExpedientesTask(codigo_barras);
    }
}
