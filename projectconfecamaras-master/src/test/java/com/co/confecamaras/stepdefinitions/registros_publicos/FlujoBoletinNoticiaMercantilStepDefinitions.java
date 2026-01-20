package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoBoletinNoticiaMercantil;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoBoletinNoticiaMercantilStepDefinitions {

    @Then("realizo el flujo de boletin de noticia mercantil")
    public void realizoElFlujoDeBoletinDeNoticiaMercantil() {
        theActorInTheSpotlight().attemptsTo(FlujoBoletinNoticiaMercantil.boletinMercantil());
    }
}
