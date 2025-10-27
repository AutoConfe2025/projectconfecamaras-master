package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.VinculosMatriculasRuesUI.*;
import static com.co.confecamaras.utils.Constantes.*;

public class RevisaVinculosMatriculaRues implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeVinculosMatriculaRues = LBL_VINCULOS_MATRICULAS_RUES.resolveFor(actor).containsText(MATRICULA);
        return mensajeVinculosMatriculaRues;
    }

    public static RevisaVinculosMatriculaRues enConfecamaraSII(){
        return new RevisaVinculosMatriculaRues();
    }
}