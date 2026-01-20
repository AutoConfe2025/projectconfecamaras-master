package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoSimulacionPagosElectronicos;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoSimulacionPagosElectronicosStepDefinitions {

    @Then("realizo el flujo de simulacion de pagos electronicos")
    public void realizoElFlujoDeSimulacionDePagosElectronicos(){
        theActorInTheSpotlight().attemptsTo(FlujoSimulacionPagosElectronicos.simulacionPagoElectronico());
    }
}
