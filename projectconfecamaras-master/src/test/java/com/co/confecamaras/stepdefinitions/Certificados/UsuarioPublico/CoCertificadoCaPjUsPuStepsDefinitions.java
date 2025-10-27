package com.co.confecamaras.stepdefinitions.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.UsuarioPublico.ValidacionCoCertificadoCaPjUsPu;
import com.co.confecamaras.tasks.Certificados.UsuarioPublico.CoCertificadoCaPjUsPu;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CoCertificadoCaPjUsPuStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar un certificado por menu acciones PJ")
    public void confecamarasQueUnUsuarioPublicoRealiceLaComprarUnCertificadoPorMenuAccionesPJ(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 como usuario publico por la opcion de menu acciones y realizar la compra de un certificado PJ")
    public void ingreseAlSistemaSII3ComoUsuarioPublicoPorLaOpcionDeMenuAccionesYRealizarLaCompraDeUnCertificadoPJ(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CoCertificadoCaPjUsPu.coCertificadoCaPjUsPu(data));
    }
    @Entonces("el sistema debe generar un certificado por opcion menu acciones de PJ")
    public void elSistemaDebeGenerarUnCertificadoPorOpcionMenuAccionesDePJ() {
        theActorInTheSpotlight().should(seeThat(ValidacionCoCertificadoCaPjUsPu.mensejeFinalvalidacio()));
    }
}
