package com.co.confecamaras.stepdefinitions.mantenimientos_tablas_basicas;

import com.co.confecamaras.tasks.mantenimiento_tablas_basicas.FlujoPermisosEspeciales;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PermisosEspecialesStepDefinitions {

    @Then("realizo el proceso de permisos especiales")
    public void realizoElProcesoDePermisosEspeciales(){
        theActorInTheSpotlight().attemptsTo(FlujoPermisosEspeciales.flujoCompletoPermisoEspecial());
    }
}
