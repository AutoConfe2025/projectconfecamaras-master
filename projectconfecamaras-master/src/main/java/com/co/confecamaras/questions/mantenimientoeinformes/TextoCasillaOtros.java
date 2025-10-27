package com.co.confecamaras.questions.mantenimientoeinformes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.MantenimientoServiciosPage.TEXTO_OTROS;

public class TextoCasillaOtros implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(TEXTO_OTROS).answeredBy(actor);
    }

    public static TextoCasillaOtros es(){
        return new TextoCasillaOtros();
    }
}
