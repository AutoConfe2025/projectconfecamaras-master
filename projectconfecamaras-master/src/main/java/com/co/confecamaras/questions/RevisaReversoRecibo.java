package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.AnulacionRecibosCajaUI.LBL_MENSAJE_REVERSO_RECIBO;


public class RevisaReversoRecibo implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeFinalReverso = LBL_MENSAJE_REVERSO_RECIBO.resolveFor(actor).isVisible();
        return mensajeFinalReverso;
    }

    public static RevisaReversoRecibo enConfecamaraSII(){
        return new RevisaReversoRecibo();
    }
}