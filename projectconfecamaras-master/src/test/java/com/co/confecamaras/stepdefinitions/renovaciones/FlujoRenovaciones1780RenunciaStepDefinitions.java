package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoPrimerFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_1780_renuncia.FlujoValoresRenuncia;
import com.co.confecamaras.tasks.renovaciones.renovacion_1780_renuncia.SegundoFlujoRenuncia;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRenovaciones1780RenunciaStepDefinitions {

    @When("realizo el flujo de valores ley 1780 renuncia {string}")
    public void realizoElFlujoDeValoresLey1780Renuncia(String query){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValoresRenuncia.flujoRenuncia());
    }

    @Then("realizjo el flujo de renovacion con ley 1780 renuncia")
    public void realizoElFlujoDeRenovacionConLey1780Renuncia() {
        theActorInTheSpotlight().attemptsTo(FlujoPrimerFormulario.flujoPrimerFormularioExterno());
        theActorInTheSpotlight().attemptsTo(SegundoFlujoRenuncia.SegundoFormRenuncia());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
