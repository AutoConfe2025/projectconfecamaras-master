package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.FlujoRevisonDesistimientos;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRevisionDesistimientosStepDefinitions {

    @Then("realizo el flujo de verificacion de desistimientos")
    public void realizoElFlujoDeVerificacionDeDesistiientos(){
        theActorInTheSpotlight().attemptsTo(FlujoRevisonDesistimientos.revisionDesistimientos());
    }
}
