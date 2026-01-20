package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoExportarLogRegistro;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoExportarLogRegistrosStepDefinitions {

    @Then("realizo el flujo de exportar log de resgistros")
    public void realizoElFlujoDeExportarLogDeResgistros(){
        theActorInTheSpotlight().attemptsTo(FlujoExportarLogRegistro.ExportarLog());
    }
}
