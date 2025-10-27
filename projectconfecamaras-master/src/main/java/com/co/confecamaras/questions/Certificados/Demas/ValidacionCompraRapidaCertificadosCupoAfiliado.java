package com.co.confecamaras.questions.Certificados.Demas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraRapidaCertificadosCupoAfiliado.MENSAJE_VALIDACION_CUPO_AFILIADO;

public class ValidacionCompraRapidaCertificadosCupoAfiliado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeFinal = MENSAJE_VALIDACION_CUPO_AFILIADO.resolveFor(actor).containsText("Soportes de la transacción");
        return mensajeFinal;
    }
    public static ValidacionCompraRapidaCertificadosCupoAfiliado mensejeFinal() {
        return new ValidacionCompraRapidaCertificadosCupoAfiliado();
    }
}
