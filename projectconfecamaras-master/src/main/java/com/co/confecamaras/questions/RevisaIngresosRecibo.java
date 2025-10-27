package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.IngresosReciboUI.*;
import static com.co.confecamaras.utils.Constantes.*;

public class RevisaIngresosRecibo implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeIngresosRecibo = LBL_INGRESOS_RECIBO.resolveFor(actor).containsText(RELACION_MOVIMIENTOS_RECIBO);
        return mensajeIngresosRecibo;
    }

    public static RevisaIngresosRecibo enConfecamaraSII(){
        return new RevisaIngresosRecibo();
    }
}