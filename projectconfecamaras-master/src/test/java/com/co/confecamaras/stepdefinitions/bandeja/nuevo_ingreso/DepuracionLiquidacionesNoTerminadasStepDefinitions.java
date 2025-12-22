package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.DepuracionLiquidacionesNoTerminadasTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class DepuracionLiquidacionesNoTerminadasStepDefinitions {

    @Entonces("realizara acciones de Depuración liquidaciones no terminadas")
    public void realizaraaccionesDeDepuracionLiquidacionesNoTerminadas() {
        OnStage.theActorInTheSpotlight().attemptsTo(DepuracionLiquidacionesNoTerminadasTask.administracion());
    }
}
