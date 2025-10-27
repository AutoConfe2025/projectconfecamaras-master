package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.administracion.KillProcessPage.TABLAPROCESOS;

public class TablaProcesosEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tabla = TABLAPROCESOS.resolveFor(actor).isVisible();
        return tabla;
    }

    public static TablaProcesosEs visible(){
    return new TablaProcesosEs();
    }
}
