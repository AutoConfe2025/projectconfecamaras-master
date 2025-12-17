package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.CambioDomicilio;
import com.co.confecamaras.tasks.registro_publico.ValidacionesCambioProponente;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoCambioDomicilioProponente {

    @Then("realizo el flujo de cambio de domicilio de proponentes {string}")
    public void realizoElFlujoDeCambioDeDomicilioDeProponentes(String nit) {
        theActorInTheSpotlight().attemptsTo(CambioDomicilio.cambioDomicilioQr(nit));
    }

    @And("ingreso de nuevo al ambiente y hago las validaciones {string}")
    public void ingresoDeNuevoAlAmbienteYhagoLasValidaciones(String bandeja) {
        theActorInTheSpotlight().attemptsTo(ValidacionesCambioProponente.validacionesCambio(bandeja));
    }
}
