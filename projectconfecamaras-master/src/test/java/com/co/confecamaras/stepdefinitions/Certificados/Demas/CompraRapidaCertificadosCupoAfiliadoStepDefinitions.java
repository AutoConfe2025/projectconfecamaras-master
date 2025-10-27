package com.co.confecamaras.stepdefinitions.Certificados.Demas;

import com.co.confecamaras.navigation.NavigateToCompraRapidaCertificados;
import com.co.confecamaras.questions.Certificados.Demas.ValidacionCompraRapidaCertificadosCupoAfiliado;
import com.co.confecamaras.tasks.Certificados.Demas.CompraRapidaCertificadosCupoAfiliado;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraRapidaCertificadosCupoAfiliadoStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico requiera comprar un certificado con el cupo de afiliado")
    public void ConfecamarasqueUnUsuarioPublicoRequieraComprarUnCertificadoConElCupoDeAfiliado(String actor) {
        theActorCalled(actor).attemptsTo(NavigateToCompraRapidaCertificados.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 por la URL de compra rapida de certificados con su matricula y para realizar el pago con su clave de afiliado y realice la respectiva compra de un certificado con su cupo de afiliado")
    public void ingreseAlSistemaSII3PorLaURLDeCompraRapidaDeCertificadosConSuMatriculaYParaRealizarElPagoConSuClaveDeAfiliadoYRealiceLaRespectivaCompraDeUnCertificadoConSuCupoDeAfiliado(Map<String, String> data) {
        withCurrentActor(CompraRapidaCertificadosCupoAfiliado.compraCertificadoCupoAfiliado(data));
    }
    @Entonces("el sistem le debe descontar del cupo de afiliado y generar su respectivo certificado")
    public void elSistemLeDebeDescontarDelCupoDeAfiliadoYGenerarSuRespectivoCertificado() {
        theActorInTheSpotlight().should(seeThat(ValidacionCompraRapidaCertificadosCupoAfiliado.mensejeFinal()));
    }
}
