package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MantenimientoTerminosCondicionesUI.*;

public class RevisaMantenimientoTerminosCondiciones implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeTerminosCondiciones = LBL_MANTENIMIENTO_TERMINOS_CONDICIONES.resolveFor(actor).isVisible();
        return mensajeTerminosCondiciones;
    }

    public static RevisaMantenimientoTerminosCondiciones enConfecamaraSII(){
        return new RevisaMantenimientoTerminosCondiciones();
    }
}