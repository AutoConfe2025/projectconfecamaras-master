package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.DesistimientoSinArchivarTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class DesistimientoSinArchivarStepDefinitions {
    @Entonces("^validara las acciones de desistimiento sin archivar relacionados al codigo de barras (.+)$")
    public void validaraLasAccionesDeDesistimientoSinArchivarRelacionadosAlCodigoDeBarras(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(DesistimientoSinArchivarTask.sinArchivar(codigo_barras));
    }
}
