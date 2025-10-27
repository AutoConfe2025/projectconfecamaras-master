package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.DesbloquearLiquidacionUI.*;

public class RevisaDesbloquearLiquidacion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeFinalDebloquarLiquidacion = LBL_MENSAJE_FINAL_DESBLOQUEAR_LIQUIDACION.resolveFor(actor).isVisible();
        return mensajeFinalDebloquarLiquidacion;
    }

    public static RevisaDesbloquearLiquidacion enConfecamaraSII(){
        return new RevisaDesbloquearLiquidacion();
    }
}