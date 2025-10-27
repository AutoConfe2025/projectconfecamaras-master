package com.co.confecamaras.questions.consultasytransacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.consultasytransacciones.FormulariosYFoematosPage.TABLA_FORMATOS;

public class TablaFormatosEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tablaFormatos = TABLA_FORMATOS.resolveFor(actor).isVisible();
        return   tablaFormatos;
    }

    public static TablaFormatosEs visible(){
        return new TablaFormatosEs();
    }
}
