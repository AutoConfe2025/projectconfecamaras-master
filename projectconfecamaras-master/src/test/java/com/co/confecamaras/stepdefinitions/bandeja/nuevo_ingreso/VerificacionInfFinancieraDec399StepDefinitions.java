package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.VerificacionInfFinancieraDec399Task;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class VerificacionInfFinancieraDec399StepDefinitions {

    @Entonces("realizara acciones de Verificacion Inf Financiera Dec 399")
    public void realizaraaccionesDeVerificacionInfFinancieraDec399() {
        OnStage.theActorInTheSpotlight().attemptsTo(VerificacionInfFinancieraDec399Task.estadisticasYextracciones());
    }
}
