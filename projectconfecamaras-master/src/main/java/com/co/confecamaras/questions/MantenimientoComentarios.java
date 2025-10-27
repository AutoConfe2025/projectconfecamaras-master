package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import com.co.confecamaras.userinterfaces.MantenimientoKardex;


public class MantenimientoComentarios implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean comentariosValidation = MantenimientoKardex.VALIDACION_DESCR.resolveFor(actor).isVisible();
        return comentariosValidation;
    }

    public static MantenimientoComentarios validacion(){
        return new MantenimientoComentarios();
    }
}
