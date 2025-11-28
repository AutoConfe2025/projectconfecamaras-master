package com.co.confecamaras.stepdefinitions.bandeja;

import com.co.confecamaras.tasks.Bandeja.IngresoGeneralBandejas;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class General {

    @When("Cuando ingreso a la bandeja {string} {string} {string}")
    public void cuandoIngresoALaBandeja (String codigoBarras, String estadoFinal, String bandeja){
        theActorInTheSpotlight().attemptsTo(IngresoGeneralBandejas.ingresoBandeja(codigoBarras,estadoFinal,bandeja));
    }
}
