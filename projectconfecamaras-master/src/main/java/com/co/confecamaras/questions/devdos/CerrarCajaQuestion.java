package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CerrarCaja;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CerrarCajaQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean cerrarCajaVal = CerrarCaja.VALIDACION_CIERRE_CAJA.resolveFor(actor).isVisible();
        return cerrarCajaVal;
    }

    public static CerrarCajaQuestion validacion(){
        return new CerrarCajaQuestion();
    }
}
