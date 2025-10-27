package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionRegEsadlTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class DigitacionRegEsadlStepDefinitions {
    @Entonces("^validara las acciones de Esadl pendiente relacionados al codigo de barras (.+)$")
    public void validaraLasAccionesDeEsadlPendienteRelacionadosAlCodigoDeBarras(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(DigitacionRegEsadlTask.digitar(codigo_barras));
    }
}
