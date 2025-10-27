package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSucursalUI.*;

public class RevisaRenovacionMatriculaAgencia implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeRenovacionMatriculaAgencia = LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_SUCURSAL.resolveFor(actor).isVisible();
        return mensajeRenovacionMatriculaAgencia;
    }

    public static RevisaRenovacionMatriculaAgencia enConfecamarasSii(){
        return new RevisaRenovacionMatriculaAgencia();
    }
}