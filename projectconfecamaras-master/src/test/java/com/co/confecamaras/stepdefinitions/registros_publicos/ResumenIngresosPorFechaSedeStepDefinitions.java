package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoResumenIngresoPorFecha;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ResumenIngresosPorFechaSedeStepDefinitions {

    @Then("realizo el flujo de resumen de ingresos")
    public void realizoFlujoResumenIngresos(){
        theActorInTheSpotlight().attemptsTo(FlujoResumenIngresoPorFecha.FlujoSedeYFecha());
    }
}
