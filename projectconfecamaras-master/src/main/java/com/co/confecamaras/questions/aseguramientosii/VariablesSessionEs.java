package com.co.confecamaras.questions.aseguramientosii;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.aseguramientosii.EvaluarVariablesSessionPage.VARIABLES_SESION;

public class VariablesSessionEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean variables = VARIABLES_SESION.resolveFor(actor).isVisible();
        return variables;
    }

    public static VariablesSessionEs visible(){
        return new VariablesSessionEs();
    }
}
