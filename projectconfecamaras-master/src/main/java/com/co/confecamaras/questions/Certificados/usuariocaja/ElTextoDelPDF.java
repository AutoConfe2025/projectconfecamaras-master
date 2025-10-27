package com.co.confecamaras.questions.Certificados.usuariocaja;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElTextoDelPDF implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return actor.recall("textoPDF");
    }
    public static ElTextoDelPDF es() {
        return new ElTextoDelPDF();
    }
}
