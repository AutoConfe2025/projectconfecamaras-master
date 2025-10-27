package com.co.confecamaras.questions.consultasytransacciones;

import com.co.confecamaras.userinterfaces.cargapresupuesto.CargaPresupuestoPage;
import com.co.confecamaras.userinterfaces.consultasytransacciones.SolicitarClaveClavePage;
import com.co.confecamaras.utils.consultasytransacciones.GenerarClaveConstans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class MensajeCambioDeClave implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(SolicitarClaveClavePage.MODAL_MENSAJE_GENERACION).answeredBy(actor);
    }

    public static MensajeCambioDeClave es(){
        return new MensajeCambioDeClave();
    }
}
