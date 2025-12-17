package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;

import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.TramitesRegistrosPublicosReingresoGenericoDeTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class TramitesRegistrosPublicosReingresoGenericoStepDefinitions {
    @Entonces("^validar las acciones de tramites de registros publicos Reingreso generico con codigo de barras  \"([^\"]*)\" \"([^\"]*)\"$")
    public void validarLasAccionesDeTramitesDeRegistrosPublicosReingresoGenericoConCodigoDeBarras (String codigo_barras, String estado) {
        OnStage.theActorInTheSpotlight().attemptsTo(TramitesRegistrosPublicosReingresoGenericoDeTask.devueltos(codigo_barras, estado));
    }
}
