package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSucursalUI.*;

public class RevisaRenovacionMatriculaPNAfiliada implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_SUCURSAL.resolveFor(actor).isVisible();
    }

    public static RevisaRenovacionMatriculaPNAfiliada enConfecamarasSII() {
        return new RevisaRenovacionMatriculaPNAfiliada();
    }
}