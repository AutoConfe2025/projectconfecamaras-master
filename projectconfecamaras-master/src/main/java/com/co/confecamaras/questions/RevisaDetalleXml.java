package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.ReportesEE.LBL_MENSAJE_XML;

public class RevisaDetalleXml implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeXml = LBL_MENSAJE_XML.resolveFor(actor).isVisible();
        return mensajeXml;
    }

    public static RevisaDetalleXml enConfecamaraSII(){
        return new RevisaDetalleXml();
    }
}