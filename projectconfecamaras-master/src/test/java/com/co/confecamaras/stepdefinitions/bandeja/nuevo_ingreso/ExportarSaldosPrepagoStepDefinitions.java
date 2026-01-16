package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ExportarSaldosPrepagoTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ExportarSaldosPrepagoStepDefinitions {

    @Entonces("realizara acciones de Exportar Saldos Prepago")
    public void realizaraaccionesDeRelacionDeExportarSaldosPrepago() {
        OnStage.theActorInTheSpotlight().attemptsTo(ExportarSaldosPrepagoTask.estadisticasYextracciones());
    }
}
