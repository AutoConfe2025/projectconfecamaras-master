package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.administracion.MttoCodigoBarrasPage.ESTADO_ARCHIVADO;

public class ElTextoDelEstado implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(ESTADO_ARCHIVADO).answeredBy(actor);
    }

    public static ElTextoDelEstado es(){
        return new ElTextoDelEstado();
    }
}
