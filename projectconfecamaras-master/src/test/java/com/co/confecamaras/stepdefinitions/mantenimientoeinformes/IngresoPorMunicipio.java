package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.tasks.mantenimientoeinformes.ingresos_por_municipio.FlujoIngresosPorMunicipio;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IngresoPorMunicipio {

    @Then("valido el flujo de ingresos por municipio {string} {string}")
    public void validoElFlujoDeIngresosPorMunicipio(String inicio, String fin){
        theActorInTheSpotlight().attemptsTo(FlujoIngresosPorMunicipio.FlujoIngresoMunicipio(inicio, fin));
    }
}
