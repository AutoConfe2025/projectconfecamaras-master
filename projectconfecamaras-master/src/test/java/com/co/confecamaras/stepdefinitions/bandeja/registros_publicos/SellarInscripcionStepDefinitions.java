package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;


import com.co.confecamaras.tasks.Bandeja.registros_publicos.SellarInscripcionTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;


public class SellarInscripcionStepDefinitions {
    @Entonces("^validara las acciones de sellar inscripcion")
    public void validaraLasAccionesDeSellarInscripcion() {
        OnStage.theActorInTheSpotlight().attemptsTo(SellarInscripcionTask.ver());
    }
}
