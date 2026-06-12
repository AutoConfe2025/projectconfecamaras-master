package com.co.confecamaras.questions.actualizacion_datos;

import com.co.confecamaras.questions.bandeja.BandejaPonalTexto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.actualizacion_datos.ActualizacionMutacionCajaPage.VALIDA_TEXTO_FINAL;

public class ValidaTextoFinal implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(VALIDA_TEXTO_FINAL).answeredBy(actor);
    }

    public static ValidaTextoFinal validacionFinal() {
        return new ValidaTextoFinal();
    }
}

