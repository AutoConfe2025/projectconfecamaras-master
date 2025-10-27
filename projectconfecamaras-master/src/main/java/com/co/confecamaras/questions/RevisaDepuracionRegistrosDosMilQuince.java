package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.DepuracionRegistrosDosMilQuinceUI.*;

public class RevisaDepuracionRegistrosDosMilQuince implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_DEPURACION_REGISTROS.resolveFor(actor).isVisible();
    }

    public static RevisaDepuracionRegistrosDosMilQuince enConfecamaraSII(){
        return new RevisaDepuracionRegistrosDosMilQuince();
    }
}