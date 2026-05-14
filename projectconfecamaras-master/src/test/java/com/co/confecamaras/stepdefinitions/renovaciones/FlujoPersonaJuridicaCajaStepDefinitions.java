package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.FlujoHastaValoresSinEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_juridica_caja.PrimerFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_esadl_clase_49_61.FlujoValoresEsadlClase4961;
import com.co.confecamaras.tasks.renovaciones.renovacion_esadl_clase_49_61.FormularioUnoEsadl4961;
import com.co.confecamaras.tasks.renovaciones.renovacion_persona_juridica_publico.RenovacionPersonaJuridicaPublico;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPersonaJuridicaCajaStepDefinitions {

    @When("realizo el flujo de valores sin establecimiento {string} {string}")
    public void realizoElFlujoDeValoresSinEstablecimiento(String valor, String query){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(RenovacionPersonaJuridicaPublico.renovacionPJPublico(valor));
    }

    @When("realizo el flujo de valores sin establecimiento clase 49 61 {string} {string}")
    public void realizoElFlujoDeValoresSinEstablecimientoClase(String valor, String query){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValoresEsadlClase4961.FlujoEsadl4961(valor));
    }

    @Then("realizo el flujo de renovacion persona juridica caja")
    public void realizoElFlujoDeRenovacionPersonaJuridicaCaja(){
        theActorInTheSpotlight().attemptsTo(PrimerFormulario.PrimerFormularioSinEstablecimiento());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }

    @Then("realizo el flujo de esadl 49 61")
    public void realizoElFlujoDeRenovacionEsadl4961(){
        theActorInTheSpotlight().attemptsTo(FormularioUnoEsadl4961.formularioUno());
    }
}
