package com.co.confecamaras.stepdefinitions.bandeja.control_calidad;

import com.co.confecamaras.tasks.Bandeja.general.*;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VerCertificadoStepDefinitions {

    @Then("valido el modulo de ver certificado")
    public void validoElModuloDeVerCertificado() {
        theActorInTheSpotlight().attemptsTo(IngresoVerCertificado.Validacertificado());
    }

    @Then("valido el modulo de digitacion")
    public void validoElModuloDeDigitacion() {
        theActorInTheSpotlight().attemptsTo(IngresoDigitacion.Digitacion());
    }

    @Then("confirmo el proceso de control de calidad")
    public void confirmoElProcesoDeControlDeCalidad() {
        theActorInTheSpotlight().attemptsTo(IngresoConfirmar.confirma());
    }

    @Then("confirmo el regreso de estudio")
    public void confirmoElRegresoDeEstudio() {
        theActorInTheSpotlight().attemptsTo(IngresoDeNuevoEstudio.regresoEstudio());
    }

    @Then("confirmo el regreso a digitacion")
    public void confirmoElRegresoADigitacion() {
        theActorInTheSpotlight().attemptsTo(IngresoRegresoDigitacion.regresoADigitacion());
    }
}
