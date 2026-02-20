package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.tasks.renovaciones.Esadl_catorce_caja.FlujoEsadlCatorceCaja;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoEsadlCatorceCajaStepDefinitions {

    @Then("realizo el flujo de esadl con caja")
    public void realizoElFlujoDeEsadlCatorceConCaja() {
        theActorInTheSpotlight().attemptsTo(FlujoEsadlCatorceCaja.EsadlCaja());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
