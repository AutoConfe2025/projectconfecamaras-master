package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.ReingresoTramitesUI.LBL_ESTADO_ACTUAL;
import static com.co.confecamaras.utils.Constantes.ESTADO_ACTUAL;

public class RevisaReingresoTramites implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String  estadoActual = LBL_ESTADO_ACTUAL.resolveFor(actor).getText();
        return  estadoActual.contains(ESTADO_ACTUAL);
    }

    public static RevisaReingresoTramites enConfecamaraSII(){
        return new RevisaReingresoTramites();
    }
}