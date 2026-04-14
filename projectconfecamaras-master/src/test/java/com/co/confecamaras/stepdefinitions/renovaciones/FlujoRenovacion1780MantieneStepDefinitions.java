package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoPrimerFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_1780_cumple.SegunfoFormulario1780;
import com.co.confecamaras.tasks.renovaciones.renovacion_1780_mantiene.FlujoValores1780Mantiene;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRenovacion1780MantieneStepDefinitions {

    @Then("realizo el flujo de valores ley 1780 mantiene {string}")
    public void realizoElFlujoDeValoresLey1780Mantiene(String query){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValores1780Mantiene.FlujoValoresMantiene());
    }

    @When("realizjo el flujo de renovacion con ley 1780 mantiene")
    public void realizoElFlujoDeRenovacionConLey1780Mantiene(){
        theActorInTheSpotlight().attemptsTo(FlujoPrimerFormulario.flujoPrimerFormularioExterno());
        theActorInTheSpotlight().attemptsTo(SegunfoFormulario1780.SegundoForm1780Cumple());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
