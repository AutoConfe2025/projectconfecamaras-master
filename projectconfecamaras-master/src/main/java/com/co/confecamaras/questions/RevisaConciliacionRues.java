package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.ConciliacionRuesUI.*;

public class RevisaConciliacionRues implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_FINAL_CONCILIACION_RUES.resolveFor(actor).isVisible();
    }

    public static RevisaConciliacionRues enConfecamaraSII(){
        return new RevisaConciliacionRues();
    }
}