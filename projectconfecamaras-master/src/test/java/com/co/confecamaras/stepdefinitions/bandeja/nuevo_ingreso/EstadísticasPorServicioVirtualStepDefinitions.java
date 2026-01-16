package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;




import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.EstadisticasPorServicioVirtualTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class EstadísticasPorServicioVirtualStepDefinitions {

    @Entonces("realizara acciones de Estadísticas por Servicio Virtual")
    public void realizaraaccionesDeEstadísticasPorServicioVirtual() {
        OnStage.theActorInTheSpotlight().attemptsTo(EstadisticasPorServicioVirtualTask.estadisticasYextracciones());
    }
}
