package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.questions.registros_publicos.ValidaRegistrosPublicos;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRegistrarPublicarReporteEEStepDefinitions {

    @Then("valido la generacion del reporte E.E")
    public void validoLaGeneracionDelReporteEe() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidaRegistrosPublicos.registroReporteEE()));
    }
}
