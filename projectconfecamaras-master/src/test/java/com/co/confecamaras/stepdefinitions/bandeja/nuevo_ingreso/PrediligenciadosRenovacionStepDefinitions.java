package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.PrediligenciadosRenovacionTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class PrediligenciadosRenovacionStepDefinitions {

    @Entonces("realizara acciones de Prediligenciados Renovacion")
    public void realizaraaccionesDePrediligenciadosRenovacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(PrediligenciadosRenovacionTask.estadisticasYextracciones());
    }
}
