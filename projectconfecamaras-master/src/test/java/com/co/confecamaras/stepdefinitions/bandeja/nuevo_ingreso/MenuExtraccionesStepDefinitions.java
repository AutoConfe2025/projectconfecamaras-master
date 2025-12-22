package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;






import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.MenuExtraccionesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class MenuExtraccionesStepDefinitions {


    @Entonces("realizara acciones de Resumido de Menu extracciones")
    public void realizaraaccionesDeResumidodeMenuExtracciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuExtraccionesTask.EstadisticasyExtracciones());
    }
}
