package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.tasks.renovaciones.esadl_catorce_caja.FlujoEsadCatorcePublico;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoFirmaElectronica;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoValidacionRecibo;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoEsadlCatorcePublicoStepDefinitions {

    @Then("realizo el flujo de esadl con usuario publico")
    public void realizoElFlujoDeEsadlConUsuarioPublico(){
        theActorInTheSpotlight().attemptsTo(FlujoEsadCatorcePublico.flujoEsadlCatocePublico());
        theActorInTheSpotlight().attemptsTo(FlujoFirmaElectronica.FlujoFirma());
        theActorInTheSpotlight().attemptsTo(PagoUsuarioPublicoNoPresencial.enConfecamaras());
        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }
}
