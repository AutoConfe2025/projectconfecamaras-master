package com.co.confecamaras.stepdefinitions.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.UsuarioPublico.ValidacionCoCertificadoCdPjUsPu;
import com.co.confecamaras.tasks.Certificados.UsuarioPublico.CoCertificadoCdPjUsPu;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class CoCertificadoCdPjUsPuStepsDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar un certificado por consulta detallada PJ")
    public void confecamarasQueUnUsuarioPublicoRealiceLaComprarUnCertificadoPorConsultaDetalladaPJ(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese al sistema SII3 como usuario publico por la opcion de consulta detallada y realizar la compra de un certificado PJ")
    public void ingreseAlSistemaSII3ComoUsuarioPublicoPorLaOpcionDeConsultaDetalladaYRealizarLaCompraDeUnCertificadoPJ(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CoCertificadoCdPjUsPu.coCertificadoCdPjUsPu(data));
    }

    @Entonces("el sistema debe generar un certificado por opcion Consulta Detallada de PJ")
    public void elSistemaDebeGenerarUnCertificadoPorOpcionConsultaDetalladaDePJ() {
        theActorInTheSpotlight().should(seeThat(ValidacionCoCertificadoCdPjUsPu.mensejeFinalvalidacio()));
    }
}
