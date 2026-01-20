package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.LlenaFormularioRue;
import io.cucumber.java.en.And;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroPublicosRuesStepDefinitions {

    @And("lleno el formulario de mantenimiento de servicios RUES")
    public void llenoElFormularioDeMantenimientoDeServiciosRues() {
        theActorInTheSpotlight().attemptsTo(LlenaFormularioRue.formularioRue());
    }
}
