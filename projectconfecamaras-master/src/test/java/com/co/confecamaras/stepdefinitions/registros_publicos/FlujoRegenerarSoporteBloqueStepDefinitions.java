package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.GenerarSoporteBloque;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRegenerarSoporteBloqueStepDefinitions {

    @Then("realizo el flujo de regenerar soportes bloque")
    public void realizoFlujoRegenerarSoportesBloque(){
        theActorInTheSpotlight().attemptsTo(GenerarSoporteBloque.generarSoporteBloque());
    }
}
