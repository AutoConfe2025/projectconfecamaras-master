package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSucursalUI.*;

public class RevisaRenovacionMatriculaSucursal implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeRenovacionMatriculaSucursal = LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_SUCURSAL.resolveFor(actor).isVisible();
        return mensajeRenovacionMatriculaSucursal;
    }

    public static RevisaRenovacionMatriculaSucursal enConfecamarasSii(){
        return new RevisaRenovacionMatriculaSucursal();
    }
}