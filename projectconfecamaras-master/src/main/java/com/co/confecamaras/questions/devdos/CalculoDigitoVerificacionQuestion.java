package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.DigitoVerificacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CalculoDigitoVerificacionQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean validacionTabla = DigitoVerificacion.VALIDACION_COD.resolveFor(actor).isVisible();
        return validacionTabla;
    }
    public static CalculoDigitoVerificacionQuestion validacion(){
        return new CalculoDigitoVerificacionQuestion();
    }
}
