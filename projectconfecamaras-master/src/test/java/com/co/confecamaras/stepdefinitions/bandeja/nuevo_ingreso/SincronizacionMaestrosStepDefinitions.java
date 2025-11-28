package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.SincronizacionMaestrosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class SincronizacionMaestrosStepDefinitions {

    @Entonces("realizara acciones de sincronizacion maestros")
    public void realizaraaccionesDeSincronizacionMaestros() {
        OnStage.theActorInTheSpotlight().attemptsTo(SincronizacionMaestrosTask.jsp7());
    }
}
