package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.TYCTask;
import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ZonasYComunasTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class TYCStepDefinitions {

    @Entonces("realizara acciones de T Y C")
    public void realizaraaccionesDeTYC() {
        OnStage.theActorInTheSpotlight().attemptsTo(TYCTask.administracion());
    }
}
