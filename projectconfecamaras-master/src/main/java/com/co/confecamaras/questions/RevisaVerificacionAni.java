package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.VerificacionAniUI.*;

public class RevisaVerificacionAni implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeVerificacionAni = LBL_VERIFICACION_ANI.resolveFor(actor).isVisible();
        return mensajeVerificacionAni;
    }

    public static RevisaVerificacionAni enConfecamaraSII(){
        return new RevisaVerificacionAni();
    }
}