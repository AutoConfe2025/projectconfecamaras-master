package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.Actualizar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ActualizarProponentesRuesQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean actualizarVal = Actualizar.VALIDACION_PROPONENTE.resolveFor(actor).isVisible();
        return actualizarVal;
    }

    public static ActualizarProponentesRuesQuestion validacion(){
        return new ActualizarProponentesRuesQuestion();
    }
}
