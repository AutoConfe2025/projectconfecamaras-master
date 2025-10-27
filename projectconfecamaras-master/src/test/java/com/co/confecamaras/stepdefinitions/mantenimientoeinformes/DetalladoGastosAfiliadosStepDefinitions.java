package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.tasks.mantenimientoeinformes.DetalladoGastoAfiliadosTaks;
import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

public class DetalladoGastosAfiliadosStepDefinitions {
    @Cuando("generara el documento de gastos afiliados")
    public void generaraElDocumentoDeGastosAfiliados() {
        OnStage.theActorInTheSpotlight().attemptsTo(DetalladoGastoAfiliadosTaks.detallado());
    }
}
