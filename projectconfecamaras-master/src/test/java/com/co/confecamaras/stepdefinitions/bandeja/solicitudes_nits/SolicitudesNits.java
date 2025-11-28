package com.co.confecamaras.stepdefinitions.bandeja.solicitudes_nits;

import com.co.confecamaras.tasks.Bandeja.solicitudes_nits.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SolicitudesNits {

    @When("ingreso a la bandeja {string}")
    public void ingresoLaFechaParaIngresarAlModulo(String bandeja) {
        theActorInTheSpotlight().attemptsTo(IngresoModulo.ingresoNits(bandeja));
    }

    @Then("ingreso la {string} en pendientes y realizo las validaciones")
    public void ingresoEnPendientesYRealizoLasValidaciones(String fecha) {
        theActorInTheSpotlight().attemptsTo(ValidaPendientes.ValidaPendientes(fecha));
    }

    @Then("ingreso la {string} en asignadas y realizo las validaciones")
    public void ingresoLaFechaEnAsignadasYRealizoLasValidaciones(String fecha) {
        theActorInTheSpotlight().attemptsTo(ValidaAsignadas.ValidaAsignada(fecha));
    }

    @Then("ingreso la {string} en erroneas y realizo las validaciones")
    public void ingresoLaFechaEnErrorneaYRealizoLasValidaciones(String fecha) {
        theActorInTheSpotlight().attemptsTo(ValidaErroneas.ValidaErronea(fecha));
    }

    @Then("ingreso la {string} en comerciantes sin NIT y realizo las validaciones")
    public void ingresoLaFechaEnComerciantesYRealizoLasValidaciones(String fecha) {
        theActorInTheSpotlight().attemptsTo(ValidarNits.validaNits(fecha));
    }
}
