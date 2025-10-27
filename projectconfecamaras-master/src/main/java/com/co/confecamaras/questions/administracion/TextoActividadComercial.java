package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.administracion.MaestroCiiusPage.TEXTO_ACTIVIDAD_COMERCIAL;

public class TextoActividadComercial implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(TEXTO_ACTIVIDAD_COMERCIAL).answeredBy(actor);
    }

    public static TextoActividadComercial es(){
        return new TextoActividadComercial();
    }
}
