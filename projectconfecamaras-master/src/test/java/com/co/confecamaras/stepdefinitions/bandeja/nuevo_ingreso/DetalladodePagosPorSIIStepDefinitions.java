package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;




import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.RelacionDeConsultasBiometricasTask;

import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class DetalladodePagosPorSIIStepDefinitions {

    @Entonces("realizara acciones de Relacion de Consultas Biometricas")
    public void realizaraaccionesDeRelacionDeConsultasBiometricas() {
        OnStage.theActorInTheSpotlight().attemptsTo(RelacionDeConsultasBiometricasTask.estadisticasYextracciones());
    }
}
