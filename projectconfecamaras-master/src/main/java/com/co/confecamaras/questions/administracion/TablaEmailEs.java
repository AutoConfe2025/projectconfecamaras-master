package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.administracion.MantenimientoEmailsProgramadosPage.TABLA_EMAILS;

public class TablaEmailEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tablaEamil = TABLA_EMAILS.resolveFor(actor).isVisible();
        return tablaEamil;
    }

    public static TablaEmailEs visible(){
        return new TablaEmailEs();
    }
}
