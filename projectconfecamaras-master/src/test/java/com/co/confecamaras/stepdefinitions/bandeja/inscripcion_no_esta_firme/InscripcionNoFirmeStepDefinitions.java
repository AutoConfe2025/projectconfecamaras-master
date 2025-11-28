package com.co.confecamaras.stepdefinitions.bandeja.inscripcion_no_esta_firme;

import com.co.confecamaras.tasks.Bandeja.general.IngresaXMLNoFirme;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InscripcionNoFirmeStepDefinitions {

    @Then("valida el XML")
    public void validaElXML() {
        theActorInTheSpotlight().attemptsTo(IngresaXMLNoFirme.NoFirmeXML());
    }
}
