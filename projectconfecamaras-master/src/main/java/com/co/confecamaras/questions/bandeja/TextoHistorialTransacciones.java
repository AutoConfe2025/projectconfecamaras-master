package com.co.confecamaras.questions.bandeja;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.Bandejas.HistorialYTransaccionesPage.LBL_HISTORIAL_TITULO;

public class TextoHistorialTransacciones implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(LBL_HISTORIAL_TITULO).answeredBy(actor);
    }
    public static TextoHistorialTransacciones es(){
        return new TextoHistorialTransacciones();
    }
}
