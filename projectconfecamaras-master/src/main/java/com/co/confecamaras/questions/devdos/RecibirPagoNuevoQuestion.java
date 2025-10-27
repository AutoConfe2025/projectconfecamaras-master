package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.RecibirPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RecibirPagoNuevoQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return RecibirPago.VALIDACION_PAGO.resolveFor(actor).isVisible();
    }

    public static RecibirPagoNuevoQuestion validacion(){
        return new RecibirPagoNuevoQuestion();
    }
}
