package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_suc_caja.FormularioUnoSucCaja;
import com.co.confecamaras.tasks.renovaciones.renovacion_suc_caja.RenovacionSucCaja;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoSucCajaStepDefinitions {

    @When("realizo el flujo de valores caja {string}")
    public void realizoElFlujoDeValoresSucCaja(String query) {
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(RenovacionSucCaja.FlujoSucValores());
    }

    @Then("realizo el flujo de suc con caja")
    public void realizoElFlujoDeSucConCaja() {
        theActorInTheSpotlight().attemptsTo(FormularioUnoSucCaja.FormularioSucCaja());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
