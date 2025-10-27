package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.LBL_MENSAJE_FINAL_TRANSACCION_DOS;

public class RevisaRadicarActualizacionDatosMutacion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeFinalTransaccion = LBL_MENSAJE_FINAL_TRANSACCION_DOS.resolveFor(actor).isVisible();
        return mensajeFinalTransaccion;
    }

    public static RevisaRadicarActualizacionDatosMutacion enConfecamaraSII(){
        return new RevisaRadicarActualizacionDatosMutacion();
    }
}