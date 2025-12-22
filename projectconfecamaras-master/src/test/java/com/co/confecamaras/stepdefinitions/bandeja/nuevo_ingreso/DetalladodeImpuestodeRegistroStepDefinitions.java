package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;





import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.DetalladoImpuestodeRegistroTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class DetalladodeImpuestodeRegistroStepDefinitions {


    @Entonces("realizara acciones de Detallado de Impuesto de Registro")
    public void realizaraaccionesDeDetalladoImpuestodeRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(DetalladoImpuestodeRegistroTask.Gestiondecaja());
    }
}
