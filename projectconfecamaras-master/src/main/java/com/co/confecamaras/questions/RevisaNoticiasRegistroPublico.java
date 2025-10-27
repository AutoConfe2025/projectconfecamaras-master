package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.NoticiasRegistro.*;

public class RevisaNoticiasRegistroPublico implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeFinalNoticiasRegistros = LBL_NOTICIAS_REGISTROS.resolveFor(actor).isVisible();
        return mensajeFinalNoticiasRegistros;
    }

    public static RevisaNoticiasRegistroPublico enConfecamaraSII(){
        return new RevisaNoticiasRegistroPublico();
    }
}