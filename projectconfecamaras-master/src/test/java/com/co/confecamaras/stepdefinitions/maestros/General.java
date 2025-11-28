package com.co.confecamaras.stepdefinitions.maestros;

import com.co.confecamaras.tasks.maestros.EditarEliminar;
import com.co.confecamaras.tasks.maestros.NuevoRegistro;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class General {

    @Then("Adiciono un registro nuevo en claves")
    public void AdicionoUnRegistroNuevoEnClaves() {
        theActorInTheSpotlight().attemptsTo(NuevoRegistro.NuevoRegistro());
    }

    @And("hago el proceso de modificacion y eliminacion")
    public void hagoElProcesoDeModificacionYEliminacion() {
        theActorInTheSpotlight().attemptsTo(EditarEliminar.editarEliminar());
    }
}
