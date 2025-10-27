package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoReciboCaja;
import com.co.confecamaras.userinterfaces.MantenimientosAdmin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MantenimientoSalariosMinimosMensualesQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean validacionMM = MantenimientosAdmin.VALIDACION_MM.resolveFor(actor).isVisible();
        return validacionMM;
    }

    public static MantenimientoSalariosMinimosMensualesQuestion validacion(){
        return new MantenimientoSalariosMinimosMensualesQuestion();
    }
}
