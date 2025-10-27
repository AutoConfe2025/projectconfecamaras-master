package com.co.confecamaras.questions.bandeja;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.Bandejas.CertificadosEspecialesPage.LBL_EMTREGA_PRESENCIAL_ACEPTADA;

public class CertificadosEspecialesEntrega implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeEntregaPresencial =  LBL_EMTREGA_PRESENCIAL_ACEPTADA.resolveFor(actor).isVisible();
        return mensajeEntregaPresencial;
    }

    public static CertificadosEspecialesEntrega presencialTexto(){
        return new CertificadosEspecialesEntrega();
    }
}
