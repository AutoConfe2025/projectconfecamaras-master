package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.TransaccionesRuesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class TransaccionesRuesStepDefinitions {

    @Entonces("realizara cada accion encontrada realiandon su debida validacion")
    public void realizaraCadaAccionEncontradaRealiandonSuDebidaValidacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(TransaccionesRuesTask.rues());
    }
}
