package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RepartoDocumentosUI.*;

public class RevisaRepartoDocumentos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeRepartoDocumentos = LBL_REPARTO_DOCUMENTOS.resolveFor(actor).isVisible();
        return mensajeRepartoDocumentos;
    }

    public static RevisaRepartoDocumentos enConfecamaraSII(){
        return new RevisaRepartoDocumentos();
    }
}