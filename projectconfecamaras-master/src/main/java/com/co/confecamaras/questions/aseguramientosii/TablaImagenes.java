package com.co.confecamaras.questions.aseguramientosii;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.aseguramientosii.AdministradorRepositorioImagnesPage.TABLA_FORMATOS_IMAGENES;

public class TablaImagenes implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tabla = TABLA_FORMATOS_IMAGENES.resolveFor(actor).isVisible();
        return tabla;
    }

    public static TablaImagenes esVsible(){
        return new TablaImagenes();
    }
}
