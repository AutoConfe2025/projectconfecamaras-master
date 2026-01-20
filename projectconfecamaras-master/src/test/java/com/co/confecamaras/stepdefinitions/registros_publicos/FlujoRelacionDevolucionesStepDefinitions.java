package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.RelacionDevoluciones;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRelacionDevolucionesStepDefinitions {

    @Then("hago el flujo de relacion de devoluciones")
    public void hagoElFlujoDeRelacionDeDevoluciones(){
        theActorInTheSpotlight().attemptsTo(RelacionDevoluciones.Devoluciones());
    }
}
