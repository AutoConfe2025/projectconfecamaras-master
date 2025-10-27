package com.co.confecamaras.stepdefinitions.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.UsuarioPublico.ValidacionCoCertificadoCdAgenciaUsPu;
import com.co.confecamaras.tasks.Certificados.UsuarioPublico.CoCertificadoCdAgenciaUsPu;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CoCertificadoCdAgenciaUsPuStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar un certificado Agencia por Consulta Detallada")
    public void confecamarasQueUnUsuarioPublicoRealiceLaComprarUnCertificadoAgenciaPorConsultaDetallada(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese al sistema SII3 como usuario publico por Consulta Detallada y realizar la compra de un certificado Agencia")
    public void ingreseAlSistemaSII3ComoUsuarioPublicoPorConsultaDetalladaYRealizarLaCompraDeUnCertificadoAgencia(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CoCertificadoCdAgenciaUsPu.coCertificadoCdAgenciaUsPu(data));
    }

    @Entonces("el sistema debe generar un certificado desde Consulta Detalladade para Agencia")
    public void elSistemaDebeGenerarUnCertificadoDesdeConsultaDetalladadeParaAgencia() {
        theActorInTheSpotlight().should(seeThat(ValidacionCoCertificadoCdAgenciaUsPu.mensejeFinalvalidacio()));
    }
}
