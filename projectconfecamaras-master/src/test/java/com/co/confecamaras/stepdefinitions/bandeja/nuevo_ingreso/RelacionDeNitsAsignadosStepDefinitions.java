package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;




import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.RelacionDeNitsAsignadosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RelacionDeNitsAsignadosStepDefinitions {

    @Entonces("realizara acciones de Relación de Nits Asignados")
    public void realizaraaccionesDeRelacionDeNitsAsignados() {
        OnStage.theActorInTheSpotlight().attemptsTo(RelacionDeNitsAsignadosTask.estadisticasYextracciones());
    }
}
