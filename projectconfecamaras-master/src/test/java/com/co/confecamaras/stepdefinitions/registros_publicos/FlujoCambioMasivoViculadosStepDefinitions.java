package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.CambioMasivoVinculados;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoCambioMasivoViculadosStepDefinitions {

    @Then("realizo el flujo de cambio masivo de vinculados")
    public void realizoElFlujoDeCambioMasivoDeVinculados(){
        theActorInTheSpotlight().attemptsTo(CambioMasivoVinculados.cambioMasivo());
    }
}
