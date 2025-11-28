package com.co.confecamaras.stepdefinitions.bandeja.tramites_no_archivados;

import com.co.confecamaras.tasks.Bandeja.relacion_radicaciones.ArchivarRelacionRadicaciones;
import com.co.confecamaras.tasks.Bandeja.tramites_no_archivados.ArchivarNoArchivados;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NoArchivadosStepDefinitions {

    @Then("realizo el proceso para archivar tramite no archivado {string} {string}")
    public void  realizoElProcesoParaArchivarRadicacion(String codigoBarras,String estadoFinal){
        theActorInTheSpotlight().attemptsTo(ArchivarNoArchivados.archivarProceso(codigoBarras, estadoFinal));
    }
}
