package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MantenimientoTipoTramiteUI.*;

public class RevisaMantenimientoTipoTramite implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeMantenimientoTipoTramite = LBL_MANTENIMIENTO_TIPO_TRAMITE.resolveFor(actor).isVisible();
        return mensajeMantenimientoTipoTramite;
    }

    public static RevisaMantenimientoTipoTramite enConfecamaraSII(){
        return new RevisaMantenimientoTipoTramite();
    }
}