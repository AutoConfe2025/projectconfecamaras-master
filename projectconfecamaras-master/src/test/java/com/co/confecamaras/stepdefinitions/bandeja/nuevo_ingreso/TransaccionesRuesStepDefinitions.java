package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.TransaccionesRuesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class TransaccionesRuesStepDefinitions {

    @Entonces("realizara acciones de Transacciones Rues")
    public void realizaraAccionesDeTransaccionesRues() {
        OnStage.theActorInTheSpotlight().attemptsTo(TransaccionesRuesTask.rues());
    }
}
