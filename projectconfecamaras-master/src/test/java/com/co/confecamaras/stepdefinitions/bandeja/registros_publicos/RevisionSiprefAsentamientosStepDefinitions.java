package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.RevisionSIPREFAsentamientoTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.TramitesDevueltosSinDesestimientoDeTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RevisionSiprefAsentamientosStepDefinitions {
    @Entonces("^validar las acciones de revision sipref asentamientos$")
    public void validaraLasAccionesDeRevisionSiprefAsentamientos() {
        OnStage.theActorInTheSpotlight().attemptsTo(RevisionSIPREFAsentamientoTask.ver());
    }
}
