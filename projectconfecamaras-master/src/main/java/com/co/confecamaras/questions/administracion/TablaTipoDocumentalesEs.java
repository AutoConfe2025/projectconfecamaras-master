package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.administracion.TipoDocuemtoRuesPage.TABLA_TIPO_DOCUMENTALES;

public class TablaTipoDocumentalesEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tablaDocu = TABLA_TIPO_DOCUMENTALES.resolveFor(actor).isVisible();
        return tablaDocu;
    }
    public static TablaTipoDocumentalesEs visible(){
        return new TablaTipoDocumentalesEs();
    }
}
