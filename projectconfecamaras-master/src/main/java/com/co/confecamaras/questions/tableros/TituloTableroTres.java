package com.co.confecamaras.questions.tableros;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.tableros.tableroSection.TOTAL_INGRESOS_PRESOPUESTO;

public class TituloTableroTres implements Question<String> {

    public static TituloTableroTres esIgual(){
        return new TituloTableroTres();
    }
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(TOTAL_INGRESOS_PRESOPUESTO).answeredBy(actor);
    }
}
