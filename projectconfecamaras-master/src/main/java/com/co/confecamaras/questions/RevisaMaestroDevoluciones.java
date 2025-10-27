package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MaestroDevolucionesUI.*;
import static com.co.confecamaras.utils.Constantes.TIPO_MOTIVO_FINAL;

public class RevisaMaestroDevoluciones implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeMaestroDevoluciones = LBL_MAESTRO_DEVOLUCIONES.resolveFor(actor).getText();
        return mensajeMaestroDevoluciones.contains(TIPO_MOTIVO_FINAL);
    }

    public static RevisaMaestroDevoluciones enConfecamaraSII() {
        return new RevisaMaestroDevoluciones();
    }
}