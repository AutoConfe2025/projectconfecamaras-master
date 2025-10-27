package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CodigoBarras;
import com.co.confecamaras.userinterfaces.MantenimientoTres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MantenimientoMaestroTransaccionRegistroQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valMaes = MantenimientoTres.VALIDACION_BTN_DESCARGA.resolveFor(actor).isVisible();
        return valMaes;
    }

    public static MantenimientoMaestroTransaccionRegistroQuestion validacion(){
        return new MantenimientoMaestroTransaccionRegistroQuestion();
    }
}
