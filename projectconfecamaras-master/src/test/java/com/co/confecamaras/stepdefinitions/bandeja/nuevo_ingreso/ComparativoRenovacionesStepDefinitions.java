package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ComparativoRenovacionesTask;

import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ComparativoRenovacionesStepDefinitions {

    @Entonces("realizara acciones de Comparativo Renovaciones")
    public void realizaraaccionesDeComparativoRenovaciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(ComparativoRenovacionesTask.estadisticasYextracciones());
    }
}
