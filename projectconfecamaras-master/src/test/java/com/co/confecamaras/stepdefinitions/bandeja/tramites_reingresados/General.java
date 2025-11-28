package com.co.confecamaras.stepdefinitions.bandeja.tramites_reingresados;

import com.co.confecamaras.tasks.Bandeja.general.FinalizarEscaneoDigitalizacion;
import com.co.confecamaras.tasks.Bandeja.general.IngresoEscanear;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class General {

    @Then("realizo el proceso de escanear")
    public void realizoElProcesoDeEscanear(){
        theActorInTheSpotlight().attemptsTo(IngresoEscanear.Escanear());
    }

    @Then("realizo el proceso de escaneo y revision")
    public void realizoElProcesoDeEscaneoYRevision(){
        theActorInTheSpotlight().attemptsTo(FinalizarEscaneoDigitalizacion.escaneoFinalizar());
    }
}
