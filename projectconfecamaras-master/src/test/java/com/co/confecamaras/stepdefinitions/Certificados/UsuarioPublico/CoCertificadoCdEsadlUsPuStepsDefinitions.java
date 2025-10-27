package com.co.confecamaras.stepdefinitions.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.UsuarioPublico.ValidacionCoCertificadoCdEsadlUsPu;
import com.co.confecamaras.tasks.Certificados.UsuarioPublico.CoCertificadoCdEsadlUsPu;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CoCertificadoCdEsadlUsPuStepsDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar un certificado por consulta detallada ESADL")
    public void confecamarasQueUnUsuarioPublicoRealiceLaComprarUnCertificadoPorConsultaDetalladaESADL(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese al sistema SII3 como usuario publico por la opcion de consulta detallada y realizar la compra de un certificado ESADL")
    public void ingreseAlSistemaSII3ComoUsuarioPublicoPorLaOpcionDeConsultaDetalladaYRealizarLaCompraDeUnCertificadoESADL(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CoCertificadoCdEsadlUsPu.coCertificadoCdEsadlUsPu(data));
    }

    @Entonces("el sistema debe generar un certificado por opcion Consulta Detallada de ESADL")
    public void elSistemaDebeGenerarUnCertificadoPorOpcionConsultaDetalladaDeESADL() {
        theActorInTheSpotlight().should(seeThat(ValidacionCoCertificadoCdEsadlUsPu.mensejeFinalvalidacio()));
    }
}
