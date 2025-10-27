package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MantenimientoMunicipiosDepartamentosUI.*;

public class RevisaMantenimientoMunicipiosDepartamentos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeFinalMunicipiosDepartamentos = LBL_MENSAJE_MUNICIPIOS_DEPARTAMENTOS.resolveFor(actor).isVisible();
        return mensajeFinalMunicipiosDepartamentos;
    }

    public static RevisaMantenimientoMunicipiosDepartamentos enConfecamaraSII(){
        return new RevisaMantenimientoMunicipiosDepartamentos();
    }
}