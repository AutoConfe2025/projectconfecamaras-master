package com.co.confecamaras.questions.tableros;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.tableros.tableroSection.TITULO_COMPARATIVO_INGRESO_POR_GRUPO_INGRESO;


public class TituloTableroCinco implements Question<String> {

    public static TituloTableroCinco esIgual(){
        return new TituloTableroCinco();
    }
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(TITULO_COMPARATIVO_INGRESO_POR_GRUPO_INGRESO).answeredBy(actor);
    }
}
