package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;

public class RevisaRenovacionMatriculaPJEstadoInactivo implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_PN_ESTADO_INACTIVO.resolveFor(actor).isVisible();
    }

    public static RevisaRenovacionMatriculaPJEstadoInactivo enConfecamarasSII() {
        return new RevisaRenovacionMatriculaPJEstadoInactivo();
    }
}