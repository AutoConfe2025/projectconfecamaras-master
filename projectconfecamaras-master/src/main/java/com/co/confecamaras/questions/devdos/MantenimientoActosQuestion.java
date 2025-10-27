package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoTres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MantenimientoActosQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean validacionAct = MantenimientoTres.VALIDACION_ACTOS.resolveFor(actor).isVisible();
        return validacionAct;
    }

    public static MantenimientoActosQuestion validacion(){
        return new MantenimientoActosQuestion();
    }
}
