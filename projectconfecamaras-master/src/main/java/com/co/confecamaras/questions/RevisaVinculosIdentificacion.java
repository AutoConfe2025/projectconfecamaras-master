package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.VinculosIdentificacion.*;

public class RevisaVinculosIdentificacion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeCertificado = LBL_MENSAJE_SOLICITUD_CERTIFICADOS.resolveFor(actor).isVisible();
        return mensajeCertificado;
    }

    public static RevisaVinculosIdentificacion enConfecamaraSII(){
        return new RevisaVinculosIdentificacion();
    }
}