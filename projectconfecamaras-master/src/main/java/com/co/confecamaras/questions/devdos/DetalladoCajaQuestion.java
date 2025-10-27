package com.co.confecamaras.questions.devdos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.DetalladoCaja.*;

public class DetalladoCajaQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_DETALLADO_CAJA.resolveFor(actor).isVisible();
    }

    public static DetalladoCajaQuestion validacion(){
        return new DetalladoCajaQuestion();
    }
}
