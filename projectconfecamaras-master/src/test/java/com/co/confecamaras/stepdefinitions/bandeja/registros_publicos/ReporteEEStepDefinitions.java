package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.ReportesEETask;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReporteEEStepDefinitions {

    @Entonces("exportara el archivo excel y finaliza validando")
    public void exportaraElArchivoExcelFinalizaValidando() {
        theActorInTheSpotlight().attemptsTo(ReportesEETask.verificarReporte());
    }
}
