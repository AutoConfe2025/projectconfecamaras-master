package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.actividad_no_comercial.FlujoRecibosRenovacionComercial;
import com.co.confecamaras.tasks.renovaciones.actividad_no_comercial.FlujoValoresComercial;
import com.co.confecamaras.tasks.renovaciones.actividad_no_comercial.PrimerFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoSegundoFormulario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoActividadNoComercialStepDefinitions {

    @When("realizo el flujo de valores actividad no comercial {string}")
    public void realizoElFlujoDeValoresActividadNoComercial(String query){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValoresComercial.ValorComercialEstablecimiento());
    }

    @Then("valido que se realice el pago del proceso de renovacion comercial")
    public void validoQueSeRealiceElPagoDelProcesoDeRenovacionComercial(){
        theActorInTheSpotlight().attemptsTo(PrimerFormulario.formlarioUnoComercial());
        theActorInTheSpotlight().attemptsTo(FlujoSegundoFormulario.segundoFormularioExterno());
        theActorInTheSpotlight().attemptsTo(FlujoRecibosRenovacionComercial.flujoRecibePago());
    }
}
