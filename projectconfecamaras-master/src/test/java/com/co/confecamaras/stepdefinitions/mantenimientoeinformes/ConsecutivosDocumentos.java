package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.tasks.mantenimientoeinformes.consecutivo_documentos.FlujoConsecutivosDocumentos;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsecutivosDocumentos {

    @Then("realizo el proceso de grabacion email {string} {string}")
    public void realizoElProcesoDeGrabacionEmail(String numero, String numero2){
        theActorInTheSpotlight().attemptsTo(FlujoConsecutivosDocumentos.DocumentosFlujo(numero, numero2));

    }
}
