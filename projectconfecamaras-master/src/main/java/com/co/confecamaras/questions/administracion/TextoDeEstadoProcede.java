package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.administracion.MttoCodigoBarrasPage.ESTADO_ARCHIVADO;
import static com.co.confecamaras.userinterfaces.administracion.MttoDevolucionesPage.VALOR_ESTADO_ORIGINAL;

public class TextoDeEstadoProcede implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(VALOR_ESTADO_ORIGINAL).answeredBy(actor);
    }

    public static TextoDeEstadoProcede es(){
        return new TextoDeEstadoProcede();
    }
}
