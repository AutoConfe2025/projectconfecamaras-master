package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.DirectLinkRenovacionesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class DirectLinkRenovacionesStepDefinitions {

    @Entonces("realizara acciones de Direct Link Renovaciones")
    public void realizaraaccionesDeDirectLinkRenovaciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(DirectLinkRenovacionesTask.estadisticasYextracciones());
    }
}
