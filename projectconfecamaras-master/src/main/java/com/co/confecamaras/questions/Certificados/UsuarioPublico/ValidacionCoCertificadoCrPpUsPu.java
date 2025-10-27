package com.co.confecamaras.questions.Certificados.UsuarioPublico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCrPpUsPu.MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_RUP;

public class ValidacionCoCertificadoCrPpUsPu implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensejeFinalvalidacio = MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_RUP.resolveFor(actor).containsText("Tipo C.");
        return mensejeFinalvalidacio;
    }
    public static ValidacionCoCertificadoCrPpUsPu mensejeFinalvalidacio(){
        return new ValidacionCoCertificadoCrPpUsPu();
    }
}
