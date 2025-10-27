package com.co.confecamaras.questions.mercantil;

import com.co.confecamaras.userinterfaces.mercantil.RenovacionESADLPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValoresActivosAnioCuatro implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(RenovacionESADLPage.TD_ANIO_CUATRO_RENOVADO_LIQUIDACION).answeredBy(actor);

    }

    public static ValoresActivosAnioCuatro es() {
        return new ValoresActivosAnioCuatro();
    }
}
