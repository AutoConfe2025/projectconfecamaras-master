package com.co.confecamaras.questions.aseguramientosii;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.aseguramientosii.VisorDeLogsPage.TABLA_LOG_SELECCIONADO;

public class TablaVsiorLogsEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tabla = TABLA_LOG_SELECCIONADO.resolveFor(actor).isVisible();
        return tabla;
    }

    public static TablaVsiorLogsEs visible(){
        return new TablaVsiorLogsEs();
    }
}
