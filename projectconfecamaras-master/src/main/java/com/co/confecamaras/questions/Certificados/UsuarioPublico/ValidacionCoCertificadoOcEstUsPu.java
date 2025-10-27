package com.co.confecamaras.questions.Certificados.UsuarioPublico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoOcEstUsPu.MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_EST;

public class ValidacionCoCertificadoOcEstUsPu implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensejeFinalvalidacio = MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_EST.resolveFor(actor).containsText("Tipo C.");
        return mensejeFinalvalidacio;
    }
    public static ValidacionCoCertificadoOcEstUsPu mensejeFinalvalidacio() {
        return new ValidacionCoCertificadoOcEstUsPu();
    }
}
