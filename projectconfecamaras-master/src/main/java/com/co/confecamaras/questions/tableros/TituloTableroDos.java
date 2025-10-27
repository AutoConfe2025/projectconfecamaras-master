package com.co.confecamaras.questions.tableros;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.tableros.tableroSection.TITULO_MATRICULADOS_METAS;

public class TituloTableroDos implements Question<String> {

    public static TituloTableroDos esIgual(){
        return new TituloTableroDos();
    }
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(TITULO_MATRICULADOS_METAS).answeredBy(actor);
    }
}
