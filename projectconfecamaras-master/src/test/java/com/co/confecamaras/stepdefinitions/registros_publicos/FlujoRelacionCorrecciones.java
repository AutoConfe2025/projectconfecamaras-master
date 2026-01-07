package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.RelacionCorrecciones;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRelacionCorrecciones {

    @Then("diligencio el formulario para el flujo de relacion de correcciones")
    public void diligencioElFormularioParaElFlujoDeRelacionDeCorrecciones(){
        theActorInTheSpotlight().attemptsTo(RelacionCorrecciones.relacionCorrecion());
    }
}
