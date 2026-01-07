package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.ContoInscripcionesLibros;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConteoInscripcionesLibrosStepDefinitions {

    @Then("realizo el flujo completo de conteo de inscripciones en libros")
    public void realizoElFlujoCompletoDeConteoDeInscripcionesEnLibros(){
        theActorInTheSpotlight().attemptsTo(ContoInscripcionesLibros.flujoControlLibros());
    }
}
