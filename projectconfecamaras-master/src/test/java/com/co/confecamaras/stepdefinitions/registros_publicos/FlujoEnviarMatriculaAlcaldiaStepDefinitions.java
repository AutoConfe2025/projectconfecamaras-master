package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoEnviarMatriculasAlcaldia;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoEnviarMatriculaAlcaldiaStepDefinitions {

    @Then("realizo el flujo de enviar matriculas a la alcaldia")
    public void realizoElFlujoDeEnviarMatriculasALaAlcaldia(){
        theActorInTheSpotlight().attemptsTo(FlujoEnviarMatriculasAlcaldia.enviarMatriculaAlcaldia());
    }
}
