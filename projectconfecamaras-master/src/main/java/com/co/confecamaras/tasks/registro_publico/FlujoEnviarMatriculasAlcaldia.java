package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.SetMunicipioPorJS;
import com.co.confecamaras.utils.sikulli.SafeActions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.BOTON_CONTINUAR_IMAGEN;
import static com.co.confecamaras.userinterfaces.registros_publicos.EnvioInformacionAlcaldiasPage.LISTA_MUNICIPIO;
import static com.co.confecamaras.userinterfaces.sikuli.registro_publico.page.BOTON_CONTINUAR_IMAGEN_SIKULLI;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoEnviarMatriculasAlcaldia implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LISTA_MUNICIPIO, isPresent()).forNoMoreThan(10).seconds(),
                SetMunicipioPorJS.conValor(LISTA_MUNICIPIO.resolveFor(actor), "17001"),
                SafeActions.click(BOTON_CONTINUAR_IMAGEN, BOTON_CONTINUAR_IMAGEN_SIKULLI)
        );
    }

    public static FlujoEnviarMatriculasAlcaldia enviarMatriculaAlcaldia() {
        return new FlujoEnviarMatriculasAlcaldia();
    }
}
