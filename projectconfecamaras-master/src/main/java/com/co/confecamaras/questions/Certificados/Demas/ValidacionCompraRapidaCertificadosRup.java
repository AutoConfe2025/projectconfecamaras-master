package com.co.confecamaras.questions.Certificados.Demas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoOcEsadlUsPu.MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_ESADL;

public class ValidacionCompraRapidaCertificadosRup implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeFinal = MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_ESADL.resolveFor(actor).containsText("Ver documento");
        return mensajeFinal;
    }
    public static ValidacionCompraRapidaCertificadosRup mensejeFinal() {
        return new ValidacionCompraRapidaCertificadosRup();
    }
}
