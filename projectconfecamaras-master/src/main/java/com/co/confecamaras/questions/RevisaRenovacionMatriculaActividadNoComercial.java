package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_ACTIVIDAD_NO_COMERCIAL;

public class RevisaRenovacionMatriculaActividadNoComercial implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_ACTIVIDAD_NO_COMERCIAL.resolveFor(actor).isVisible();
    }

    public static RevisaRenovacionMatriculaActividadNoComercial enConfecamarasSII() {
        return new RevisaRenovacionMatriculaActividadNoComercial();
    }
}