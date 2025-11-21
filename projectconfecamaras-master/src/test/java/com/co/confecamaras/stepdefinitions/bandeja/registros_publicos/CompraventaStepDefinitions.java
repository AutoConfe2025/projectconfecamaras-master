package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.CompraVentasTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;


public class CompraventaStepDefinitions {
    @Entonces("^validara las acciones de compraventas con codigo de barras \"([^\"]*)\" \"([^\"]*)\"$")
    public void validaraLasAccionesDeDigitacionCompraventasConCodigoDeBarras(String codigo_barras, String estado) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompraVentasTask.digitar(codigo_barras, estado));
    }
}
