package com.co.confecamaras.questions.Certificados.Demas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraCertidocadoOpcionAccionesSinCupoAfiliado.MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION;

public class ValidacionCompraCertidocadoOpcionAccionesSinCupoAfiliado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeFinal = MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION.resolveFor(actor).containsText("Soportes de la transacción");
        return mensajeFinal;
    }
    public static ValidacionCompraCertidocadoOpcionAccionesSinCupoAfiliado mensejeFinal() {
        return new ValidacionCompraCertidocadoOpcionAccionesSinCupoAfiliado();
    }
}
