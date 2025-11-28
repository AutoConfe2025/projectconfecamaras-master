package com.co.confecamaras.stepdefinitions.consultas_registros_nacionales;

import com.co.confecamaras.tasks.consultas_registros_nacionales.IngresaNit;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GeneralRues {

    @Then("ingreso el numero de NIT {string}")
    public void ingresoElNumeroDeNIT(String nit){
        theActorInTheSpotlight().attemptsTo(IngresaNit.Nit(nit));
    }
}
