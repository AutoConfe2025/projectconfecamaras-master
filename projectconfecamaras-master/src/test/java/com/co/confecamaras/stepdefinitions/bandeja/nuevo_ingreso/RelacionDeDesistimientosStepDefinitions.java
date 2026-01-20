package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.RelacionDeDesistimientosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RelacionDeDesistimientosStepDefinitions {

    @Entonces("realizara acciones de Relación de desistimientos")
    public void realizaraaccionesDeRelacionDeDesistimientos() {
        OnStage.theActorInTheSpotlight().attemptsTo(RelacionDeDesistimientosTask.estadisticasYextracciones());
    }
}
