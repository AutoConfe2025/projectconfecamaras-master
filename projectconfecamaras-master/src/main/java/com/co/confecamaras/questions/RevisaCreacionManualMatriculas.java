package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.CreacionManualMatriculasUI.*;

public class RevisaCreacionManualMatriculas implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_CREACION_MATRICULAS.resolveFor(actor).isVisible();
    }

    public static RevisaCreacionManualMatriculas enConfecamaraSII(){
        return new RevisaCreacionManualMatriculas();
    }
}