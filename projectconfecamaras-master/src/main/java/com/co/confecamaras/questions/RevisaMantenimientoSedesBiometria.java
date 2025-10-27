package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MantenimientoSedesBiometriaUI.*;

public class RevisaMantenimientoSedesBiometria implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeMantenimientoSedesBiometria = LBL_MANTENIMIENTO_SEDES_BIOMETRIA.resolveFor(actor).isVisible();
        return mensajeMantenimientoSedesBiometria;
    }

    public static RevisaMantenimientoSedesBiometria enConfecamaraSII(){
        return new RevisaMantenimientoSedesBiometria();
    }
}