package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MantenimientoServiciosUI.*;

public class RevisaMantenimientoServicios implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeMantenimientoServicios = LBL_MANTENIMIENTO_SERVICIOS.resolveFor(actor).isVisible();
        return mensajeMantenimientoServicios;
    }

    public static RevisaMantenimientoServicios enConfecamaraSII(){
        return new RevisaMantenimientoServicios();
    }
}