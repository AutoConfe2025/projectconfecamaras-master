package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CodigoBarras;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ReasignacionCodBarrasQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valCodBarras = CodigoBarras.VALIDACION_COD.resolveFor(actor).isVisible();
        return valCodBarras;
    }
    public static ReasignacionCodBarrasQuestion validacion(){
        return new ReasignacionCodBarrasQuestion();
    }
}
