package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.renovacion_pn_baja_activos.FlujoPnBajaActivos;
import com.co.confecamaras.tasks.renovaciones.baja_activos.PrimerFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.FlujoSegundoFormularioPersonaNaturalEstablecimientoCaja;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPnbajaActivosStepDefinitions {

    @When("realizo el flujo de valores baja activos {string}")
    public void realizoElFlujoDeValoresBajaActivos(String query) {
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoPnBajaActivos.bajosActivos());
    }

    @Then("realizjo el flujo de baja de activos")
    public void realizjoElFlujoDeBajaDeActivos() {
        theActorInTheSpotlight().attemptsTo(PrimerFormulario.primerFormularioBajaActivos());
        theActorInTheSpotlight().attemptsTo(FlujoSegundoFormularioPersonaNaturalEstablecimientoCaja.SegundoFormulario());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
