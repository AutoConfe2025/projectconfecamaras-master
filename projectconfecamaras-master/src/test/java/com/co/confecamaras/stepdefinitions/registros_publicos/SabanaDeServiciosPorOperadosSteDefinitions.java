package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoSabanaServicioPorOperador;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SabanaDeServiciosPorOperadosSteDefinitions {

    @Then("realizo el flujo de validacion de sabana de servicio por operador")
    public void realizoElFlujoDeValidacionDeSabanaDeServicioPorOperador(){
        theActorInTheSpotlight().attemptsTo(FlujoSabanaServicioPorOperador.sabanaServicio());
    }
}
