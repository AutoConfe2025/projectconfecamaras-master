package com.co.confecamaras.questions.Certificados.Demas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraRapidaCertificadosNoAfiliado.MENSAJE_VALIDACION_PAGO_NO_PRESENCIAL;

public class ValidacionCompraRapidaCertificadosNoAfiliado implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeFinal = MENSAJE_VALIDACION_PAGO_NO_PRESENCIAL.resolveFor(actor).containsText("Ver documento");
        return mensajeFinal;
    }
    public static ValidacionCompraRapidaCertificadosNoAfiliado mensejeFinal() {
        return new ValidacionCompraRapidaCertificadosNoAfiliado();
    }
}
