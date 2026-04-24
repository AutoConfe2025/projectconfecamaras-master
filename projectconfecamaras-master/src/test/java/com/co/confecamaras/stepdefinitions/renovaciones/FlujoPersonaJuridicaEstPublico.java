package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.SoloRecibirPago;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_juridica_establecimiento_publico.FlujoPersonaJuridicaEstablecimientoPublicoSegundoFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_juridica_establecimiento_publico.FlujoValoresConEstablecimientoPublico;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoFirmaElectronica;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoValidacionRecibo;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_persona_juridica_publico.PrimerFormularioPublico;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPersonaJuridicaEstPublico {

    @When("realizo el flujo de valores con establecimiento usuario publico {string} {string}")
    public void realizoElFlujoDeValoresConEstablecimientoUsuarioPublico(String valor, String query){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValoresConEstablecimientoPublico.flujoConestablecimientoPublico(valor));
    }

    @Then("realizo el flujo de persona juridica establecimiento publico sin firma")
    public void realizoElFlujoDePersonaJuridicaEstablecimientoPublicoSinFirma(){
        theActorInTheSpotlight().attemptsTo(PrimerFormularioPublico.primerFormularioP());
        theActorInTheSpotlight().attemptsTo(FlujoPersonaJuridicaEstablecimientoPublicoSegundoFormulario.segundoFormulario());
        theActorInTheSpotlight().attemptsTo(SoloRecibirPago.soloRecibePago());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }

    @Then("realizo el flujo de persona juridica establecimiento publico")
    public void realizoElFlujoDePersonaJuridicaEstablecimientoPublico(){
        theActorInTheSpotlight().attemptsTo(PrimerFormularioPublico.primerFormularioP());
        theActorInTheSpotlight().attemptsTo(FlujoPersonaJuridicaEstablecimientoPublicoSegundoFormulario.segundoFormulario());
        theActorInTheSpotlight().attemptsTo(FlujoFirmaElectronica.FlujoFirma());
        theActorInTheSpotlight().attemptsTo(PagoUsuarioPublicoNoPresencial.enConfecamaras());
        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }
}
