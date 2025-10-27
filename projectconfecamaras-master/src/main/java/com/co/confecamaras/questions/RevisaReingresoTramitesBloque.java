package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.ReingresoTramitesBloqueUI.LBL_TRAMITES_DEVUELTO;

public class RevisaReingresoTramitesBloque implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeFinalReingresoBloque = LBL_TRAMITES_DEVUELTO.resolveFor(actor).isVisible();
        return mensajeFinalReingresoBloque;
    }

    public static RevisaReingresoTramitesBloque enConfecamaraSII(){
        return new RevisaReingresoTramitesBloque();
    }
}