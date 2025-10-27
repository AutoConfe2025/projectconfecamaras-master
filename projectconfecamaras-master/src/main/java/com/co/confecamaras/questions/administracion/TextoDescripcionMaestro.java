package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.administracion.MaestroClasesVinculosPage.TXT_DESCRIPCION;

public class TextoDescripcionMaestro implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(TXT_DESCRIPCION).answeredBy(actor);
    }
    public static TextoDescripcionMaestro es(){
        return new TextoDescripcionMaestro();
    }
}
