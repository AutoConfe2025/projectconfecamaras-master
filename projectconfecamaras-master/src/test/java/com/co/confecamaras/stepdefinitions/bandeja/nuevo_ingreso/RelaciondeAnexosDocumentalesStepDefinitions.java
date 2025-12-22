package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;







import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.RelaciondeAnexosDocumentalesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RelaciondeAnexosDocumentalesStepDefinitions {


    @Entonces("realizara acciones de Relacion de Anexos Documentales")
    public void realizaraaccionesDeRelaciondeAnexosDocumentales() {
        OnStage.theActorInTheSpotlight().attemptsTo(RelaciondeAnexosDocumentalesTask.Escaneo());
    }
}
