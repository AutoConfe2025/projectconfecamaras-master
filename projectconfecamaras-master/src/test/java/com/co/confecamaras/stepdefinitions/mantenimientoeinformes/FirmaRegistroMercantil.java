package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.tasks.mantenimientoeinformes.firma_registro_mercantil_esadl.FlujoFirmasRegistroMercantilEsadl;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FirmaRegistroMercantil {

    @Then("realizo el flujo de validacio de firma de registro")
    public void realizoElFlujoDeValidacioDeFirmaDeRegistro(){
        theActorInTheSpotlight().attemptsTo(FlujoFirmasRegistroMercantilEsadl.FlujRegistroEsadl());
    }
}
