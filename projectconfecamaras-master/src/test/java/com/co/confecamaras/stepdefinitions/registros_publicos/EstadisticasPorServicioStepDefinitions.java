package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoEstadisticasPorServicio;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EstadisticasPorServicioStepDefinitions {

    @Then("realizo el flujo de estadistivas por servicio")
    public void realizoElFlujoDeEstadistivasPorServicio(){
        theActorInTheSpotlight().attemptsTo(FlujoEstadisticasPorServicio.flujoPorServicio());
    }
}
