package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CrudProponente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RadicacionCancelacionProponenteQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valCancelacion = CrudProponente.VAL_DESCARGA.resolveFor(actor).isVisible();
        return valCancelacion;
    }

    public static RadicacionCancelacionProponenteQuestion validacion(){
        return new RadicacionCancelacionProponenteQuestion();
    }
}
