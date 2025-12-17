package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.CalendarioTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class CalendarioStepDefinitions {

    @Entonces("realizara acciones de Calendario")
    public void realizaraaccionesDeCalendario() {
        OnStage.theActorInTheSpotlight().attemptsTo(CalendarioTask.mantenimiento());
    }
}
