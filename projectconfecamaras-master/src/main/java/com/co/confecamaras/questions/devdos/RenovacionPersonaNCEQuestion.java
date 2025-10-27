package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.RenovacionPersona;
import com.co.confecamaras.userinterfaces.ResumenCaja;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RenovacionPersonaNCEQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valReno = RenovacionPersona.VAL_MODAL.resolveFor(actor).isCurrentlyVisible();
        return valReno;
    }

    public static RenovacionPersonaNCEQuestion validacion(){
        return new RenovacionPersonaNCEQuestion();
    }
}
