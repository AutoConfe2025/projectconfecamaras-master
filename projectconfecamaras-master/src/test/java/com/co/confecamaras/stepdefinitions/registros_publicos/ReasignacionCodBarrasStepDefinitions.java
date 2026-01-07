package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoReasignacionCodBarrasRegistro;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReasignacionCodBarrasStepDefinitions {

    @Then("realizo el flujo del proceso de reasignacion {string}")
    public void realizoElFlujoDelProcesoDeReasignacionIgualEste(String codigo) {
        theActorInTheSpotlight().attemptsTo(FlujoReasignacionCodBarrasRegistro.FlujoreasignacionCodigo(codigo));
    }
}
