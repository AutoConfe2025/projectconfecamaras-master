package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage.LINK_INFO_FINANCIERA;

public class DigitarFinancieraTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(LINK_INFO_FINANCIERA))){
            actor.attemptsTo(
                    Click.on(LINK_INFO_FINANCIERA),
                    Click.on(DigitacionPage.LINK_NUEVO_REGISTRO),
                    Enter.theValue("2024").into(DigitacionPage.INP_ANYO),
                    Enter.theValue("10122024").into(DigitacionPage.INP_FECHA),
                    Enter.theValue("1").into(DigitacionPage.INP_PERSONAL),
                    Enter.theValue("310000").into(DigitacionPage.INP_ACT_CORRIENTE),
                    Enter.theValue("310000").into(DigitacionPage.INP_ACT_TOTAL),
                    Enter.theValue("310000").into(DigitacionPage.INP_PAT_NETO),
                    Enter.theValue("310000").into(DigitacionPage.INP_PASIV_PATRIM),
                    Enter.theValue("310000").into(DigitacionPage.INP_INGR_OPERACIONAL),
                    Click.on(DigitacionPage.BTN_GRABAR),
                    Click.on(DigitacionPage.BTN_VOLVER)
            );
        }
    }

    public static DigitarFinancieraTask digitar() {
        return new DigitarFinancieraTask();
    }
}
