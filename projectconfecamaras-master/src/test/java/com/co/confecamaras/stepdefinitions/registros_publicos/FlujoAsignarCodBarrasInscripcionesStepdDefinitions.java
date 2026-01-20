package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.AdministrarCodBarrasInscripciones;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoAsignarCodBarrasInscripcionesStepdDefinitions {

    @Then("valido el codigo de barras generado")
    public void validoElCodigoDeBarrasGenerado (){
        theActorInTheSpotlight().attemptsTo(AdministrarCodBarrasInscripciones.CodBarrasInscripciones());
    }
}
