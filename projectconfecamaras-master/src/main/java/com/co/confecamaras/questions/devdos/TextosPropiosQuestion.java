package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.Actualizar;
import com.co.confecamaras.userinterfaces.TextosPropios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TextosPropiosQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean actualizarText = TextosPropios.VALIDACION_CAMPO.resolveFor(actor).isVisible();
        return actualizarText;
    }

    public static TextosPropiosQuestion validacion(){
        return new TextosPropiosQuestion();
    }
}
