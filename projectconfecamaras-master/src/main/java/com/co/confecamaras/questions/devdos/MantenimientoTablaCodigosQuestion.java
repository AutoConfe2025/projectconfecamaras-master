package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoTres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MantenimientoTablaCodigosQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean validacionTab = MantenimientoTres.VALIDACION_TABLA.resolveFor(actor).isVisible();
        return validacionTab;
    }

    public static MantenimientoTablaCodigosQuestion validacion(){
        return new MantenimientoTablaCodigosQuestion();
    }
}
