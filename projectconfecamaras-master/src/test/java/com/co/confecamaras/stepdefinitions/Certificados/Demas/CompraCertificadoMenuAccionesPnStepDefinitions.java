package com.co.confecamaras.stepdefinitions.Certificados.Demas;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.Demas.ValidacionCompraCertificadoMenuAccionesPn;
import com.co.confecamaras.tasks.Certificados.Demas.CompraCertificadoMenuAccionesPn;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraCertificadoMenuAccionesPnStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico PN requiera comprar un certificado con el cupo de afiliado")
    public void ConfecamarasqueUnUsuarioPublicoPNRequieraComprarUnCertificadoConElCupoDeAfiliado(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 por la URL del Home como usuario publico con su matricula y para realizar el pago con su clave de afiliado y realice la respectiva compra de un certificado con su cupo de afiliado")
    public void ingreseAlSistemaSII3PorLaURLDelHomeComoUsuarioPublicoConSuMatriculaYParaRealizarElPagoConSuClaveDeAfiliadoYRealiceLaRespectivaCompraDeUnCertificadoConSuCupoDeAfiliado(Map<String, String> data) {
        withCurrentActor(CompraCertificadoMenuAccionesPn.compraCertificadoCupoAfiliadoPN(data));
    }
    @Entonces("el sistem le debe descontar del cupo de afiliado y generar su respectivo certificado para PN")
    public void elSistemLeDebeDescontarDelCupoDeAfiliadoYGenerarSuRespectivoCertificadoParaPN() {
        theActorInTheSpotlight().should(seeThat(ValidacionCompraCertificadoMenuAccionesPn.mensejeFinal()));
    }
}
