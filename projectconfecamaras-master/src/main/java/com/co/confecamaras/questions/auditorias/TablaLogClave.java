package com.co.confecamaras.questions.auditorias;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.auditoria.LogCambioClavePage.TABLA_LOG;

public class TablaLogClave implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tabla = TABLA_LOG.resolveFor(actor).isVisible();
        return tabla;
    }

    public static TablaLogClave esVisible(){
        return new TablaLogClave();
    }
}
