package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.tasks.mantenimientoeinformes.empresas_cfe.EliminacionModificacion;
import com.co.confecamaras.tasks.mantenimientoeinformes.empresas_cfe.LlenaInforme;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EmpresasCFEStepDefinitions {

    @And("realizo el proceso de creacion de nueva entidad")
    public void realizoElProcesoDeCreacionDeNuevaEntidad() {
        theActorInTheSpotlight().attemptsTo(LlenaInforme.informeEmpresasCFE());
    }

    @Then("realizo proceso de modificacion y eliminacion")
    public void realizoProcesoDeModificacionYEliminacion() {
        theActorInTheSpotlight().attemptsTo(EliminacionModificacion.EliminaModificaCFE());
    }
}
