package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MaestroVinculosUI.*;
import static com.co.confecamaras.utils.Constantes.*;

public class RevisaMaestroVinculos implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeMaestroVinculos = LBL_MAESTRO_VINCULOS.resolveFor(actor).getText();
        return mensajeMaestroVinculos.contains(DESCRIPCION);
    }

    public static RevisaMaestroVinculos enConfecamaraSII(){
        return new RevisaMaestroVinculos();
    }
}