package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CodigoBarras;
import com.co.confecamaras.userinterfaces.TablaNombreCortos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TablaNombresCortosQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valTab = TablaNombreCortos.VALIDACION_TNC.resolveFor(actor).isVisible();
        return valTab;
    }
    public static TablaNombresCortosQuestion validacion(){
        return new TablaNombresCortosQuestion();
    }
}
