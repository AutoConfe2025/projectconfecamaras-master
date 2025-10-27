package com.co.confecamaras.questions.mercantil;

import com.co.confecamaras.userinterfaces.mercantil.RenovacionESADLPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValoresActivosAnioUno implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(RenovacionESADLPage.TD_ANIO_A_PARTIR_RENOVADO_LIQUIDACION).answeredBy(actor);

    }

    public static ValoresActivosAnioUno es (){
        return new ValoresActivosAnioUno();
    }
}
