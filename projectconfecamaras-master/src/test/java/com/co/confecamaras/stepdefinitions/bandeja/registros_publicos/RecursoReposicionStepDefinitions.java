package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.RecursoReposicionTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RecursoReposicionStepDefinitions {
    @Entonces("^validara las acciones de recursos de reposicion relacionados al codigo de barras (.+)$")
    public void validaraLasAccionesDeRecursosDeReposicionRelacionadosAlCodigoDeBarras(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(RecursoReposicionTask.recursos(codigo_barras));
    }
}
