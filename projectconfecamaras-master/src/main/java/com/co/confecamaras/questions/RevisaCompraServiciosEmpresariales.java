package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.CompraServiciosEmpresarialesUI.LBL_TABLA_SOLICITUDES;
import static com.co.confecamaras.utils.Constantes.CLIENTE;

public class RevisaCompraServiciosEmpresariales implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String tablaSolicitudes = LBL_TABLA_SOLICITUDES.resolveFor(actor).getText();
        return tablaSolicitudes.contains(CLIENTE);
    }

    public static RevisaCompraServiciosEmpresariales enConfecamaraSII(){
        return new RevisaCompraServiciosEmpresariales();
    }
}