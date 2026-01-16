package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.MaestroClavesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class MaestrodeClavesStepDefinitions {

    @Entonces("realizara acciones de Maestro de Claves")
    public void realizaraAccionesDeMaestroDeClaves() {
        OnStage.theActorInTheSpotlight().attemptsTo(MaestroClavesTask.tablasBasicas());
    }
}
