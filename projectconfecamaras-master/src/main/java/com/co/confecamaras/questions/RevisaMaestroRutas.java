package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MaestroRutasUI.*;

public class RevisaMaestroRutas implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeMaestroRutas = LBL_MAESTRO_RUTAS.resolveFor(actor).isVisible();
        return mensajeMaestroRutas;
    }

    public static RevisaMaestroRutas enConfecamaraSII() {
        return new RevisaMaestroRutas();
    }
}