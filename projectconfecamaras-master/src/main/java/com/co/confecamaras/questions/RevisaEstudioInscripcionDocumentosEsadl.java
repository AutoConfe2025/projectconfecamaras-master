package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.EstudioInscripcionDocumentosEsadlUI.*;
import static com.co.confecamaras.utils.Constantes.*;

public class RevisaEstudioInscripcionDocumentosEsadl implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String finalizacionEstado = LBL_FINALIZACION_ESTUDIO.resolveFor(actor).getText();
        return finalizacionEstado.contains(NUEVO_ESTADO);
    }

    public static RevisaEstudioInscripcionDocumentosEsadl enConfecamaraSII(){
        return new RevisaEstudioInscripcionDocumentosEsadl();
    }
}