package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.tasks.Bandeja.correcciones.DataBandejaCorrecciones;
import com.co.confecamaras.tasks.Bandeja.correcciones.DataBandejaCorrecciones1;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepPruebas {

    @Then("Realizo pruebas")
    public void RealizoPruebas(){
        theActorInTheSpotlight().attemptsTo(DataBandejaCorrecciones.CrearDataCorrecciones());
    }

    @Then("Realizo pruebas 1")
    public void RealizoPruebas1(){
        theActorInTheSpotlight().attemptsTo(DataBandejaCorrecciones1.CrearDataCorrecciones1());
    }
}
