package com.co.confecamaras.stepdefinitions.bandeja.relacion_radicacion;

import com.co.confecamaras.tasks.Bandeja.relacion_radicaciones.ArchivarRelacionRadicaciones;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RelacionStepDefinitions {

    @Then("realizo el proceso para archivar radicacion {string} {string}")
    public void  realizoElProcesoParaArchivarRadicacion(String codigoBarras,String estadoFinal){
        theActorInTheSpotlight().attemptsTo(ArchivarRelacionRadicaciones.archivarProceso(codigoBarras,estadoFinal));
    }
}
