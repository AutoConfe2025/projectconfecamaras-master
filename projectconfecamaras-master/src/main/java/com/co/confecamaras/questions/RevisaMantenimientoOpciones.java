package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MantenimientoOpcionesUI.*;

public class RevisaMantenimientoOpciones implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeMantenimientoOpciones = LBL_MANTENIMIENTO_OPCIONES.resolveFor(actor).isVisible();
        return mensajeMantenimientoOpciones;
    }

    public static RevisaMantenimientoOpciones enConfecamaraSII(){
        return new RevisaMantenimientoOpciones();
    }
}