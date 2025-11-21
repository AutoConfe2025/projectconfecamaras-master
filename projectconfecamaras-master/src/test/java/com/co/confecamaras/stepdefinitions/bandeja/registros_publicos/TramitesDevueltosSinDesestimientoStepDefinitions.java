package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.TramitesDevueltosSinDesestimientoDeTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class TramitesDevueltosSinDesestimientoStepDefinitions {
    @Entonces("^validar las acciones de tramites devueltos sin desistimiento detectado con codigo de barras \"([^\"]*)\" \"([^\"]*)\"$")
    public void validaraLasAccionesDeTramitesDevueltosSinDesistinamineto(String codigo_barras, String estado) {
        OnStage.theActorInTheSpotlight().attemptsTo(TramitesDevueltosSinDesestimientoDeTask.devueltos(codigo_barras, estado));
    }
}
