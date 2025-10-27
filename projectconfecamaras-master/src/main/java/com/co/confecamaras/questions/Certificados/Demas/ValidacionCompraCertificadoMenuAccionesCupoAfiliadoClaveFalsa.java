package com.co.confecamaras.questions.Certificados.Demas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa.MENSAJE_VALIDACION_CLAVE_NO_CORRESPONDE;

public class ValidacionCompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeFinal = MENSAJE_VALIDACION_CLAVE_NO_CORRESPONDE.resolveFor(actor).
                containsText("No es posible solicitar los certificados, la clave no corresponde.");
        return mensajeFinal;
    }
    public static ValidacionCompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa mensejeFinal() {
        return new ValidacionCompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa();
    }
}
