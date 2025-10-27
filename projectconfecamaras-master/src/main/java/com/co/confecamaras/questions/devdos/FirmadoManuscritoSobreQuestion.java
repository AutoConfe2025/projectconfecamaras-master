package com.co.confecamaras.questions.devdos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.FirmadoManuscritoSobre.*;

public class FirmadoManuscritoSobreQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_FIRMADO_MANUSCRITO_SOBRE.resolveFor(actor).isVisible();
    }

    public static FirmadoManuscritoSobreQuestion validacion(){
        return new FirmadoManuscritoSobreQuestion();
    }
}
