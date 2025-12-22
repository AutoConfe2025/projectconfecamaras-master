package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;





import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.EstudioSolicitudesCircular19Task;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class EstudioSolicitudesCircular19StepDefinitions {


    @Entonces("realizara acciones de Estudio Solicitudes Circular 19")
    public void realizaraaccionesDeEstudioSolicitudesCircular19() {
        OnStage.theActorInTheSpotlight().attemptsTo(EstudioSolicitudesCircular19Task.Abogados());   }
}
