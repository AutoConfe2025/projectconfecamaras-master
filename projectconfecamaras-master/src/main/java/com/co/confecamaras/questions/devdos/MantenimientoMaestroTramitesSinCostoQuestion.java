package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoKardex;
import com.co.confecamaras.userinterfaces.MantenimientosAdmin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MantenimientoMaestroTramitesSinCostoQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean validacionMaestro = MantenimientosAdmin.VALIDACION_MTRAMITES.resolveFor(actor).isVisible();
        return validacionMaestro;
    }

    public static MantenimientoMaestroTramitesSinCostoQuestion validacion(){
        return new MantenimientoMaestroTramitesSinCostoQuestion();
    }
}
