package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.RevisarAnexosLiquidacion;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRevisarAnexosLiquidacionStepDefinitions {

    @Then("realizo el flujo de revisar anexos liquidacion")
    public void realizoElFlujoDeRevisarAnexosLiquidacion(){
        theActorInTheSpotlight().attemptsTo(RevisarAnexosLiquidacion.revisarAnexos());
    }
}
