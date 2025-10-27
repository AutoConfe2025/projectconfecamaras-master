package com.co.confecamaras.questions.Certificados.UsuarioPublico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoOcAgenciaUsPu.MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_AGENCIA;

public class ValidacionCoCertificadoOcAgenciaUsPu implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensejeFinalvalidacio = MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_AGENCIA.resolveFor(actor).containsText("Tipo C.");
        return mensejeFinalvalidacio;
    }
    public static ValidacionCoCertificadoOcAgenciaUsPu mensejeFinalvalidacio(){
        return new ValidacionCoCertificadoOcAgenciaUsPu();
    }
}
