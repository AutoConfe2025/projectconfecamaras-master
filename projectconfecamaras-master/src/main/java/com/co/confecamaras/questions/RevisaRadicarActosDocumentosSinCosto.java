package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RadicarActosDocumentosSinCostoUI.*;

public class RevisaRadicarActosDocumentosSinCosto implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeSoportesRadicar = LBL_SOPORTES_RADICAR_ACTOS.resolveFor(actor).isVisible();
        return mensajeSoportesRadicar;
    }

    public static RevisaRadicarActosDocumentosSinCosto enConfecamaraSII(){
        return new RevisaRadicarActosDocumentosSinCosto();
    }
}