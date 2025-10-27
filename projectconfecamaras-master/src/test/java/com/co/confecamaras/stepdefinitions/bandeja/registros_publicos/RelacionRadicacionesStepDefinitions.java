package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.RelacionRadicacionesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RelacionRadicacionesStepDefinitions {
    @Entonces("^validara las acciones de relacion de radicaciones al codigo de barras (.+)$")
    public void validaraLasAccionesDeRelacionDeRadicacionesAlCodigoDeBarras(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(RelacionRadicacionesTask.radicaciones(codigo_barras));
    }
}
