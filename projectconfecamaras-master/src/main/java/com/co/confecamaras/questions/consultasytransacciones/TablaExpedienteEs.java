package com.co.confecamaras.questions.consultasytransacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.consultasytransacciones.ExpedienteDigitalPage.DIV_TABLA_EXPEDIENTE;

public class TablaExpedienteEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tablaExpediente = DIV_TABLA_EXPEDIENTE.resolveFor(actor).isVisible();
        return tablaExpediente;
    }

    public static TablaExpedienteEs visible(){
        return new TablaExpedienteEs();
    }
}
