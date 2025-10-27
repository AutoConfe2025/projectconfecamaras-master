package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.RevisionDesistimientoPresencialTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RevisionDesistimientoPresencialStepDefinitions {
    @Entonces("^con codigo de barras (.+) realizara las acciones presencialmente$")
    public void conCodigoDeBarrasRealizaraLasAccionesPresencial(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(RevisionDesistimientoPresencialTask.revision(codigo_barras));
    }
}
