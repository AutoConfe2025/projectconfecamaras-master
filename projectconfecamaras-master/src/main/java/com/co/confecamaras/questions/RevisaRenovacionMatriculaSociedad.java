package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;

public class RevisaRenovacionMatriculaSociedad implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeRenovacionMatriculaSociedad = LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_SOCIEDAD.resolveFor(actor).isVisible();
        return mensajeRenovacionMatriculaSociedad;
    }

    public static RevisaRenovacionMatriculaSociedad enConfecamarasSii(){
        return new RevisaRenovacionMatriculaSociedad();
    }
}