package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoExtraccionProponentes;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExtraccionProponentesStepDefinitions {

    @Then("realizo el proceso de extraccion de proponentes")
    public void realizoElProcesoDeExtraccionDeProponentes(){
        theActorInTheSpotlight().attemptsTo(FlujoExtraccionProponentes.extraccionProponentes());
    }
}
