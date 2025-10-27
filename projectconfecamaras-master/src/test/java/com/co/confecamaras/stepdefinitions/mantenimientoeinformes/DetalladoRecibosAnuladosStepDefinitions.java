package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.tasks.mantenimientoeinformes.DetalladoGastoAfiliadosTaks;
import com.co.confecamaras.tasks.mantenimientoeinformes.DetalladoRecibosAnuladosTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

public class DetalladoRecibosAnuladosStepDefinitions {

    @Entonces("generara el documento de recibos anulados")
    public void generaraElDocumentoDeRecibosAnulados() {
        OnStage.theActorInTheSpotlight().attemptsTo(DetalladoRecibosAnuladosTask.detallado());
    }
}
