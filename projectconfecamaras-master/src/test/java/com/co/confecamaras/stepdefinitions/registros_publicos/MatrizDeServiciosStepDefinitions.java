package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoMAtrizServicios;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MatrizDeServiciosStepDefinitions {

    @Then("realizo el flujo de matriz de servicios")
    public void realizoElFlujoDeMatrizDeServicios(){
        theActorInTheSpotlight().attemptsTo(FlujoMAtrizServicios.matrizServicios());
    }
}
