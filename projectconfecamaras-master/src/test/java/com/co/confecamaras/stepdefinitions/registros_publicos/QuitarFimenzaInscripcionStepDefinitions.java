package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.QuitarFirmezaInscripcion;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class QuitarFimenzaInscripcionStepDefinitions {

    @Then("reealizo el flujo de quitar firmeza inscripcion")
    public void realizoFlujoQuitarFirmezaInscripcion(){
        theActorInTheSpotlight().attemptsTo(QuitarFirmezaInscripcion.quitarFirmeza());
    }
}
