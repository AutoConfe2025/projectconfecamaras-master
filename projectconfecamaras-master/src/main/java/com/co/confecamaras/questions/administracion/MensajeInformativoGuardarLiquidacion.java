package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.administracion.MttoCodigoBarrasPage.ESTADO_ARCHIVADO;
import static com.co.confecamaras.userinterfaces.administracion.MttoLiquidacionPage.MENSAJE_INFORMATIVOS;

public class MensajeInformativoGuardarLiquidacion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(MENSAJE_INFORMATIVOS).answeredBy(actor);
    }

    public static MensajeInformativoGuardarLiquidacion es(){
        return new MensajeInformativoGuardarLiquidacion();
    }
}
