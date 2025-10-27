package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.InscripcionDocumentos;
import com.co.confecamaras.userinterfaces.MantenimientoUsuarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class InscripcionDocumentosMercantilQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean valRegMer = InscripcionDocumentos.VALIDACION_MERCANTIL.resolveFor(actor).isVisible();
        return valRegMer;
    }

    public static InscripcionDocumentosMercantilQuestion validacion(){
        return new InscripcionDocumentosMercantilQuestion();
    }
}
