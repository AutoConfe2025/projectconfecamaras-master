package com.co.confecamaras.stepdefinitions.ConsultasTransacciones;

import com.co.confecamaras.tasks.ConsultasTransacciones.ValidacionIdentidadTask;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidacionIdentificacionStepDefinitions {
    @Entonces("el usuario verificara su identidad")
    public void elUsuarioVerificaraSuIdentidad() {
        theActorInTheSpotlight().attemptsTo(ValidacionIdentidadTask.validar());
    }
}
