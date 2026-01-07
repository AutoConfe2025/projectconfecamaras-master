package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoinformeSIC;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoInformeSICStepDefinitions {

    @Then("realizo el proceso de informes SIC")
    public void realizoElProcesoDeInformesSic(){
        theActorInTheSpotlight().attemptsTo(FlujoinformeSIC.flujoSic());
    }
}
