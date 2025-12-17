package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.ReingresoTramiteRues;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReingresoTramitesRuesStepDefinitions {

    @Then("ingreso al tramite devuelto y realizo las validaciones")
    public void ingresoAlTramiteDevueltoYRealizoLasValidaciones(){
        theActorInTheSpotlight().attemptsTo(ReingresoTramiteRues.flujoValidaRues());
    }
}
