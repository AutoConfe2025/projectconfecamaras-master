package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;

public class RevisaRenovacionEsadlOrgDoce implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_SOCIEDAD.resolveFor(actor).isVisible();
    }

    public static RevisaRenovacionEsadlOrgDoce enConfecamarasSii(){
        return new RevisaRenovacionEsadlOrgDoce();
    }
}