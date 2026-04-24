package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.CorreccionesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;


public class CorreccionesStepDefinitions {
    @Entonces("^validar las acciones de correcciones con codigo de barras \"([^\"]*)\"$")
    public void validaraLasAccionesDeCorreccionesConCodigoDeBarras(String estado) {
        OnStage.theActorInTheSpotlight().attemptsTo(CorreccionesTask.digitar(estado));
    }
}
