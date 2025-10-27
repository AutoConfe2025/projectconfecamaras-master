package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoDosAdmin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DevolucionQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean valTabC = MantenimientoDosAdmin.VALIDACION_RESULT_CERT.resolveFor(actor).isVisible();
        return valTabC;
    }

    public static DevolucionQuestion validacion(){
        return new DevolucionQuestion();
    }
}
