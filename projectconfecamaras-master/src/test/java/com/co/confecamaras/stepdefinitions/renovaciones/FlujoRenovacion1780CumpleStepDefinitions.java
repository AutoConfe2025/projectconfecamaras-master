package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoPrimerFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_1780_cumple.FlujoValoresCumple1780;
import com.co.confecamaras.tasks.renovaciones.renovacion_1780_cumple.SegunfoFormulario1780;
import com.co.confecamaras.tasks.renovaciones.renovacion_1780_no_cumple.FlujoValoresNoCumple;
import com.co.confecamaras.tasks.renovaciones.renovacion_1780_no_cumple.SegundoFormularioNoCumple;
import com.co.confecamaras.tasks.renovaciones.renovacion_pn_afiliada.SegundoFormularioAfiliacion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRenovacion1780CumpleStepDefinitions {

    @When("realizo el flujo de valores ley 1780 cumple {string}")
    public void realizoElFlujoDeValoresLey1780Cumple(String query){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValoresCumple1780.ValoresCumpleLey1780());
    }

    @When("realizo el flujo de valores ley 1780 no cumple {string} {string}")
    public void realizoElFlujoDeValoresLey1780NoCumple(String query, String valor){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValoresNoCumple.NocCumpleValores(valor));
    }

    @Then("realizjo el flujo de renovacion con ley 1780 cumple")
    public void realizoElFlujoDeRenovacionConLey1780Cumple() {
        theActorInTheSpotlight().attemptsTo(FlujoPrimerFormulario.flujoPrimerFormularioExterno());
        theActorInTheSpotlight().attemptsTo(SegunfoFormulario1780.SegundoForm1780Cumple());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }

    @Then("realizjo el flujo de renovacion con ley 1780 no cumple")
    public void realizoElFlujoDeRenovacionConLey1780NoCumple() {
        theActorInTheSpotlight().attemptsTo(FlujoPrimerFormulario.flujoPrimerFormularioExterno());
        theActorInTheSpotlight().attemptsTo(SegundoFormularioNoCumple.SegundoNoCumple());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
