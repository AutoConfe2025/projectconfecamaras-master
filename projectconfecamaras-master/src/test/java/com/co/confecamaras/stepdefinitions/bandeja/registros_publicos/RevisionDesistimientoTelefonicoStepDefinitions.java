package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.RevisionDesistimientoTelefonicoTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RevisionDesistimientoTelefonicoStepDefinitions {
    @Entonces("^con codigo de barras (.+) realizara las acciones telefonicamente$")
    public void conCodigoDeBarrasRealizaraLasAccionesTelefonicamente(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(RevisionDesistimientoTelefonicoTask.revision(codigo_barras));
    }
}
