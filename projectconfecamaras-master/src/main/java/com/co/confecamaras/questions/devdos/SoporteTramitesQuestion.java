package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.SoporteTramites;
import com.co.confecamaras.userinterfaces.TablaNombreCortos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SoporteTramitesQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valSop = SoporteTramites.VALIDATION_OBS.resolveFor(actor).isVisible();
        return valSop;
    }

    public static SoporteTramitesQuestion validacion(){
        return new SoporteTramitesQuestion();
    }
}
