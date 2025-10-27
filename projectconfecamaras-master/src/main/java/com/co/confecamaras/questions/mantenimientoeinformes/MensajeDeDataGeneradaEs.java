package com.co.confecamaras.questions.mantenimientoeinformes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.DetalladoDeImpuestoPage.MENSAJE_GENERAACION_DETALLADO;

public class MensajeDeDataGeneradaEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensaje = MENSAJE_GENERAACION_DETALLADO.resolveFor(actor).isVisible();
        return mensaje;
    }

    public static MensajeDeDataGeneradaEs visible(){
        return new MensajeDeDataGeneradaEs();
    }
}
