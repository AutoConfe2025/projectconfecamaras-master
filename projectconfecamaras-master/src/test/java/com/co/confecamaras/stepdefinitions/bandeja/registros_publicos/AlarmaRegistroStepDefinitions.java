package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.AlarmasRegistrosTask;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AlarmaRegistroStepDefinitions {

    @Entonces("validara la sincronizacion e informacion encontrada")
    public void validaraLaSincronizacionEInformacionEncontrada() {
        theActorInTheSpotlight().attemptsTo(AlarmasRegistrosTask.alarmasRegistros());
    }


}
