package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RevisionCfeUI.LBL_MENSAJE_ESTADISTICAS;

public class RevisaRevisionCfe implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeRevision = LBL_MENSAJE_ESTADISTICAS.resolveFor(actor).isVisible();
        return mensajeRevision;
    }

    public static RevisaRevisionCfe enConfecamaraSII() {
        return new RevisaRevisionCfe();
    }
}
