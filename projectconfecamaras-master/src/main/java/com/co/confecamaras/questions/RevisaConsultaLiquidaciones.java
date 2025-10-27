package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.ConsultaLiquidacionesUI.*;

public class RevisaConsultaLiquidaciones implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean documentoFinal = LBL_VER_DOCUMENTO_CL.resolveFor(actor).isVisible();
        return documentoFinal;
    }

    public static RevisaConsultaLiquidaciones enConfecamaraSII(){
        return new RevisaConsultaLiquidaciones();
    }
}