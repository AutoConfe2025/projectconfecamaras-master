package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.junit.Assert;

public class FinalizarDigitacionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (actor.asksFor(ElementoElegible.para(DigitacionPage.LINK_FIN_DIGITACION))) {
            Reportes.reportEvent(Reportes.PASSED, "El registro puede ser eliminado");
            actor.attemptsTo(
                    Click.on(DigitacionPage.LINK_FIN_DIGITACION),
                    WaitSeconds.seconds(2),
                    Click.on(DigitacionPage.BTN_VOLVER)

            );
        }
        else {
            Reportes.reportEvent(Reportes.FAILED,"No se puede eliminar el registro");
            Assert.fail("No se puede eliminar el registro");
        }
    }

    public static FinalizarDigitacionTask finalizar(){
        return new FinalizarDigitacionTask();
    }
}
