package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CodigoBarras;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MantenimientoTablaRetencionDocumentalQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valMantR = CodigoBarras.VALIDACION_COD.resolveFor(actor).isVisible();
        return valMantR;
    }
    public static MantenimientoTablaRetencionDocumentalQuestion validacion(){
        return new MantenimientoTablaRetencionDocumentalQuestion();
    }
}
