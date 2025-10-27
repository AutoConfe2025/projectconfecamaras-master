package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.TramitesDevueltosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class TramitesDevueltosStepDefinitions {
    @Entonces("^validara las acciones de tramites devueltos relacionados al codigo de barras (.+)$")
    public void validaraLasAccionesDeTramitesDevueltosRelacionadosAlCodigoDeBarras(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(TramitesDevueltosTask.devueltos(codigo_barras));
    }
}
