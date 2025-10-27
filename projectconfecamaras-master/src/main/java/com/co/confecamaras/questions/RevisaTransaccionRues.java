package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.LBL_MENSAJE_FINAL_TRANSACCION;

public class RevisaTransaccionRues implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeFinalTransaccionRues = LBL_MENSAJE_FINAL_TRANSACCION.resolveFor(actor).isVisible();
        return mensajeFinalTransaccionRues;
    }

    public static RevisaTransaccionRues enConfecamaraSII(){
        return new RevisaTransaccionRues();
    }
}