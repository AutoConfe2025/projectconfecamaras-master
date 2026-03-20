package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.tasks.renovaciones.renovaciones_suc_consulta_externa.FlujoValoresSucConsultaExterna;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoSucConsultaExternaStepDefinitions {

    @When("realizo el flujo de valores publico consulta externa SUC")
    public void realizoElFlujoDeValoresPublicoConsultaExternaSuc(){
        theActorInTheSpotlight().attemptsTo(FlujoValoresSucConsultaExterna.flujoValoresSucCE());
    }
}
