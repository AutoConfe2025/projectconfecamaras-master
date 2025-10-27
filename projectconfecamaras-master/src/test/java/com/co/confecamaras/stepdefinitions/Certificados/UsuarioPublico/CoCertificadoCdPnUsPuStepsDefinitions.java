package com.co.confecamaras.stepdefinitions.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.UsuarioPublico.ValidacionCoCertificadoCdPnUsPu;
import com.co.confecamaras.tasks.Certificados.UsuarioPublico.CoCertificadoCdPnUsPu;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CoCertificadoCdPnUsPuStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar un certificado PN")
    public void confecamarasQueUnUsuarioPublicoRealiceLaComprarUnCertificadoPN(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese al sistema SII3 como usuario publico por Consulta Detallada y realizar la compra de un certificado PN")
    public void ingreseAlSistemaSII3ComoUsuarioPublicoPorConsultaDetalladaYRealizarLaCompraDeUnCertificadoPN(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CoCertificadoCdPnUsPu.coCertificadoCdPnUsPu(data));
    }

    @Entonces("el sistema debe generar un certificado de PN")
    public void elSistemaDebeGenerarUnCertificadoDePN() {
        theActorInTheSpotlight().should(seeThat(ValidacionCoCertificadoCdPnUsPu.mensejeFinalvalidacio()));
    }
}
