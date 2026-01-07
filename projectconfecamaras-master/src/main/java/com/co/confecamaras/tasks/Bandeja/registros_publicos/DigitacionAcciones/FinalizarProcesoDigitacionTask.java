package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;


import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.junit.Assert;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage.*;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.BTN_ASIGNAR_ID;

public class FinalizarProcesoDigitacionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (actor.asksFor(ElementoElegible.para(DigitacionPage.LINK_FIN_DIGITACION))) {
            Reportes.reportEvent(Reportes.PASSED, "El registro puede ser eliminado");
            actor.attemptsTo(
                    Click.on(DigitacionPage.LINK_FIN_DIGITACION),
                    WaitInteractions.untilAppears(BOTON_CONTINUAR),
                    Click.on(DigitacionPage.BOTON_CONTINUAR),
                    WaitInteractions.untilAppears(SLC_ESTADO),
                    SelectFromOptions.byIndex(1).from(SLC_ESTADO),
                    Click.on(BTN_ASIGNAR_ID),
                    WaitInteractions.untilAppears(BTN_VOLVER),
                    Click.on(BTN_VOLVER)



            );
        }
        else {
            Reportes.reportEvent(Reportes.FAILED,"No se puede eliminar el registro");
            Assert.fail("No se puede eliminar el registro");
        }
    }

    public static FinalizarProcesoDigitacionTask finalizar(){
        return new FinalizarProcesoDigitacionTask();
    }
}
