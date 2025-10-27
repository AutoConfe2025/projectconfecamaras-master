package com.co.confecamaras.stepdefinitions.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.UsuarioPublico.ValidacionCoCertificadoCaPnUsPu;
import com.co.confecamaras.tasks.Certificados.UsuarioPublico.CoCertificadoCaPnUsPu;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CoCertificadoCaPnUsPuStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar de un certificado por la opcion consulta accionesPN")
    public void confecamarasQueUnUsuarioPublicoRealiceLaComprarDeUnCertificadoPorLaOpcionConsultaAccionesPN(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese al sistema SII3 como usuario publico por la opcion consulta acciones y realizar la compra de un certificado PN")
    public void ingreseAlSistemaSII3ComoUsuarioPublicoPorLaOpcionConsultaAccionesYRealizarLaCompraDeUnCertificadoPN(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CoCertificadoCaPnUsPu.coCertificadoCaPnUsPu(data));
    }

    @Entonces("el sistema debe generar un certificado de PN desde la opcion consulta acciones")
    public void elSistemaDebeGenerarUnCertificadoDePNDesdeLaOpcionConsultaAcciones() {
        theActorInTheSpotlight().should(seeThat(ValidacionCoCertificadoCaPnUsPu.mensejeFinalvalidacio()));
    }
}
