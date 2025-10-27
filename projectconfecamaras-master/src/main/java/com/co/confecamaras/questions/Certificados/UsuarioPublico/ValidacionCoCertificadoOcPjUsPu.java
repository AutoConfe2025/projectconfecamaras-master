package com.co.confecamaras.questions.Certificados.UsuarioPublico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoOcPjUsPu.MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_PJ;

public class ValidacionCoCertificadoOcPjUsPu implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensejeFinalvalidacio = MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_PJ.resolveFor(actor).containsText("Tipo C.");
        return mensejeFinalvalidacio;
    }
    public static ValidacionCoCertificadoOcPjUsPu mensejeFinalvalidacio() {
        return new ValidacionCoCertificadoOcPjUsPu();
    }
}
