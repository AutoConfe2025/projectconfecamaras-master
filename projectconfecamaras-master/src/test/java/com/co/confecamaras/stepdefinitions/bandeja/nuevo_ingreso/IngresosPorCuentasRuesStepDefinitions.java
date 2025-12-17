package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.IngresoPorCuentaTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class IngresosPorCuentasRuesStepDefinitions {

    @Entonces("realizara acciones de Ingresos por cuentas")
    public void realizaraaccionesDeMovimientoRues() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoPorCuentaTask.Cuenta());
    }
}
