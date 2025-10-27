package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionRegMtilTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class DigitacionRegMtilStepDefinitions {
    @Entonces("^validara las acciones de mercantil pendiente relacionados al codigo de barras (.+)$")
    public void validaraLasAccionesDeMercantilPendienteRelacionadosAlCodigoDeBarras(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(DigitacionRegMtilTask.digitar(codigo_barras));
    }
}
