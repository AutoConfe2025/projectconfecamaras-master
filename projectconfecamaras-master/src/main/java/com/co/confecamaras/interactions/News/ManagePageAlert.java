package com.co.confecamaras.interactions.News;

import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


public class ManagePageAlert implements Interaction {
    public final Target ALERTA;
    public final Target BOTON_CERRAR;

    public ManagePageAlert(Target ALERTA, Target BOTON_CERRAR) {
        this.ALERTA = ALERTA;
        this.BOTON_CERRAR = BOTON_CERRAR;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String alerta = null;
        if (actor.asksFor(ElementoElegible.para(ALERTA))) {
            alerta = ALERTA.resolveFor(actor).getText();
            actor.attemptsTo(LogEvent.recordevent(Reportes.WARNING, alerta), Click.on(BOTON_CERRAR));
            //Assert.fail(alerta);
        }
    }

    public static ManagePageAlert accept(Target alerta, Target cerrar) {
        return Tasks.instrumented(ManagePageAlert.class, alerta, cerrar);
    }
}
