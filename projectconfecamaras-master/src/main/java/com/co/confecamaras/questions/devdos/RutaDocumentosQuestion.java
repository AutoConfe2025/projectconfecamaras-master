package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.RutaDocumentos;
import com.co.confecamaras.userinterfaces.TablaNombreCortos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RutaDocumentosQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valTabC = RutaDocumentos.VALIDACION_RD.resolveFor(actor).isVisible();
        return valTabC;
    }

    public static RutaDocumentosQuestion validacion(){
        return new RutaDocumentosQuestion();
    }
}
