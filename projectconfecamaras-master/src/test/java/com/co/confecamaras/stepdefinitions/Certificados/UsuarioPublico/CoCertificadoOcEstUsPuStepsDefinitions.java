package com.co.confecamaras.stepdefinitions.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.UsuarioPublico.ValidacionCoCertificadoOcEstUsPu;
import com.co.confecamaras.tasks.Certificados.UsuarioPublico.CoCertificadoOcEstUsPu;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CoCertificadoOcEstUsPuStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar un certificado EST")
    public void confecamarasQueUnUsuarioPublicoRealiceLaComprarUnCertificadoEST(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 por la URL del Home como usuario publico por la opcion de certificados y realizar la compra de un certificado EST")
    public void ingreseAlSistemaSII3PorLaURLDelHomeComoUsuarioPublicoPorLaOpcionDeCertificadosYRealizarLaCompraDeUnCertificadoEST(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CoCertificadoOcEstUsPu.coCertificadoOcEstUsPu(data));
    }
    @Entonces("el sistema debe generar un certificado de EST")
    public void elSistemaDebeGenerarUnCertificadoDeEST() {
        theActorInTheSpotlight().should(seeThat(ValidacionCoCertificadoOcEstUsPu.mensejeFinalvalidacio()));
    }
}
