package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CrudProponente;
import com.co.confecamaras.userinterfaces.RecibirPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RadicacionDocumentosQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean valRadDoc = RecibirPago.VALIDACION_DESCARGAR.resolveFor(actor).isVisible();
        return valRadDoc;
    }

    public static RadicacionDocumentosQuestion validacion(){
        return new RadicacionDocumentosQuestion();
    }
}
