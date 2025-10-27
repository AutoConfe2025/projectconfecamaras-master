package com.co.confecamaras.questions.mantenimientoeinformes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorOperadorPage.BTN_DESCARGAR_INFO_INGRESO_OPERADOR;

public class BotonDescargarRelacionesOperadorEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean btn = BTN_DESCARGAR_INFO_INGRESO_OPERADOR.resolveFor(actor).isVisible();
        return btn;
    }

    public static BotonDescargarRelacionesOperadorEs visible(){
        return new BotonDescargarRelacionesOperadorEs();
    }
}
