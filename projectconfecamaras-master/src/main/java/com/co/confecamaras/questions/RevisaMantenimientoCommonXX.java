package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MantenimientoCommonXXUI.*;

public class RevisaMantenimientoCommonXX implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeCommonXX = LBL_MANTENIMIENTO_COMMONXX.resolveFor(actor).isVisible();
        return mensajeCommonXX;
    }

    public static RevisaMantenimientoCommonXX enConfecamaraSII(){
        return new RevisaMantenimientoCommonXX();
    }
}