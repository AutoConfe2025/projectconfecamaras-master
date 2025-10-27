package com.co.confecamaras.questions.Certificados.UsuarioPublico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCdPpUsPu.MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_CONSULTA_DETALLADA_PROPONENTE;

public class ValidacionCoCertificadoCdPpUsPu implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
                boolean mensejeFinalvalidacio = MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_CONSULTA_DETALLADA_PROPONENTE.resolveFor(actor).containsText("Tipo C.");
                        return mensejeFinalvalidacio;
    }
            public static ValidacionCoCertificadoCdPpUsPu mensejeFinalvalidacio(){
                return new ValidacionCoCertificadoCdPpUsPu();
            }
}
