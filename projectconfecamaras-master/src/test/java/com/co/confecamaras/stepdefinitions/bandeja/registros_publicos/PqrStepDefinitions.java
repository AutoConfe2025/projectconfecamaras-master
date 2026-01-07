package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.PqrTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;


public class PqrStepDefinitions {
    @Entonces("^validara las acciones de PQR con codigo de barras \"([^\"]*)\" \"([^\"]*)\"$")
    public void validaraLasAccionesDeDigitacionPqrConCodigoDeBarras(String codigo_barras, String estado) {
        OnStage.theActorInTheSpotlight().attemptsTo(PqrTask.digitar(codigo_barras, estado));
    }
}
