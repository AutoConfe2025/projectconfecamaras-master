package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.InformesContraloriaTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class InformesContraloriaStepDefinitions {

    @Entonces("realizara acciones de Informes Contraloria")
    public void realizaraaccionesDeRelacionDeInformesContraloria() {
        OnStage.theActorInTheSpotlight().attemptsTo(InformesContraloriaTask.estadisticasYextracciones());
    }
}
