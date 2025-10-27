package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.EscaneoTramitesAutomaticosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.FinalizarTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class EscaneoTramitesStepDefinitions {
    @Entonces("^validara las acciones de escaneo de tramites al codigo de barras (.+)$")
    public void validaraLasAccionesDeEscaneoDeTramitesAlCodigoDeBarras(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(EscaneoTramitesAutomaticosTask.escanear(codigo_barras));
    }
}
