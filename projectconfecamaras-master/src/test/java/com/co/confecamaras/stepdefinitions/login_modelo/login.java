package com.co.confecamaras.stepdefinitions.login_modelo;

import com.co.confecamaras.models.UsuarioPublicoModel;
import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.LoginAgil;
import com.co.confecamaras.tasks.login.LoginModeloConMatricula;
import com.co.confecamaras.tasks.login.loginModelo;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.renovacion_agil.PrepararRenovacionAgil;
import com.co.confecamaras.tasks.renovaciones.renovacion_agil_esadl.LoginAgilEsadl;
import com.co.confecamaras.tasks.renovaciones.renovacion_agil_esadl.PreparacionEsadl;
import com.co.confecamaras.tasks.renovaciones.renovacion_agil_pj.PrepararAgilPj;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class login {

    @Given("^(.*) ingresa al sistema de confecamaras$")
    public void confecamarasNecesitaHacerElProcesoDeLiquidacionRenovacion(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Given("^(.*) ingresa al sistema de confecamaras agil$")
    public void ingresaAlSistemaDeConfecamarasAgil(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasAgilPage());
    }

    @Given("^(.*) ingresa al sistema de confecamaras certificados$")
    public void ingresaAlSistemaDeConfecamarasCertificados(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasCertificadosPage());
    }

    @Given("^(.*) ingresa al sistema de confecamaras certificados especiales$")
    public void ingresaAlSistemaDeConfecamarasCertificadosEspeciales(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasCertificadosEspecialesPage());
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

    @And("ingreso al sistema SII3 como usuario publico40")
    public void ingresoAlSistemaSII3ComoUsuarioPublico40() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioDefault40();
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

    @And("ingreso al sistema SII3 como usuario en renovacion agil")
    public void ingresoAlSistemaSii3ComoUsuarioEnRenovacionAgil() {
        theActorInTheSpotlight().attemptsTo(PrepararRenovacionAgil.preparar());
        UsuarioPublicoModel usuario = UsuarioPublicoModel.UsuarioAgil1();
        withCurrentActor(LoginAgil.loginA(usuario));
    }

    @And("ingreso al sistema SII4 como usuario publico")
    public void ingresoAlSistemaSii4ComoUsuarioPublico() {
        UsuarioPublicoModel usuario = UsuarioPublicoModel.UsuarioPublico1();
        withCurrentActor(loginModelo.enConfecamaras(usuario));
    }

    @And("ingreso al sistema SII3 como usuario en renovacion agil ESADL")
    public void ingresoAlSistemaSii3ComoUsuarioEnRenovacionAgilEsadl() {
        theActorInTheSpotlight().attemptsTo(PreparacionEsadl.preparar());
        UsuarioPublicoModel usuario = UsuarioPublicoModel.UsuarioAgilEsadl();
        withCurrentActor(LoginAgilEsadl.loginAgilEsadl(usuario));
    }

    @And("ingreso al sistema SII3 como usuario en renovacion agil pj")
    public void ingresoAlSistemaSii3ComoUsuarioEnRenovacionAgilPj() {
        theActorInTheSpotlight().attemptsTo(PrepararAgilPj.prepararBD());
        UsuarioPublicoModel usuario = UsuarioPublicoModel.UsuarioAgilEsadl();
        withCurrentActor(LoginAgilEsadl.loginAgilEsadl(usuario));
    }

}
