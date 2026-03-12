package com.co.confecamaras.stepdefinitions.login_modelo;

import com.co.confecamaras.models.UsuarioPublicoModel;
import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.login.LoginModeloConMatricula;
import com.co.confecamaras.tasks.login.loginModelo;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class login {

    @Given("^(.*) ingresa al sistema de confecamaras$")
    public void confecamarasNecesitaHacerElProcesoDeLiquidacionRenovacion(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Given("^(.*) ingresa al sistema de confecamaras con matricula \"(.*)\"$")
    public void ingresoConMatriculaSII3(String actor, String query) {
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorCalled(actor).attemptsTo(
                RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()),
                NavigateTo.confecamarasMatriculaPage()
        );
    }

    @And("ingreso al sistema SII3 como usuario publico")
    public void ingresoAlSistemaSII3ComoUsuarioPublico() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioDefault();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como analista")
    public void ingresoAlSistemaSII3ComoAnalista() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioAnalista();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como admin16")
    public void ingresoAlSistemaSII3ComoAdmin16() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioAdmin16();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como admin20")
    public void ingresoAlSistemaSII3ComoAdmin20() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioAdmin20();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario publico16")
    public void ingresoAlSistemaSII3ComoUsuarioPublico16() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioDefault16();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario publico16 admin")
    public void ingresoAlSistemaSII3ComoUsuarioPublico16Admin() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioDefault16Admin();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario admin")
    public void ingresoAlSistemaSII3ComoUsuarioAdmin() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioAdmin20();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario admin27")
    public void ingresoAlSistemaSII3ComoUsuarioAdmin27() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioAdmin27();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario publico27")
    public void ingresoAlSistemaSII3ComoUsuarioAPublico27() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioDefaultPublico27();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario publico externo")
    public void ingresoAlSistemaSII3ComoUsuarioAPublicoExterno() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioPublicoExterno1();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario publico externo con matricula")
    public void ingresoAlSistemaSII3ComoUsuarioAPublicoExternoConMatricula() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioPublicoExterno1();
        withCurrentActor(LoginModeloConMatricula.ingresoMatriculaEnUrl(usuario));
    }

}
