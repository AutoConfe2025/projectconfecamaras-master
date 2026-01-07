package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoDetalleParaAnalisisCaja;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DetalladoCajaParaAnalisisStepDefinitions {

    @Then("realizo el flujo de detallado de caja para analisis")
    public void realizoElFlujoDeDetalladoDeCajaParaAnalisis(){
        theActorInTheSpotlight().attemptsTo(FlujoDetalleParaAnalisisCaja.analisisCajaDetalle());
    }
}
