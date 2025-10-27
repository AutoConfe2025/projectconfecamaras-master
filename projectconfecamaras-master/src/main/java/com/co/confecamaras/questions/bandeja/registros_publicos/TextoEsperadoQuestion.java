package com.co.confecamaras.questions.bandeja.registros_publicos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;

public class TextoEsperadoQuestion implements Question<Boolean> {

    private Target elemento;
    private String texto;

    public TextoEsperadoQuestion(Target elemento, String texto) {
        this.elemento = elemento;
        this.texto = texto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean encontrado = false;
        try {
            String esperado = TextContent.of(elemento).answeredBy(actor);
            encontrado = esperado.contains(texto);
        } catch (Exception e) {
            encontrado = false;
        }
        return encontrado;
    }

    public static TextoEsperadoQuestion verificar(Target elemento, String texto) {
        return new TextoEsperadoQuestion(elemento, texto);
    }
}
