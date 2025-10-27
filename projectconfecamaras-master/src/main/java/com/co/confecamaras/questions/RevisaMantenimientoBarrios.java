package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MantenimientoBarriosUI.*;

public class RevisaMantenimientoBarrios implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeMantenimientoBarrios = LBL_MANTENIMIENTO_BARRIOS.resolveFor(actor).isVisible();
        return mensajeMantenimientoBarrios;
    }

    public static RevisaMantenimientoBarrios enConfecamaraSII(){
        return new RevisaMantenimientoBarrios();
    }
}