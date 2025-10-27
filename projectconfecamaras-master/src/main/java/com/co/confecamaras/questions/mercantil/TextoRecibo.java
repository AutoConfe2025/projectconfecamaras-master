package com.co.confecamaras.questions.mercantil;

import com.co.confecamaras.tasks.mercantil.LiquidacionRenovacionLey;
import com.co.confecamaras.userinterfaces.mercantil.LiquidacionRenovacionPage;
import com.co.confecamaras.userinterfaces.mercantil.RenovacionESADLPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class TextoRecibo implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(LiquidacionRenovacionPage.TEXTO_DATOS_GENERALES_RECIBO).answeredBy(actor);
    }

    public static TextoRecibo es (){
        return new TextoRecibo();
    }
}
