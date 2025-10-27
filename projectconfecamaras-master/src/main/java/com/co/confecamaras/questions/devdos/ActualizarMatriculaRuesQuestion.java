package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.AbrirCaja;
import com.co.confecamaras.userinterfaces.Actualizar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ActualizarMatriculaRuesQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean actualizarVal = Actualizar.VALIDACION_MATRICULA.resolveFor(actor).isVisible();
        return actualizarVal;
    }

    public static ActualizarMatriculaRuesQuestion validacion(){
        return new ActualizarMatriculaRuesQuestion();
    }
}
