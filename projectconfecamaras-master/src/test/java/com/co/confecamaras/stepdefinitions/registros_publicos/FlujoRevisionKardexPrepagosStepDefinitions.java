package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoRevisionKardexPrepagos;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRevisionKardexPrepagosStepDefinitions {

    @Then("realizo el flujo de revision kardex prepagos")
    public void realizoElFlujoDeRevisionKardexPrepagos(){
        theActorInTheSpotlight().attemptsTo(FlujoRevisionKardexPrepagos.revisionKardexPrepago());
    }
}
