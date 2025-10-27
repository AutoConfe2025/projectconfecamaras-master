package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.ExtraccionExperianNuevoUI.*;

public class RevisaExtraccionExperianNuevo implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_FINAL_EEN.resolveFor(actor).isVisible();
    }

    public static RevisaExtraccionExperianNuevo enConfecamarasSII() {
        return new RevisaExtraccionExperianNuevo();
    }
}