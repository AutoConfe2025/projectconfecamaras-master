package com.co.confecamaras.stepdefinitions.Certificados.Demas;

import com.co.confecamaras.navigation.NavigateToCompraRapidaCertificados;
import com.co.confecamaras.tasks.Certificados.Demas.CompraRapidaCertificadosCc;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraRapidaCertificadosCcStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico requiera comprar un certificado busqueda por Identificacion")
    public void ConfecamarasqueUnUsuarioPublicoRequieraComprarUnCertificadoBusquedaPorIdentificacion(String actor) {
        theActorCalled(actor).attemptsTo(NavigateToCompraRapidaCertificados.confecamarasHomePage());
    }
    @Cuando("Ingrese al sistema SII3 por la URL de compra rapida de certificados con su Numero Identificacion y comprar un certificado")
    public void ingreseAlSistemaSII3PorLaURLDeCompraRapidaDeCertificadosConSuNumeroIdentificacionYComprarUnCertificado(Map<String, String> data) {
        withCurrentActor(CompraRapidaCertificadosCc.compraRapidaCertificadosCc(data));
    }
    @Entonces("el sistem debe generar el respectivo certificado por Identificacion")
    public void elSistemDebeGenerarElRespectivoCertificadoPorIdentificacion() {

        //theActorInTheSpotlight().should(seeThat(ValidacionCompraRapidaCertificadosCc.mensejeFinal()));
    }

}
