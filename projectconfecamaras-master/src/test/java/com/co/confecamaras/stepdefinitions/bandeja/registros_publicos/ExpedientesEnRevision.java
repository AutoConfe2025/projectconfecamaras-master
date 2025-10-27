package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.ExpedientesEnRevisionTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ExpedientesEnRevision {
    @Entonces("realizara las acciones que se encuentran disponibles")
    public void realizaraLasAccionesQueSeEncuentranDisponibles() {
        OnStage.theActorInTheSpotlight().attemptsTo(ExpedientesEnRevisionTask.revisar());
    }
}
