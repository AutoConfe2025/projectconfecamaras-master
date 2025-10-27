package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CrudProponente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RenovacionMatriculaPNRenovadaQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valRen = CrudProponente.VAL_DESCARGA.resolveFor(actor).isVisible();
        return valRen;
    }

    public static RenovacionMatriculaPNRenovadaQuestion validacion(){
        return new RenovacionMatriculaPNRenovadaQuestion();
    }
}
