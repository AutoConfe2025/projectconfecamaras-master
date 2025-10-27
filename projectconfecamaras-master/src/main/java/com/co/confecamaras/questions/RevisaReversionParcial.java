package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.ReversionParcialUI.*;

public class RevisaReversionParcial implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_FINAL_REVERSION_PARCIAL_RP.resolveFor(actor).isEnabled();
    }

    public static RevisaReversionParcial enConfecamaraSII(){
        return new RevisaReversionParcial();
    }
}