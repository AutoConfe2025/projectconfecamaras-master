package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoTres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MunicipiosJurisdiccionQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean validacionJur = MantenimientoTres.VALIDACION_JURISDICCION.resolveFor(actor).isVisible();
        return validacionJur;
    }

    public static MunicipiosJurisdiccionQuestion validacion(){
        return new MunicipiosJurisdiccionQuestion();
    }
}
