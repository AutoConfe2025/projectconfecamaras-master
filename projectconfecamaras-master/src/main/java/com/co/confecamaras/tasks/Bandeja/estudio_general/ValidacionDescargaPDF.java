package com.co.confecamaras.tasks.Bandeja.estudio_general;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.BOTON_VER_PDF;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.BOTON_VER_RUTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Slf4j
@AllArgsConstructor
public class ValidacionDescargaPDF implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_VER_RUTA, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_VER_RUTA),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(BOTON_VER_PDF, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(BOTON_VER_PDF),
                Click.on(BOTON_VER_PDF),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_EVIDENCIAS)
        );
    }

    public static ValidacionDescargaPDF validaDescarga() {
        return new ValidacionDescargaPDF();
    }
}
