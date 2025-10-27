package com.co.confecamaras.stepdefinitions.Certificados.Demas;

import com.co.confecamaras.navigation.NavigateToCompraRapidaCertificados;
import com.co.confecamaras.questions.Certificados.Demas.ValidacionCompraRapidaCertificadosNoAfiliado;
import com.co.confecamaras.tasks.Certificados.Demas.CompraRapidaCertificadosNoAfiliado;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraRapidaCertificadosNoAfiliadoStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico no afiliado requiera comprar un certificado")
    public void ConfecamarasqueUnUsuarioPublicoNoAfiliadoRequieraComprarUnCertificado(String actor) {
        theActorCalled(actor).attemptsTo(NavigateToCompraRapidaCertificados.confecamarasHomePage());
    }

    @Cuando("un usuario no afiliado ingrese al sistema SII3 por la URL de compra rapida de certificados con su matricula y realice la respectiva compra de un certificado")
    public void unUsuarioNoAfiliadoIngreseAlSistemaSII3PorLaURLDeCompraRapidaDeCertificadosConSuMatriculaYRealiceLaRespectivaCompraDeUnCertificado(Map<String, String> data) {
        withCurrentActor(CompraRapidaCertificadosNoAfiliado.compraRapidaCertificadosNoAfiliado(data));
    }

    @Entonces("el sistema debe generar su respectivo certificado")
    public void elSistemaDebeGenerarSuRespectivoCertificado() {
        theActorInTheSpotlight().should(seeThat(ValidacionCompraRapidaCertificadosNoAfiliado.mensejeFinal()));
    }

}
