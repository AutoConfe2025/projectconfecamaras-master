package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoLevantarFirmadoElectronico;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoLevantarFirmadoElectronicoStepDefinitions {

    @Then("realizo el flujo de levantar firmado electronico")
    public void realizoElFlujoDeLevantarFirmadoElectronico(){
        theActorInTheSpotlight().attemptsTo(FlujoLevantarFirmadoElectronico.levantarFirmadoElectronico());
    }
}
