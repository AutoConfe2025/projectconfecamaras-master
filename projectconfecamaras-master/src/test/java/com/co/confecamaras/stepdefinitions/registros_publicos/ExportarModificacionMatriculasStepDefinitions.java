package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoExportarModificacionMatriculas;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExportarModificacionMatriculasStepDefinitions {

    @Then("realizo el flujo de exportar modificacion matriculas")
    public void realizoElFlujoDeExportarModificacionMatriculas(){
        theActorInTheSpotlight().attemptsTo(FlujoExportarModificacionMatriculas.flujoExportarMatriculas());
    }
}
