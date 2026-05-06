package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.tasks.Bandeja.correcciones.DataBandejaCorrecciones;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepPruebas {

    @Then("Realizo pruebas")
    public void RealizoPruebas(){
        theActorInTheSpotlight().attemptsTo(DataBandejaCorrecciones.CrearDataCorrecciones());
    }
}
