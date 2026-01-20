package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.RevisiondeRenvacionesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RevisiondeRenvacionesStepDefinitions {

    @Entonces("realizara acciones de Revision de Renvaciones")
    public void realizaraaccionesDeRelacionDeRevisiondeRenvaciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(RevisiondeRenvacionesTask.estadisticasYextracciones());
    }
}
