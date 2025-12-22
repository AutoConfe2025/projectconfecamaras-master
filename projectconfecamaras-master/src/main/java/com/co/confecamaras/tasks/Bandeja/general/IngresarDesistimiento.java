package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.revision_desistimientos.page.BOTON_VER_DESISTIMIENTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarDesistimiento implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_VER_DESISTIMIENTO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_VER_DESISTIMIENTO),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_EVIDENCIAS)
        );
    }

    public static IngresarDesistimiento Desistimiento(){
        return new IngresarDesistimiento();
    }
}
