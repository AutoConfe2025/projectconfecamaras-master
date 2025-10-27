package com.co.confecamaras.questions.tableros;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.tableros.tableroSection.TITULO_INGRESO_TIPO_INGRESO;

public class TituloTableroCuatro implements Question<String> {

    public static TituloTableroCuatro esIgual() {
        return new TituloTableroCuatro();
    }

    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(TITULO_INGRESO_TIPO_INGRESO).answeredBy(actor);
    }

}
