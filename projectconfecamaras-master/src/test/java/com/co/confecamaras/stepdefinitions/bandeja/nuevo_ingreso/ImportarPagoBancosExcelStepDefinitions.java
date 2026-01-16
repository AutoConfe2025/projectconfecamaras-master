package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ImportarPagoBancosExcelTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ImportarPagoBancosExcelStepDefinitions {

    @Entonces("realizara acciones de Importar pago bancos excel")
    public void realizaraaccionesDeImportarPagoBancosExcel() {
        OnStage.theActorInTheSpotlight().attemptsTo(ImportarPagoBancosExcelTask.estadisticasYextracciones());
    }
}
