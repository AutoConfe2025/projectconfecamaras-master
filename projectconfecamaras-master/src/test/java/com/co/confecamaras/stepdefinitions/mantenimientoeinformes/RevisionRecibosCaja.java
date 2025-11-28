package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.tasks.mantenimientoeinformes.revision_recibos_caja.NumeroDeOperacion;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RevisionRecibosCaja {

    @Then("realizo la validacion por numero de recibo {string} {string} {string}")
    public void realizoLaValidacionPorNumeroDeRecibo(String operacion, String identificacion, String fecha){
        theActorInTheSpotlight().attemptsTo(NumeroDeOperacion.flujoRevisionRecibosCaja(operacion, identificacion, fecha));
    }
}
