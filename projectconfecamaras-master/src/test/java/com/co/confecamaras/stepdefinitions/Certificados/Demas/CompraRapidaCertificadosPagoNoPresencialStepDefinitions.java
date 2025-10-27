package com.co.confecamaras.stepdefinitions.Certificados.Demas;

import com.co.confecamaras.navigation.UrlNavegadorCompraRapidaCertificados;
import com.co.confecamaras.questions.Certificados.Demas.ValidacionCompraRapidaCertificadosPagoNoPresencial;
import com.co.confecamaras.tasks.Certificados.Demas.CompraRapidaCertificadosPagoNoPresencial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import org.openqa.selenium.WebDriver;

import java.util.Map;

public class CompraRapidaCertificadosPagoNoPresencialStepDefinitions {


    private WebDriver driver;
    private Actor actor = Actor.named("UsuarioConfecamaras");
    private UrlNavegadorCompraRapidaCertificados urlNavegador = new UrlNavegadorCompraRapidaCertificados();

    @Dado("que un usuario publico requiera comprar un certificado con pago de forma no precencial")
    public void queUnUsuarioPublicoRequieraComprarUnCertificadoConPagoDeFormaNoPrecencial() {
        actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(Open.browserOn(urlNavegador));
    }
    @Cuando("ingrese al sistema SII3 por la URL de compra rapida de certificados con su matricula y para realizar el pago con su clave de afiliado y realice la respectiva compra de un certificado con pago de forma no precencial")
    public void ingreseAlSistemaSII3PorLaURLDeCompraRapidaDeCertificadosConSuMatriculaYParaRealizarElPagoConSuClaveDeAfiliadoYRealiceLaRespectivaCompraDeUnCertificadoConPagoDeFormaNoPrecencial(Map<String, String> data) {
        actor.wasAbleTo(CompraRapidaCertificadosPagoNoPresencial.compraCertificadoPagoNoPresencial(data));
    }
    @Entonces("el sistema le debe generar su respectivo certificado")
    public void elSistemaLeDebeGenerarSuRespectivoCertificado() {
       actor.should(GivenWhenThen.seeThat(ValidacionCompraRapidaCertificadosPagoNoPresencial.mensejeFinal()));
    }
}
