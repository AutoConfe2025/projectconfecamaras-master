package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.SolicitudesRegistro.LBL_TABLA_SOLICITUDES;
import static com.co.confecamaras.utils.Constantes.RECIBO;

public class RevisaSolicitudesRegistro implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String tablaSolicitudes = LBL_TABLA_SOLICITUDES.resolveFor(actor).getText();
        return tablaSolicitudes.contains(RECIBO);
    }

    public static RevisaSolicitudesRegistro enConfecamaraSII(){
        return new RevisaSolicitudesRegistro();
    }
}