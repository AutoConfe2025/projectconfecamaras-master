package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoDosAdmin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SecuenciasQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean valTabC = MantenimientoDosAdmin.VALIDACION_RESULT.resolveFor(actor).isVisible();
        return valTabC;
    }

    public static SecuenciasQuestion validacion(){
        return new SecuenciasQuestion();
    }
}
