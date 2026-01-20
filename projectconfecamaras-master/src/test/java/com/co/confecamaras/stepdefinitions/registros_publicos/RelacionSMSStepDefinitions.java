package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoRelacionDeSms;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RelacionSMSStepDefinitions {

    @Then("realizo el flujo de relacion de sms")
    public void realizoElFlujoDeRelacionDeSms(){
        theActorInTheSpotlight().attemptsTo(FlujoRelacionDeSms.RelacionSMS());
    }
}
