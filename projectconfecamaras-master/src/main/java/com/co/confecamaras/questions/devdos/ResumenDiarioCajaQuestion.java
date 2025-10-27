package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.ResumenCaja;
import com.co.confecamaras.userinterfaces.RutaDocumentos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResumenDiarioCajaQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean valRDiario = ResumenCaja.VALIDACION_RESUMEN.resolveFor(actor).isVisible();
        return valRDiario;
    }

    public static ResumenDiarioCajaQuestion validacion(){
        return new ResumenDiarioCajaQuestion();
    }

}
