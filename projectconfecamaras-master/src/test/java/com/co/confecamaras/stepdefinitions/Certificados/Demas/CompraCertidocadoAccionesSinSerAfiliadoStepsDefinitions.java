package com.co.confecamaras.stepdefinitions.Certificados.Demas;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.Demas.ValidacionCompraCertidocadoAccionesSinSerAfiliado;
import com.co.confecamaras.tasks.Certificados.Demas.CompraCertidocadoAccionesSinSerAfiliado;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraCertidocadoAccionesSinSerAfiliadoStepsDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico requiera comprar un certificado")
    public void confecamarasqueUnUsuarioPublicoRequieraComprarUnCertificado(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 por la URL del Home como usuario publico y realizar compra de un certificado")
    public void ingreseAlSistemaSII3PorLaURLDelHomeComoUsuarioPublicoYRealizarCompraDeUnCertificado(Map<String, String> data) {
        withCurrentActor(CompraCertidocadoAccionesSinSerAfiliado.compraCertidocadoAccionesSinSerAfiliado(data));
    }
    @Entonces("el sistem generar su respectivo certificado")
    public void elSistemGenerarSuRespectivoCertificado() {
        theActorInTheSpotlight().should(seeThat(ValidacionCompraCertidocadoAccionesSinSerAfiliado.mensejeFinal()));
    }
}
