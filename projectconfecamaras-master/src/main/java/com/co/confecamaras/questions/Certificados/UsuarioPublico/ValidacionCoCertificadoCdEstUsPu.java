package com.co.confecamaras.questions.Certificados.UsuarioPublico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCdEstUsPu.MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_CONSULTA_DETALLADA_ESTABLECIMIENTO;

public class ValidacionCoCertificadoCdEstUsPu implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensejeFinalvalidacio = MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_CONSULTA_DETALLADA_ESTABLECIMIENTO.resolveFor(actor).containsText("Tipo C.");
        return mensejeFinalvalidacio;
    }
    public static ValidacionCoCertificadoCdEstUsPu mensejeFinalvalidacio(){
                return new ValidacionCoCertificadoCdEstUsPu();
            }
}
