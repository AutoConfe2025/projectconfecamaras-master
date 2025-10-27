package com.co.confecamaras.questions.mantenimientoeinformes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorMunicipiosPage.BTN_DESCARGAR_GENERACION;

public class BotonGenerarInfoMuniEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean btn = BTN_DESCARGAR_GENERACION.resolveFor(actor).isVisible();
        return btn;
    }

    public static BotonGenerarInfoMuniEs visible(){
        return new BotonGenerarInfoMuniEs();
    }
}
