package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.InformesSSTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class InformesSStepDefinitions {

    @Entonces("realizara acciones de Informes SS")
    public void realizaraaccionesDeRelacionDeInformesSS() {
        OnStage.theActorInTheSpotlight().attemptsTo(InformesSSTask.estadisticasYextracciones());
    }
}
