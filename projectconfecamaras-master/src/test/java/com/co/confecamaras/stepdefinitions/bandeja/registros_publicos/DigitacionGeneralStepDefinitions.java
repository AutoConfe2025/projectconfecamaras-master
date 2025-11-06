package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionRegEsadlTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class DigitacionGeneralStepDefinitions {
    @Entonces("^validarlas acciones de general al codigo de barras (.+)$")
    public void validaraLasAccionesDeGeneralAlCodigoDeBarras(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(DigitacionRegEsadlTask.digitar(codigo_barras));
    }
}
