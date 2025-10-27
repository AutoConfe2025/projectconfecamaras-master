package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoTres;
import com.co.confecamaras.userinterfaces.MantenimientosAdmin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MantenimientoTarifasQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean validacionTar = MantenimientosAdmin.VALIDACION_TARIFAS.resolveFor(actor).isVisible();
        return validacionTar;
    }

    public static MantenimientoTarifasQuestion validacion(){
        return new MantenimientoTarifasQuestion();
    }
}
