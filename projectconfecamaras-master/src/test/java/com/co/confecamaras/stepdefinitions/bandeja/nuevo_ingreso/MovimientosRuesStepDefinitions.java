package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.MovimientosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class MovimientosRuesStepDefinitions {

    @Entonces("realizara acciones de movimiento Rues")
    public void realizaraaccionesDeMovimientoRues() {
        OnStage.theActorInTheSpotlight().attemptsTo(MovimientosTask.RUES());
    }
}
