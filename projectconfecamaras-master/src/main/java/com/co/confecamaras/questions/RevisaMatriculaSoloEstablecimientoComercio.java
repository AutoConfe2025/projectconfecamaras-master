package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.LBL_MENSAJE_FINAL_TRANSACCION;

public class RevisaMatriculaSoloEstablecimientoComercio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeFinalTransaccion = LBL_MENSAJE_FINAL_TRANSACCION.resolveFor(actor).isVisible();
        return mensajeFinalTransaccion;
    }

    public static RevisaMatriculaSoloEstablecimientoComercio enConfecamaraSII(){
        return new RevisaMatriculaSoloEstablecimientoComercio();
    }
}