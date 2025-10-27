package com.co.confecamaras.questions.aseguramientosii;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.aseguramientosii.InventarioScriptsPage.TABLA_SCRIPTS;

public class TablaScripts implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tabla = TABLA_SCRIPTS.resolveFor(actor).isVisible();
        return tabla;
    }

    public static TablaScripts esVisible(){
        return new TablaScripts();
    }
}
