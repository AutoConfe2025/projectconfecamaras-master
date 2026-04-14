package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;

import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ResumidodeImpuestodeRegistroTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ResumidodeImpuestodeRegistroStepDefinitions {
    @Entonces("realizara acciones de Resumido de Impuesto de Registro")
    public void realizaraaccionesDeResumidodeImpuestodeRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(ResumidodeImpuestodeRegistroTask.Gestiondecaja());
    }
}
