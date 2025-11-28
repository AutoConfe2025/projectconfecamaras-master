package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.tasks.mantenimientoeinformes.ingreso_por_servicio.ValidaElModulo;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InigresoPorServicio {

    @Then("realizo la validacion del modulo ingreso por servicio")
    public void realizoLaValidacionDelModuloIngresoPorServicio() {
        theActorInTheSpotlight().attemptsTo(ValidaElModulo.IngresoPorServicio());
    }
}
