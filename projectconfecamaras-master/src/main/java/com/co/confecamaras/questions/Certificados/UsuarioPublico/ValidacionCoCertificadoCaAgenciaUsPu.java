package com.co.confecamaras.questions.Certificados.UsuarioPublico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCaAgenciaUsPu.MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_CONSULTA_DETALLADA_SUCURSAL;


public class ValidacionCoCertificadoCaAgenciaUsPu implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensejeFinalvalidacio = MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_CONSULTA_DETALLADA_SUCURSAL.resolveFor(actor).containsText("Tipo C.");
        return mensejeFinalvalidacio;
    }
    public static ValidacionCoCertificadoCaAgenciaUsPu mensejeFinalvalidacio(){
        return new ValidacionCoCertificadoCaAgenciaUsPu();
    }
}
