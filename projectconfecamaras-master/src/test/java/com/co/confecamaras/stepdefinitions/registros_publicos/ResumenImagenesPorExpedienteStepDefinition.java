package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoResumenImageneExpediente;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ResumenImagenesPorExpedienteStepDefinition {

    @Then("valido el flujo completo resumen de imagenes por expedientes")
    public void validoElFlujoCompletoResumenDeImagenesPorExpedientes(){
        theActorInTheSpotlight().attemptsTo(FlujoResumenImageneExpediente.ExpedienteImagenes());
    }
}
