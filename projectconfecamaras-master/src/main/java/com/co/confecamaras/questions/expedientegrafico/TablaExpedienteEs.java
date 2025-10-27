package com.co.confecamaras.questions.expedientegrafico;

import com.co.confecamaras.questions.consultasytransacciones.TablaFormatosEs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.consultasytransacciones.FormulariosYFoematosPage.TABLA_FORMATOS;
import static com.co.confecamaras.userinterfaces.expedientegrafico.ExpedienteGraficoPage.TABLA_EXPEDIENTE;

public class TablaExpedienteEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tabla = TABLA_EXPEDIENTE.resolveFor(actor).isVisible();
        return tabla;
    }

    public static TablaExpedienteEs visible() {
        return new TablaExpedienteEs();
    }
}

