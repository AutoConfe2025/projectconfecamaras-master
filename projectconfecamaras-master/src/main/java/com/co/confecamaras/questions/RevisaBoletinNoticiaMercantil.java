package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.BoletinNoticiaMercantilUI.*;

public class RevisaBoletinNoticiaMercantil implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_FINAL_CORREO_BNM.resolveFor(actor).isCurrentlyEnabled();
    }

    public static RevisaBoletinNoticiaMercantil enConfecamarasSII() {
        return new RevisaBoletinNoticiaMercantil();
    }
}