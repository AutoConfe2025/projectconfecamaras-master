package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoTres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MantenimientoSedesQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean validacionAct = MantenimientoTres.VALIDACION_SEDES.resolveFor(actor).isVisible();
        return validacionAct;
    }

    public static MantenimientoSedesQuestion validacion(){
        return new MantenimientoSedesQuestion();
    }
}
