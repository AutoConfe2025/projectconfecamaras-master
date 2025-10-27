package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.AbrirCaja;
import com.co.confecamaras.userinterfaces.CerrarCaja;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ReAbrirCajaQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean abrirCajaVal = AbrirCaja.VALIDACION_APERTURA_CAJA.resolveFor(actor).isVisible();
        return abrirCajaVal;
    }

    public static ReAbrirCajaQuestion validacion(){
        return new ReAbrirCajaQuestion();
    }
}
