package com.co.confecamaras.stepdefinitions.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.UsuarioPublico.ValidacionCoCertificadoCrPpUsPu;
import com.co.confecamaras.tasks.Certificados.UsuarioPublico.CoCertificadoCrPpUsPu;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CoCertificadoCrPpUsPuStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar un certificado RUP")
    public void confecamarasQueUnUsuarioPublicoRealiceLaComprarUnCertificadoRUP(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 como usuario publico por la opcion de certificados y realizar la compra de un certificado RUP")
    public void ingreseAlSistemaSII3ComoUsuarioPublicoPorLaOpcionDeCertificadosYRealizarLaCompraDeUnCertificadoRUP(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CoCertificadoCrPpUsPu.coCertificadoCrPpUsPu(data));
    }
    @Entonces("el sistema debe generar un certificado de RUP")
    public void elSistemaDebeGenerarUnCertificadoDeRUP() {
        theActorInTheSpotlight().should(seeThat(ValidacionCoCertificadoCrPpUsPu.mensejeFinalvalidacio()));
    }

}
