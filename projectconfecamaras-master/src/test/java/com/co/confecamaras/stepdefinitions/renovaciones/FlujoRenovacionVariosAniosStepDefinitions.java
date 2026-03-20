package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_varios_anios.FlujoValoresVariosAnios;
import com.co.confecamaras.tasks.renovaciones.renovacion_varios_anios.PrimerFormularioVariosAnios;
import com.co.confecamaras.tasks.renovaciones.renovacion_varios_anios.SegundoFormularioVariosAnios;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRenovacionVariosAniosStepDefinitions {

    @When("realizo el flujo de valores varios anios {string} {string}")
    public void realizoElFlujoDeValoresVariosAnios(String query, String valor){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValoresVariosAnios.flujovaloresAnios(valor));
    }
    @Then("valido que se realice el proceso de varios anios")
    public void validoQueSeRealiceElProcesoDeVariosAnios(){
        theActorInTheSpotlight().attemptsTo(PrimerFormularioVariosAnios.flujoVarioAnios());
        theActorInTheSpotlight().attemptsTo(SegundoFormularioVariosAnios.formularioDosVariosAnios());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
