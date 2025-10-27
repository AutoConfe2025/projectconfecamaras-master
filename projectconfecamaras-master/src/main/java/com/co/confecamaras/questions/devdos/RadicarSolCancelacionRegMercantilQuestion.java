package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CancelacionRegMercantil;
import com.co.confecamaras.userinterfaces.CrudProponente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RadicarSolCancelacionRegMercantilQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valSolCan = CancelacionRegMercantil.VALIDACION.resolveFor(actor).isVisible();
        return valSolCan;
    }

    public static RadicarSolCancelacionRegMercantilQuestion validacion(){
        return new RadicarSolCancelacionRegMercantilQuestion();
    }
}