package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.tasks.renovaciones.persona_juridica_est_caja.FlujoPrimerFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_juridica_est_caja.FlujoSegundoFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPersonaJuridicaEstCajaStepDefinitions {

    @Then("realizo el flujo de persona juridica establecimiento caja")
    public void realizoElFormularioDeRegistroMetriculaMercantil() {
        theActorInTheSpotlight().attemptsTo(FlujoPrimerFormulario.FormularioUnoPJ());
        theActorInTheSpotlight().attemptsTo(FlujoSegundoFormulario.SegundoFLujoFormulario());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
