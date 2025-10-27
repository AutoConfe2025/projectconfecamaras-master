package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.ExtraccionAfiliadosUI.*;


public class RevisaExtraccionAfiliados implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeFinalExtraccionMatriculados = LBL_MENSAJE_EXTRACCION_AFILIADOS.resolveFor(actor).isVisible();
        return mensajeFinalExtraccionMatriculados;
    }

    public static RevisaExtraccionAfiliados enConfecamaraSII(){
        return new RevisaExtraccionAfiliados();
    }
}