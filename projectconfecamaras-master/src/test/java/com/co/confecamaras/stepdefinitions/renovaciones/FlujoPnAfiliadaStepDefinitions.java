package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoPrimerFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_pn_afiliada.FlujoValoresPnAfliada;
import com.co.confecamaras.tasks.renovaciones.renovacion_pn_afiliada.SegundoFormularioAfiliacion;
import com.co.confecamaras.tasks.renovaciones.renovacion_pn_renovada_reliquidacion.PrimerFlujoRenovadaReliquidacion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPnAfiliadaStepDefinitions {

    @When("realizo el flujo de valores pn afiliada {string}")
    public void realizoElFlujoDeValoresPnAfiliada(String query) {
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValoresPnAfliada.flujoValoresAfiliada());
    }

    @Then("realizjo el flujo de persona natural afiliada")
    public void realizoElFlujoDeBajaDeActivos() {
        theActorInTheSpotlight().attemptsTo(PrimerFlujoRenovadaReliquidacion.primerFlujoRenovadaRe());
        theActorInTheSpotlight().attemptsTo(SegundoFormularioAfiliacion.SegundoFormAfiliacion());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
