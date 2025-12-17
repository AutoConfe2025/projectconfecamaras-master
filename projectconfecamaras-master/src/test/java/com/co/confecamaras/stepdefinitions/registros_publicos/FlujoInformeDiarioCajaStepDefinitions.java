package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoInformeCaja;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoInformeDiarioCajaStepDefinitions {

    @Then("realizo las validaciones sobre el modulo de informe diario de caja {string}")
    public void realizoLasValidacionesSobreElModuloDeInformeDiarioDeCaja(String bandeja) {
        theActorInTheSpotlight().attemptsTo(FlujoInformeCaja.flujoCajaDiario(bandeja));
    }

}
