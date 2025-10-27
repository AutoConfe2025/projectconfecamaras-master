package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.InactivarExpedientesSiprefUI.*;

public class RevisaInactivarExpedientesSipref implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeInactivarExpedientesSipref = LBL_INACTIVAR_SIPREF.resolveFor(actor).isVisible();
        return mensajeInactivarExpedientesSipref;
    }

    public static RevisaInactivarExpedientesSipref enConfecamaraSII(){
        return new RevisaInactivarExpedientesSipref();
    }
}