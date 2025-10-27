package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoTresAdmin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class UsuariosWsQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean valTabC = MantenimientoTresAdmin.VALIDACION_RESULT.resolveFor(actor).isVisible();
        return valTabC;
    }

    public static UsuariosWsQuestion validacion(){
        return new UsuariosWsQuestion();
    }
}
