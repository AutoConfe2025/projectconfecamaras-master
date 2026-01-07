package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;





import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.SincronizarTarifasTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class SincronizarTarifasStepDefinitions {

    @Entonces("realizara acciones de  Sincronizar Tarifas")
    public void realizaraaccionesDeSincronizarTarifas() {
        OnStage.theActorInTheSpotlight().attemptsTo(SincronizarTarifasTask.administracion());
    }
}
