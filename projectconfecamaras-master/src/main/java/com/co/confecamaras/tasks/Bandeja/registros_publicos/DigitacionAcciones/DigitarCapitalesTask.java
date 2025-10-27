package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage.LINK_DIG_CAPITALES;

public class DigitarCapitalesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(LINK_DIG_CAPITALES))){
            actor.attemptsTo(
                    Click.on(LINK_DIG_CAPITALES),
                    Click.on(DigitacionPage.LINK_NUEVO_REGISTRO),
                    Enter.theValue("2024").into(DigitacionPage.INP_ANYO),
                    Enter.theValue("10122024").into(DigitacionPage.INP_FECHA),
                    Click.on(DigitacionPage.BTN_GRABAR),
                    Click.on(DigitacionPage.BTN_VOLVER)
            );
        }
    }
    public static DigitarCapitalesTask digitar(){
        return new DigitarCapitalesTask();
    }
}
