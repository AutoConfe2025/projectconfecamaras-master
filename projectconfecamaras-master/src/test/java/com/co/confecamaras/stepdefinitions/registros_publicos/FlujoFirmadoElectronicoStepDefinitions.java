package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoFirmadoElectronico;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoFirmadoElectronicoStepDefinitions {

    @Then("realizo el flujo de firmado electronico")
    public void realizoElFlujoDeFirmadoElectronico(){
        theActorInTheSpotlight().attemptsTo(FlujoFirmadoElectronico.firmadoElectronico());
    }
}
