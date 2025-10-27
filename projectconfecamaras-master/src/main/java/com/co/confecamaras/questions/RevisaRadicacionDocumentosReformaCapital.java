package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RadicacionDocumentosReformaCapitalUI.*;

public class RevisaRadicacionDocumentosReformaCapital implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeReciboCaja = LBL_RECIBO_CAJA.resolveFor(actor).isVisible();
        return mensajeReciboCaja;
    }

    public static RevisaRadicacionDocumentosReformaCapital enConfecamaraSII(){
        return new RevisaRadicacionDocumentosReformaCapital();
    }
}