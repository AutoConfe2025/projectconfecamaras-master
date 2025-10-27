package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.InscripcionDocumentos;
import com.co.confecamaras.userinterfaces.MantenimientoTres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class InscripcionDocumentosProponentesQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean validacionInscripcionDoc = InscripcionDocumentos.VALIDACION_PRO.resolveFor(actor).isVisible();
        return validacionInscripcionDoc;
    }

    public static InscripcionDocumentosProponentesQuestion validacion(){
        return new InscripcionDocumentosProponentesQuestion();
    }
}
