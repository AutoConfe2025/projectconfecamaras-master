package com.co.confecamaras.stepdefinitions.actualizacion_datos;

import com.co.confecamaras.tasks.actualizacion_datos.FlujoActualizacionMutacionCaja;
import com.co.confecamaras.tasks.actualizacion_datos.FlujoRecibirPagoMutacion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoMutacionCajaStepDefinitions {

    @When("realizo el flujo de actualizacion de datos mutacion caja {string}")
    public void realizoElFlujoDeActualizacionDeDatosMutacionCaja(String matricula){
        theActorInTheSpotlight().attemptsTo(FlujoActualizacionMutacionCaja.FlujoMutacionCaja(matricula));
    }

    @Then("realizo el flujo de recibir el pago de la mutacion")
    public void realizoElFlujoDeRecibirElPagoDeLaMutacion(){
        theActorInTheSpotlight().attemptsTo(FlujoRecibirPagoMutacion.recibePagoMutacion());
    }
}
