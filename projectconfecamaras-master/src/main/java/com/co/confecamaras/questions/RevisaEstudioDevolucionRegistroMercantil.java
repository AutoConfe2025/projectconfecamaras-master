package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.EstudioInscripcionDocumentosEsadlUI.LBL_MENSAJE_DEVOLUTIVO;

public class RevisaEstudioDevolucionRegistroMercantil implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeDevolucionRegistro = LBL_MENSAJE_DEVOLUTIVO.resolveFor(actor).isVisible();
        return mensajeDevolucionRegistro;
    }

    public static RevisaEstudioDevolucionRegistroMercantil enConfecamaraSII(){
        return new RevisaEstudioDevolucionRegistroMercantil();
    }
}