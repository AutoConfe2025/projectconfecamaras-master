package com.co.confecamaras.stepdefinitions.Certificados.Demas;

import com.co.confecamaras.navigation.NavigateToCompraRapidaCertificados;
import com.co.confecamaras.questions.Certificados.Demas.ValidacionCompraRapidaCertificadosRup;
import com.co.confecamaras.tasks.Certificados.Demas.CompraRapidaCertificadosRup;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraRapidaCertificadosRupStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico requiera comprar un certificado RUP con el cupo de afiliado")
    public void ConfecamarasqueUnUsuarioPublicoRequieraComprarUnCertificadoRUPConElCupoDeAfiliado(String actor) {
        theActorCalled(actor).attemptsTo(NavigateToCompraRapidaCertificados.confecamarasHomePage());
    }

    @Cuando("Ingrese al sistema SII3 por la URL de compra rapida de certificados con su Numero RUP y realice el pago con su cupo de afiliado")
    public void ingreseAlSistemaSII3PorLaURLDeCompraRapidaDeCertificadosConSuNumeroRUPYRealiceElPagoConSuCupoDeAfiliado(Map<String, String> data) {
        withCurrentActor(CompraRapidaCertificadosRup.compraRapidaCertificadosRup(data));
    }

    @Entonces("el sistem debe generar el respectivo certificado RUP")
    public void elSistemDebeGenerarElRespectivoCertificadoRUP() {
        theActorInTheSpotlight().should(seeThat(ValidacionCompraRapidaCertificadosRup.mensejeFinal()));
    }
}
