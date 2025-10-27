package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.TramitesNoArchivadosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class TramitesNoArchivadosStepDefinitions {
    @Entonces("^validara las acciones de tramites no archivados relacionados al codigo de barras (.+)$")
    public void validaraLasAccionesDeTramitesNoArchivadosRelacionadosAlCodigoDeBarras(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(TramitesNoArchivadosTask.noArchivados(codigo_barras));
    }
}
