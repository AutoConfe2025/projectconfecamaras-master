package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.tasks.renovaciones.antes_anio_2013.FlujoValoresAnio2013;
import com.co.confecamaras.tasks.renovaciones.antes_anio_2013.ValidacionAnio2013;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoIngresandoMatriculaStepDefinitions {

    @When("ingreso al modulo con matricula {string}")
    public void ingresoAlModuloConMatricula(String matricula){
        theActorInTheSpotlight().attemptsTo(FlujoValoresAnio2013.FlujoValoresAnio2013(matricula));
    }

    @Then("realizo el proceso de validacion del modulo a renovar")
    public void realizoElProcesoDeValidacionDelModuloARenovar(){
        theActorInTheSpotlight().attemptsTo(ValidacionAnio2013.validacionAnio2013());
    }
}
