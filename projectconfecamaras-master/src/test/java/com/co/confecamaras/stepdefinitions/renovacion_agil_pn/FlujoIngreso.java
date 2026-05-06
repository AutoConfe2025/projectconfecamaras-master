package com.co.confecamaras.stepdefinitions.renovacion_agil_pn;

import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoValidacionRecibo;
import com.co.confecamaras.tasks.renovaciones.renovacion_agil.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoIngreso {

    @When("realizo el primer flujo de renovacion agil PN")
    public void realizoElPrimerFlujoDeRenovacionAgilPn(){
        theActorInTheSpotlight().attemptsTo(FlujoValoresAgilPN.FlujoValores());
    }

    @Then("realizo el flujo de renovacion agil")
    public void realizoElFlujoDeRenovacionAgil(){
        theActorInTheSpotlight().attemptsTo(PrimerFormularioAgil.primerFormAgil());
        theActorInTheSpotlight().attemptsTo(SegundoFormularioAgil.segunFormAgil());
        theActorInTheSpotlight().attemptsTo(FlujoFirmaAgil.firmaAgil());
        theActorInTheSpotlight().attemptsTo(FlujoRecibirPagoFormAgil.PagoTuCompraAgil());
//        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }
}
