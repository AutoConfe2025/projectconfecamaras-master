package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoValidacionRecibo;
import com.co.confecamaras.tasks.renovaciones.renovacion_agil_esadl.FlujoHastaPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_agil_esadl.FlujoPagosEsadlAgil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRenovacionesEsadlAgil {

    @When("realizo el flujo de renovacion agil esadl {string}")
    public void realizoFlujoRenovacionAgilEsadl(String valor){
        theActorInTheSpotlight().attemptsTo(FlujoHastaPago.hastaPago(valor));
    }

    @Then("realizo el pago del proceso")
    public void realizoElPagoDelProceso(){
        theActorInTheSpotlight().attemptsTo(FlujoPagosEsadlAgil.pagosEsdalAgil());
        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }
}
