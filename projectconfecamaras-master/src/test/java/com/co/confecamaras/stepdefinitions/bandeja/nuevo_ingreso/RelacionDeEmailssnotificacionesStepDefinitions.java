

package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;




import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.RelacionDeEmailssnotificacionesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RelacionDeEmailssnotificacionesStepDefinitions {

    @Entonces("realizara acciones Relación de EMAILs notificaciones")
    public void realizaraaccionesDeRelacionDeEmailssnotificaciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(RelacionDeEmailssnotificacionesTask.estadisticasYextracciones());
    }
}
