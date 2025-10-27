package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.ControlCalidadTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ControlCalidadStepDefinitions {
    @Entonces("^validara las acciones de control de calidad al codigo de barras (.+)$")
    public void validaraLasAccionesDeControlDeCalidadAlCodigoDeBarras(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(ControlCalidadTask.control(codigo_barras));
    }
}
