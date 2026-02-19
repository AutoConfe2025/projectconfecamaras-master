package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.FlujoHastaValoresSinEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_juridica_caja.PrimerFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPersonaJuridicaCajaStepDefinitions {

    @When("realizo el flujo de valores sin establecimiento {string} {string}")
    public void realizoElFlujoDeValoresSinEstablecimiento(String valor, String query){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoHastaValoresSinEstablecimiento.FlujoSinEstablecimiento(valor));
    }

    @Then("realizo el flujo de renovacion persona juridica caja")
    public void realizoElFlujoDeRenovacionPersonaJuridicaCaja(){
        theActorInTheSpotlight().attemptsTo(PrimerFormulario.PrimerFormularioSinEstablecimiento());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
