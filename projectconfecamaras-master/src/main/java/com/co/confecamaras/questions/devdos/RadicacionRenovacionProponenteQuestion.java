package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CrudProponente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RadicacionRenovacionProponenteQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valRenovacion = CrudProponente.VAL_RECIBO.resolveFor(actor).isVisible();
        //boolean valRenovacion = CrudProponente.VAL_MENSAJE_INACTIVIDAD.resolveFor(actor).containsText("El proceso de renovación en el registro de proponentes se encuentra inactivo. (20231030)");
        return valRenovacion;
    }

    public static RadicacionRenovacionProponenteQuestion validacion(){
        return new RadicacionRenovacionProponenteQuestion();
    }
}
