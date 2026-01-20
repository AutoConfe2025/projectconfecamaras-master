package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.FirmezaInscripcionesProponentesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class FirmezaInscripcionesProponentesStepDefinitions {

    @Entonces("realizara acciones de Firmeza Inscripciones Proponentes")
    public void realizaraaccionesDerealizaraFirmezaInscripcionesProponentes() {
        OnStage.theActorInTheSpotlight().attemptsTo(FirmezaInscripcionesProponentesTask.estadisticasYextracciones());
    }
}
