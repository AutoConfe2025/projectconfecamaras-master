package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoValidacionRecibo;
import com.co.confecamaras.tasks.renovaciones.renovacion_agil_esadl.FlujoPagosEsadlAgil;
import com.co.confecamaras.tasks.renovaciones.renovacion_agil_pj.FlujoHastaPago;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRenovacionAgilPj {

    @When("realizo el flujo de renovacion agil pj {string}")
    public void realizoFlujoRenovacionAgilPj(String valor){
        theActorInTheSpotlight().attemptsTo(FlujoHastaPago.flujoPjHastaPago(valor));
    }

    @Then("realizo el proceso de pago agil pj")
    public void realizoProcesoPagoAgilPj(){
        theActorInTheSpotlight().attemptsTo(FlujoPagosEsadlAgil.pagosEsdalAgil());
        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }
}
