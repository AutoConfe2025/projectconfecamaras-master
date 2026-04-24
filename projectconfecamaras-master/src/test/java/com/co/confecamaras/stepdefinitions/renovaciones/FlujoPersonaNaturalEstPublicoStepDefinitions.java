package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.SoloRecibirPago;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.*;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPersonaNaturalEstPublicoStepDefinitions {

    @When("realizo el flujo de valores usuario publico {string} {string}")
    public void realizoElFlujoDeValoresUsuarioPublico(String valor, String query) {
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValoresExterno.FLujoExterno(valor));
    }

    @Then("realizo el flujo de persona natural con establecimiento")
    public void realizoElFlujoDePersonaNaturalConEstablecimiento() {
        theActorInTheSpotlight().attemptsTo(FlujoPrimerFormulario.flujoPrimerFormularioExterno());
        theActorInTheSpotlight().attemptsTo(FlujoSegundoFormulario.segundoFormularioExterno());
        theActorInTheSpotlight().attemptsTo(SoloRecibirPago.soloRecibePago());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }

    @Then("realizo el flujo de persona natural con establecimiento y usuario publico externo")
    public void realizoElFlujoDePersonaNaturalConEstablecimientoYUsuarioPublicoExterno() {
        theActorInTheSpotlight().attemptsTo(FlujoPrimerFormulario.flujoPrimerFormularioExterno());
        theActorInTheSpotlight().attemptsTo(FlujoSegundoFormulario.segundoFormularioExterno());
        theActorInTheSpotlight().attemptsTo(FlujoFirmaElectronica.FlujoFirma());
        theActorInTheSpotlight().attemptsTo(PagoUsuarioPublicoNoPresencial.enConfecamaras());
        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }
}
