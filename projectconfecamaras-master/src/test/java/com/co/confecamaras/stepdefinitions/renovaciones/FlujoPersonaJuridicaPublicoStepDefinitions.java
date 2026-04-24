package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.SoloRecibirPago;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoFirmaElectronica;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoValidacionRecibo;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_persona_juridica_publico.PrimerFormularioPublico;
import com.co.confecamaras.tasks.renovaciones.renovacion_persona_juridica_publico.RenovacionPersonaJuridicaPublico;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPersonaJuridicaPublicoStepDefinitions {

    @When("realizo el flujo de valores sin establecimiento usuario publico {string} {string}")
    public void realizoElFlujoDeValoresSinEstablecimientoUsuarioPublico(String valor, String query) {
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(RenovacionPersonaJuridicaPublico.renovacionPJPublico(valor));
    }

    @Then("realizo el flujo persona juridica publico sin firma")
    public void realizoElFlujoPersonaJuridicaPublicoSinFirma() {
        theActorInTheSpotlight().attemptsTo(PrimerFormularioPublico.primerFormularioP());
        theActorInTheSpotlight().attemptsTo(SoloRecibirPago.soloRecibePago());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }

    @Then("realizo el flujo persona juridica publico")
    public void realizoElFlujoPersonaJuridicaPublico() {
        theActorInTheSpotlight().attemptsTo(PrimerFormularioPublico.primerFormularioP());
        theActorInTheSpotlight().attemptsTo(FlujoFirmaElectronica.FlujoFirma());
        theActorInTheSpotlight().attemptsTo(PagoUsuarioPublicoNoPresencial.enConfecamaras());
        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }
}
