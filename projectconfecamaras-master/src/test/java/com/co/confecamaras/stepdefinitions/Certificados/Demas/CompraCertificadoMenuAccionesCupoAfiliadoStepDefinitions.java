package com.co.confecamaras.stepdefinitions.Certificados.Demas;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CompraCertificadoMenuAccionesCupoAfiliadoStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que un usuario publico realice la comprar un certificado con su cupo de afiliado")
    public void queUnUsuarioPublicoRealiceLaComprarUnCertificadoConSuCupoDeAfiliado(String actor) {
        //theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 por la URL del Home como usuario publico con su matricula y realizar el pago de su certificado con cupo de afiliado")
    public void ingreseAlSistemaSII3PorLaURLDelHomeComoUsuarioPublicoConSuMatriculaYRealizarElPagoDeSuCertificadoConCupoDeAfiliado(Map<String, String> data) {
        //withCurrentActor(CompraCertificadoMenuAccionesCupoAfiliado.compraCertificadoMenuAccionesCupoAfiliado(data));
    }
    @Entonces("el sistem le debe generar su respectivo certificado")
    public void elSistemLeDebeGenerarSuRespectivoCertificado() {
        //theActorInTheSpotlight().should(seeThat(ValidacionCompraCertificadoMenuAccionesCupoAfiliado.mensejeFinal()));
    }
}
