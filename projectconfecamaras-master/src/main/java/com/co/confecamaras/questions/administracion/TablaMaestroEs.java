package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.administracion.MaestroDeDescuentoPage.TABLA_DATOS;

public class TablaMaestroEs  implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tablaMaestro = TABLA_DATOS.resolveFor(actor).isVisible();
        return tablaMaestro;
    }

    public static TablaMaestroEs visible(){
        return new TablaMaestroEs();
    }
}
