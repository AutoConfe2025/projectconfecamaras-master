package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.RevisionSirefRadicaciones.RevisionSinrefRadicacionMarcarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.RevisionSirefRadicaciones.RevisionSirefRadicarNotificarTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RevisionSiprefRadicacionesStepDefinitions {

    @Entonces("realizara las acciones de revision de radicaciones")
    public void realizaraAccionesDeRevisionDeRadicaciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(RevisionSirefRadicarNotificarTask.notificar("700226"));
        OnStage.theActorInTheSpotlight().attemptsTo(RevisionSinrefRadicacionMarcarTask.marcar("700226", "Mensaje de prueba"));
    }
}
