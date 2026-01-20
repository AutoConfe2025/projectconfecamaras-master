package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.RelacionLiquidaciones;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRelacionLiquidacionesStepDefinitions {

    @Then("realizo el flujo de relacion de liquidaciones")
    public void  realizoFlujoRelacionLiquidaciones(){
        theActorInTheSpotlight().attemptsTo(RelacionLiquidaciones.relacionLiquidaciones());
    }
}
