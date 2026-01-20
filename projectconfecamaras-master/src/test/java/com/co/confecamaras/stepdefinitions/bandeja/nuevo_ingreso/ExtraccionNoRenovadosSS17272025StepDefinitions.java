package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ExtraccionNoRenovadosSS17272025Task;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ExtraccionNoRenovadosSS17272025StepDefinitions {

    @Entonces("realizara acciones de Extraccion No renovados SS - 1727 2025")
    public void realizaraaccionesDeExtraccionNoRenovadosSS17272025() {
        OnStage.theActorInTheSpotlight().attemptsTo(ExtraccionNoRenovadosSS17272025Task.estadisticasYextracciones());
    }
}
