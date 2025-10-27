package com.co.confecamaras.stepdefinitions.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.UsuarioPublico.ValidacionCoCertificadoOcAgenciaUsPu;
import com.co.confecamaras.tasks.Certificados.UsuarioPublico.CoCertificadoOcAgenciaUsPu;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CoCertificadoOcAgenciaUsPuStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar un certificado Agencia")
    public void confecamarasQueUnUsuarioPublicoRealiceLaComprarUnCertificadoAgencia(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 como usuario publico por la opcion de certificados y realizar la compra de un certificado Agencia")
    public void ingreseAlSistemaSII3ComoUsuarioPublicoPorLaOpcionDeCertificadosYRealizarLaCompraDeUnCertificadoAgencia(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CoCertificadoOcAgenciaUsPu.coCertificadoOcAgenciaUsPu(data));
    }
    @Entonces("el sistema debe generar un certificado de Agencia")
    public void elSistemaDebeGenerarUnCertificadoDeAgencia() {
        theActorInTheSpotlight().should(seeThat(ValidacionCoCertificadoOcAgenciaUsPu.mensejeFinalvalidacio()));
    }
}
