package com.co.confecamaras.questions.mantenimientoeinformes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorCCostoPage.BTN_GENERAR_EXCEL_C_COSTOS;

public class BotonSerCostoEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean btn = BTN_GENERAR_EXCEL_C_COSTOS.resolveFor(actor).isVisible();
        return btn;
    }

    public static BotonSerCostoEs visible(){
        return new BotonSerCostoEs();
    }
}
