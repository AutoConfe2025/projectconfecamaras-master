package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoExtraccionNorenovadosSS1727;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoExtraccionNoRenovados1727StepDefinitions {

    @Then("realizo el flujo de extraccion no renovados ss - 1727")
    public void realizoElFlujoDeExtraccionNoRenovadosSs1727(){
        theActorInTheSpotlight().attemptsTo(FlujoExtraccionNorenovadosSS1727.ExtraccionSS1727());
    }
}
