package com.co.confecamaras.stepdefinitions.login_modelo;

import com.co.confecamaras.models.UsuarioPublicoModel;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.login.loginModelo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class login {

    @Given("^(.*) ingresa al sistema de confecamaras$")
    public void confecamarasNecesitaHacerElProcesoDeLiquidacionRenovacion(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @And("ingreso al sistema SII3 como usuario publico")
    public void ingresoAlSistemaSII3ComoUsuarioPublico(){
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioDefault();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario publico16")
    public void ingresoAlSistemaSII3ComoUsuarioPublico16(){
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioDefault16();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario publico16 admin")
    public void ingresoAlSistemaSII3ComoUsuarioPublico16Admin(){
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioDefault16Admin();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario admin")
    public void ingresoAlSistemaSII3ComoUsuarioAdmin(){
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioAdmin20();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario admin27")
    public void ingresoAlSistemaSII3ComoUsuarioAdmin27(){
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioAdmin27();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

}
