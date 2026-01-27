package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.SoporteCaja;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoSoportesCajaStepDefinitions {

    @Then("realizo el flujo de soportes de caja")
    public void realizoFlujoSoportesCaja(){
        theActorInTheSpotlight().attemptsTo(SoporteCaja.soporteCaja());
    }
}
