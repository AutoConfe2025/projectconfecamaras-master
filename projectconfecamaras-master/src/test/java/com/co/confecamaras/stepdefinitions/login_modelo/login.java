package com.co.confecamaras.stepdefinitions.login_modelo;

import com.co.confecamaras.models.UsuarioPublicoModel;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.login.loginModelo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class login {

    @Given("^(.*) necesita hacer el proceso de liquidacion renovacion$")
    public void confecamarasNecesitaHacerElProcesoDeLiquidacionRenovacion(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @And("ingreso al sistema SII3 como usuario publico")
    public void ingresoAlSistemaSII3ComoUsuarioPublico(){
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioDefault();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

//    @When("")

}
