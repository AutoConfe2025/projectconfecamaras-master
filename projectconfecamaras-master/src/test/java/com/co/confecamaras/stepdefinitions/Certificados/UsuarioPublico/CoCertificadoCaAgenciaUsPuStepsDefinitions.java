package com.co.confecamaras.stepdefinitions.Certificados.UsuarioPublico;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.questions.Certificados.UsuarioPublico.ValidacionCoCertificadoCaAgenciaUsPu;
import com.co.confecamaras.tasks.Certificados.UsuarioPublico.CoCertificadoCaAgenciaUsPu;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CoCertificadoCaAgenciaUsPuStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar de certificado por opcion Acciones agencia")
    public void confecamarasQueUnUsuarioPublicoRealiceLaComprarDeCertificadoPorOpcionAccionesAgencia(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 como usuario publico por la opcion Acciones y realizar la compra de un certificado agencia")
    public void ingreseAlSistemaSII3ComoUsuarioPublicoPorLaOpcionAccionesYRealizarLaCompraDeUnCertificadoAgencia(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CoCertificadoCaAgenciaUsPu.coCertificadoCaAgenciaUsPu(data));
    }
    @Entonces("el sistema debe generar un certificado por opcion Acciones de agencia")
    public void elSistemaDebeGenerarUnCertificadoPorOpcionAccionesDeAgencia() {
        theActorInTheSpotlight().should(seeThat(ValidacionCoCertificadoCaAgenciaUsPu.mensejeFinalvalidacio()));
    }

}
