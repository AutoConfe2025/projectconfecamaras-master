package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.ExtraccionInformaNuevoUI.*;

public class RevisaExtraccionInformaNuevo implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_FINAL_EIN.resolveFor(actor).isVisible();
    }

    public static RevisaExtraccionInformaNuevo enConfecamarasSII() {
        return new RevisaExtraccionInformaNuevo();
    }
}