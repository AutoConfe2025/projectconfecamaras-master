package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;




import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ResumendeIngresosPorSedeTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ResumendeIngresosPorSedeStepDefinitions {

    @Entonces("realizara acciones de Resumen de Ingresos por sede")
    public void realizaraaccionesDeResumenDeIngresosPorSede() {
        OnStage.theActorInTheSpotlight().attemptsTo(ResumendeIngresosPorSedeTask.estadisticasYextracciones());
    }
}
