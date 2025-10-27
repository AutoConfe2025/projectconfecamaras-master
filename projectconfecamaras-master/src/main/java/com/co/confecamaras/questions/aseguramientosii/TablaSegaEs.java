package com.co.confecamaras.questions.aseguramientosii;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.aseguramientosii.ConexionSegaPage.TABLA_DATOS;

public class TablaSegaEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tabla = TABLA_DATOS.resolveFor(actor).isVisible();
        return tabla;
    }

    public static TablaSegaEs visible(){
        return new TablaSegaEs();
    }
}
