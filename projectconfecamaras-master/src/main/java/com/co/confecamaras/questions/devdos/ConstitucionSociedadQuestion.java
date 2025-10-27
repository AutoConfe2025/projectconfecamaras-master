package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.SolicitudCertificadosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConstitucionSociedadQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valCert = SolicitudCertificadosUI.VER_BTN_VAL.resolveFor(actor).isVisible();
        return valCert;
    }

    public static ConstitucionSociedadQuestion validacion(){
        return new ConstitucionSociedadQuestion();
    }
}
