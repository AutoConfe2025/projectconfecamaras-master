package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoInformacionExogenaRevision;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InformacionExogenaRevisionStepDefitnition {

    @Then("realizo el flujo de informacion exogena revision")
    public void realizoElFlujoDeInformacionExogenaRevision(){
        theActorInTheSpotlight().attemptsTo(FlujoInformacionExogenaRevision.informacionExogena());
    }
}
