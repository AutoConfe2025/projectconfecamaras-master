package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.RevisionSirefInscripciones.RevisionSirefInscripcionMarcarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.RevisionSirefInscripciones.RevisionSirefInscripcionNotificacionesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RevisionSiprefInscripcionesStepDefinitions {

    @Entonces("realizara las acciones de revision de inscripciones")
    public void realizarAccionesDeRevisionDeInscripciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(RevisionSirefInscripcionNotificacionesTask.notificacion("242041"));
        OnStage.theActorInTheSpotlight().attemptsTo(RevisionSirefInscripcionMarcarTask.marcar("242041","observacion"));
    }
}
