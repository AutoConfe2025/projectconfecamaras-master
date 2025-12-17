package com.co.confecamaras.tasks.Bandeja.oficios_requerimientos;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.BOTON_VER_PDF;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.BOTON_VER_RUTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionRutas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_VER_RUTA),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(BOTON_VER_PDF, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(BOTON_VER_PDF),
                Click.on(BOTON_VER_PDF),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)
        );
    }

    public static ValidacionRutas validaBotonRutas(){
        return new ValidacionRutas();
    }
}
