package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

public class DigitarCertificasTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(DigitacionPage.LINK_DIG_CERTIFICAS))){
            actor.attemptsTo(
                    Click.on(DigitacionPage.LINK_DIG_CERTIFICAS)
            );
            if (actor.asksFor(ElementoElegible.para(DigitacionPage.LINK_EDIT_CERTIFICAS.of("0020"))))
                actor.attemptsTo(
                        Click.on(DigitacionPage.LINK_EDIT_CERTIFICAS.of("0020")),
                        Switch.toFrame(0),
                        Enter.theValue("AUTOMATIZACION TEST").into(DigitacionPage.INP_NUEVA_INFORMACION),
                        Switch.toDefaultContext(),
                        LogEvent.recordevent(Reportes.INFO, "Nuevo texto ingresado: AUTOMATIZACION TEST"),
                        Click.on(DigitacionPage.BTN_GRABAR),
                        Click.on(DigitacionPage.BTN_VOLVER)
                );
            else actor.attemptsTo(LogEvent.recordevent(Reportes.WARNING,"No fue posible realizar la accion por completo"), Click.on(DigitacionPage.BTN_VOLVER));
        }
    }

    public static DigitarCertificasTask digitar() {
        return new DigitarCertificasTask();
    }
}
