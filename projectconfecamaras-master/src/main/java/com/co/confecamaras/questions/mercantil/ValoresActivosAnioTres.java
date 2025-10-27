package com.co.confecamaras.questions.mercantil;

import com.co.confecamaras.userinterfaces.mercantil.RenovacionESADLPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValoresActivosAnioTres implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(RenovacionESADLPage.TD_ANIO_TRES_RENOVADO_LIQUIDACION).answeredBy(actor);

    }

    public static ValoresActivosAnioTres es() {
        return new ValoresActivosAnioTres();
    }
}

