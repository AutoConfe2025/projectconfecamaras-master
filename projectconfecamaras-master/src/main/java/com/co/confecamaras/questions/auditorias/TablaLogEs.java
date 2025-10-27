package com.co.confecamaras.questions.auditorias;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.auditoria.LogIngresoPage.TABLA_LOG_INGRESOS;

public class TablaLogEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean   TablaLog = TABLA_LOG_INGRESOS.resolveFor(actor).isVisible();
        return TablaLog;
    }

    public static TablaLogEs visible(){
        return new TablaLogEs();
    }
}
