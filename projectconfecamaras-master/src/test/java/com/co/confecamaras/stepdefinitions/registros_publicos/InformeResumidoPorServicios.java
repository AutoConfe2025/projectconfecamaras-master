package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.ValidaInformServicios;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InformeResumidoPorServicios {

    @Then("realiza la validacion del informe resumido")
    public void realizaLaValidacionDelInformeResumido() {
        theActorInTheSpotlight().attemptsTo(ValidaInformServicios.validaInforme());
    }
}
