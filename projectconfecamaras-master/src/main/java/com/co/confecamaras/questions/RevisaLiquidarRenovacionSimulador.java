package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.LiquidarRenovacionSimuladorUI.*;

public class RevisaLiquidarRenovacionSimulador implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeFinalLiquidarRenovacionSimulador = LBL_MENSAJE_LIQUIDAR_RENOVACION_SIMULADOR.resolveFor(actor).isVisible();
        return mensajeFinalLiquidarRenovacionSimulador;
    }

    public static RevisaLiquidarRenovacionSimulador enConfecamaraSII(){
        return new RevisaLiquidarRenovacionSimulador();
    }
}