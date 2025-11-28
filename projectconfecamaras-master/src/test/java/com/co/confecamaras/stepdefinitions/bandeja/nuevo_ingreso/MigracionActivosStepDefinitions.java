package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.MigracionActivosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class MigracionActivosStepDefinitions {

    @Entonces("realizara acciones de migracion de activos")
    public void realizaraaccionesDeMigracionDeActivos() {
        OnStage.theActorInTheSpotlight().attemptsTo(MigracionActivosTask.jsp7());
    }
}
