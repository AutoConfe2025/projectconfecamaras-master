package com.co.confecamaras.tasks.Bandeja.estudio_general;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.ValidarDescargaDeArchivo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.Pagina_Princial.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Slf4j
@AllArgsConstructor
public class ValidacionDescargaPDF implements Task {

    private final String tipoValidacion;
    private final String textoEsperado;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_VER_RUTA),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(BOTON_VER_PDF, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(BOTON_VER_PDF),
                Click.on(BOTON_VER_PDF),
                ValidarDescargaDeArchivo.conParametros(tipoValidacion, textoEsperado)
        );
    }

    public static ValidacionDescargaPDF validaDescarga(String tipoValidacion, String textoEsperado) {
        return Tasks.instrumented(ValidacionDescargaPDF.class, tipoValidacion, textoEsperado);
    }
}
