package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.BusquedaCodigoBarras;
import com.co.confecamaras.userinterfaces.registros_publicos.ValidaModuloDigitalizacionOff;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaCodigoBarrasStepDefinitions {

    @Then("consulto el proceso con el numero de codigo {string}")
    public void consultoElProcesoConElNumeroDeCodigo(String codigo){
        theActorInTheSpotlight().attemptsTo(BusquedaCodigoBarras.consultaCodigo(codigo));
    }

    @And("realizo las validaciones correspondientes del modulo")
    public void realizoLasValidacionesCorrespondientesDelModulo(){
        theActorInTheSpotlight().attemptsTo(ValidaModuloDigitalizacionOff.validacionesModuloDigitalizacionOff());
    }
}
