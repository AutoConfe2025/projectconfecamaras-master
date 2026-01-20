package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.MaestroDeTramitesSinCostoTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class MaestroDeTramitesSinCostoStepDefinitions {

    @Entonces("realizara acciones de Maestro De Tramites Sin Costo")
    public void realizaraAccionesDeMaestroDeTramitesSinCosto() {
        OnStage.theActorInTheSpotlight().attemptsTo(MaestroDeTramitesSinCostoTask.EstadisticasyExtracciones());
    }
}
