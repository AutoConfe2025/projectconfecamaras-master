package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujonoticiasRegistrosPublicos;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NoticiasRegistrosPublicosStepDefinitions {

    @Then("valido el flujo de noticias de registros publicos")
    public void validoElFlujoDeNoticiasDeRegistrosPublicos(){
        theActorInTheSpotlight().attemptsTo(FlujonoticiasRegistrosPublicos.flujoNoticias());
    }
}
