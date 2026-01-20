package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ImportarPagoEnBancosAsobancaria2001Task;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ImportarPagoEnBancosAsobancaria2001StepDefinitions {

    @Entonces("realizara acciones de Importar Pago En Bancos Asobancaria 2001")
    public void realizaraaccionesDeImportarPagoEnBancosAsobancaria2001() {
        OnStage.theActorInTheSpotlight().attemptsTo(ImportarPagoEnBancosAsobancaria2001Task.estadisticasYextracciones());
    }
}
