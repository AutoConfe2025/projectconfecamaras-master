package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.SolicitudCertificadosUI.*;

public class RevisaSolicitudCertificados implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean documentoFinal = LBL_DOCUMENTO_FINAL_SOLICITUD_CERTIFICADOS.resolveFor(actor).isVisible();
        return documentoFinal;
    }

    public static RevisaSolicitudCertificados enConfecamaraSII(){
        return new RevisaSolicitudCertificados();
    }
}