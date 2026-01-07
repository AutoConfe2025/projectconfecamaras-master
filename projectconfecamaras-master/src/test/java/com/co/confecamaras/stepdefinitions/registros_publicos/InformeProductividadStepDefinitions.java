package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoInformeProductividad;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InformeProductividadStepDefinitions {

    @Then("realizo el flujo de informe de productividad")
    public void realizoElFlujoDeInformeDeProductividad(){
        theActorInTheSpotlight().attemptsTo(FlujoInformeProductividad.informeProductiidad());
    }
}
