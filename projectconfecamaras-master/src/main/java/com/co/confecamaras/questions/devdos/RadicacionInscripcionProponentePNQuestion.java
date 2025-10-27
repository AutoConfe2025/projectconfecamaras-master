package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CrudProponente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RadicacionInscripcionProponentePNQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valInscripcion = CrudProponente.VAL_RECIBO.resolveFor(actor).isVisible();
        return valInscripcion;
    }

    public static RadicacionInscripcionProponentePNQuestion validacion(){
        return new RadicacionInscripcionProponentePNQuestion();
    }
}
