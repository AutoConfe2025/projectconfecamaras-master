package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.tasks.renovaciones.FlujoBotonRecibirPago;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_age_caja.FormularioAgeCaja;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRenoAgevacionStepDefinitions {

    @Then("realizo el flujo de renovacion Age")
    public void realizoElFlujoDeRenovacionAge(){
        theActorInTheSpotlight().attemptsTo(FormularioAgeCaja.renovacionAgeCaja());
        theActorInTheSpotlight().attemptsTo(FlujoBotonRecibirPago.flujoSoloBotonRecibirPago());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
