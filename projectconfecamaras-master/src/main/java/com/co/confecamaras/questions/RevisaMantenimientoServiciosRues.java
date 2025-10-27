package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MantenimientoServiciosRuesUI.*;

public class RevisaMantenimientoServiciosRues implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeMantenimientoServiciosRues = LBL_MANTENIMIENTO_SERVICIOS_RUES.resolveFor(actor).isVisible();
        return mensajeMantenimientoServiciosRues;
    }

    public static RevisaMantenimientoServiciosRues enConfecamaraSII(){
        return new RevisaMantenimientoServiciosRues();
    }
}