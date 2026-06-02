package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.cancelacion_proponente.FlujoPagoCancelacionProponente;
import com.co.confecamaras.tasks.renovaciones.cancelacion_proponente.FlujoParaCancelacion;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoCancelacionProponenteStepDefinitions {

    @When("ingreso al modulo de cancelacion {string}")
    public void ingresoAlModuloDeCancelacion(String query){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoParaCancelacion.FlujoCancelaIngreso());
    }
    @When("realizo el proceso de cancelacion de proponente")
    public void realizoElProcesoDeCancelacionDeProponente(){
        theActorInTheSpotlight().attemptsTo(FlujoPagoCancelacionProponente.FlujoCancelacionPro());
    }
}
