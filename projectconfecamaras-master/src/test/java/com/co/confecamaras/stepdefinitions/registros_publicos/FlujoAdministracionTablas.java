package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.AdministracionTablas;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoAdministracionTablas {

    @Then("se realiza el proceso adminitracion de tablas")
    public void seRealizaElProcesoAdminitracionDeTablas() {
        theActorInTheSpotlight().attemptsTo(AdministracionTablas.flujoAdminTablas());
    }
}
