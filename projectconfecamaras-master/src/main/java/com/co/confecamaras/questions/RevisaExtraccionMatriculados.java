package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.ExtraccionMatriculadosUI.*;

public class RevisaExtraccionMatriculados implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeFinalExtraccionMatriculados = LBL_MENSAJE_EXTRACCION_MATRICULADOS.resolveFor(actor).isVisible();
        return mensajeFinalExtraccionMatriculados;
    }

    public static RevisaExtraccionMatriculados enConfecamaraSII(){
        return new RevisaExtraccionMatriculados();
    }
}