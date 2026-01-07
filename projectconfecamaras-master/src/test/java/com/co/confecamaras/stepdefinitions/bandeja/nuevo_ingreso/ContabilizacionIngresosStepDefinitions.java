package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ContabilizacionIngresosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ContabilizacionIngresosStepDefinitions {

    @Entonces("realizara acciones de contabilizacion ingresos")
    public void realizaraaccionesDeContabilizacionIngresos() {
        OnStage.theActorInTheSpotlight().attemptsTo(ContabilizacionIngresosTask.jsp7());
    }
}
