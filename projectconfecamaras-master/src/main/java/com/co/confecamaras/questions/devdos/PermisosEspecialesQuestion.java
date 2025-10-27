package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoTresAdmin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PermisosEspecialesQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean valTabC = MantenimientoTresAdmin.VALIDACION_RESULT_PE.resolveFor(actor).isVisible();
        return valTabC;
    }

    public static PermisosEspecialesQuestion validacion(){
        return new PermisosEspecialesQuestion();
    }
}
