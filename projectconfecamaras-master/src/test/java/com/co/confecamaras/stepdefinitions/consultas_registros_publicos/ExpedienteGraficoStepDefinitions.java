package com.co.confecamaras.stepdefinitions.consultas_registros_publicos;

import com.co.confecamaras.tasks.consultas_registros_publicos.FlujoExpedienteGrafico;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExpedienteGraficoStepDefinitions {

    @Then("realizo la validacion del flujo expediente grafico")
    public void realizoLaValidacionDelFlujoExpedienteGrafico(){
        theActorInTheSpotlight().attemptsTo(FlujoExpedienteGrafico.flujoExpedienteGrafico());
    }
}
