package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.RelacionPlacasAsignadas;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRelacionPlacasAsignadosStepDefinitions {

    @Then("realizo el flujo de relacion de placas asignados")
    public void realizoElFlujoDeRelacionDePlacasAsignados(){
        theActorInTheSpotlight().attemptsTo(RelacionPlacasAsignadas.relacionPlacas());
    }
}
