package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.ResumenCaja;
import com.co.confecamaras.userinterfaces.RevisarEfectos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RevisarCesacionEfectosQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean valRevisar = RevisarEfectos.VAL_VER.resolveFor(actor).isVisible();
        return valRevisar;
    }

    public static RevisarCesacionEfectosQuestion validacion(){
        return new RevisarCesacionEfectosQuestion();
    }
}
