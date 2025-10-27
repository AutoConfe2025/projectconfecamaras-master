package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.junit.Assert;

public class FinalizarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (actor.asksFor(ElementoElegible.para(DigitacionPage.LINK_FIN_DIGITACION)))
            Reportes.reportEvent(Reportes.PASSED,"El registro puede ser eliminado");
        else {
            Reportes.reportEvent(Reportes.FAILED,"No se puede eliminar el registro");
            Assert.fail("No se puede eliminar el registro");
        }
    }

    public static FinalizarTask finalizar(){
        return new FinalizarTask();
    }
}
