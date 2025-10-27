package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.administracion.CuposAfiliacionPage.DATOS_GUARDADOS_COLUMNA;

public class TablaCuposES implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean Tabla =  DATOS_GUARDADOS_COLUMNA.resolveFor(actor).isVisible();
        return Tabla;
    }

    public static TablaCuposES visible(){
        return new TablaCuposES();
    }
}
