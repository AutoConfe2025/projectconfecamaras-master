package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoKardex;
import com.co.confecamaras.userinterfaces.MantenimientoReciboCaja;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MantenimientoRecibosCajaQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean validacionRC = MantenimientoReciboCaja.VALIDACION_RC.resolveFor(actor).isVisible();
        return validacionRC;
    }

    public static MantenimientoRecibosCajaQuestion validacion(){
        return new MantenimientoRecibosCajaQuestion();
    }
}
