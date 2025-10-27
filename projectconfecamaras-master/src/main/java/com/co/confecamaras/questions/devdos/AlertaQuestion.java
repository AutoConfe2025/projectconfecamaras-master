package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoTresAdmin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AlertaQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean valTabC = MantenimientoTresAdmin.VALIDACION_RESULT_AA.resolveFor(actor).isVisible();
        return valTabC;
    }

    public static AlertaQuestion validacion(){
        return new AlertaQuestion();
    }
}
