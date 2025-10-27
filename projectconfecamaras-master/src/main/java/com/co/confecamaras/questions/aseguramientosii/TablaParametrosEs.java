package com.co.confecamaras.questions.aseguramientosii;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.aseguramientosii.ParametrizaciónBatchPage.TABLA_PROCESOS_BATCH;

public class TablaParametrosEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tabla = TABLA_PROCESOS_BATCH.resolveFor(actor).isVisible();
        return tabla;
    }

    public static TablaParametrosEs visible() {
        return new TablaParametrosEs();
    }
}
