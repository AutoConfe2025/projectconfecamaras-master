package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.interactions.News.BackPage;
import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage.LINK_SOLICITAR_NIT;

public class SolicitudNitTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(LINK_SOLICITAR_NIT))){
            actor.attemptsTo(
                    Click.on(LINK_SOLICITAR_NIT),
                    GetTextOfElement.de(DigitacionPage.TXT_INFO),
                    BackPage.back()
            );
        }
    }
    public static SolicitudNitTask solicitar(){
        return new SolicitudNitTask();
    }
}
