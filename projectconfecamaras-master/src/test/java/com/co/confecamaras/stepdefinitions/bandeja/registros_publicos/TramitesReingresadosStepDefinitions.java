package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.TramitesReingresadosRepartoTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TramitesReingresadosStepDefinitions {

    @Entonces("^validara las acciones de tramites reingresados al codigo de barras (.+)$")
    public void validaraLasAccionesDeTramitesReingresadosAlCodigoDeBarras(String codigo_barras) {
        theActorInTheSpotlight().attemptsTo(TramitesReingresadosRepartoTask.tramites(codigo_barras));
    }
}
