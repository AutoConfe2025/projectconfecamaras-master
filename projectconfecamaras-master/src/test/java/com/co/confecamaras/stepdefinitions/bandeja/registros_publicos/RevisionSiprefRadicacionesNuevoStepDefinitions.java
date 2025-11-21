package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.RevisionSIPREFRadicacionesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RevisionSiprefRadicacionesNuevoStepDefinitions {
    @Entonces("^validar las acciones de revision sipref radicaciones")
    public void validaraLasAccionesDeRevisionSiprefAsentamientos() {
        OnStage.theActorInTheSpotlight().attemptsTo(RevisionSIPREFRadicacionesTask.ver());
    }
}
