package com.co.confecamaras.stepdefinitions.bandeja.revision_radicaciones;

import com.co.confecamaras.tasks.Bandeja.revision_radicaciones.ValidacionTodasRadicaciones;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RevisionRadicacionesStepDefinitions {

    @When("Cuando ingreso a la bandeja {string}")
    public void cuandoIngresoALaBandeja(String bandeja) {
        theActorInTheSpotlight().attemptsTo(ValidacionTodasRadicaciones.radicacionesFlujo(bandeja));
    }
}
