package com.co.confecamaras.stepdefinitions.Certificados.Demas;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.Demas.ValidacionCompraCertidocadoOpcionAccionesSinCupoAfiliado;
import com.co.confecamaras.tasks.Certificados.Demas.CompraCertidocadoOpcionAccionesSinCupoAfiliado;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraCertidocadoOpcionAccionesSinCupoAfiliadoStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar un certificado si el uso del cupo de afiliado menu acciones")
    public void ConfecamarasqueUnUsuarioPublicoRealiceLaComprarUnCertificadoSiElUsoDelCupoDeAfiliadoMenuAcciones(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 por la URL del Home como usuario publico y realizar la compra de un certificado sin el uso del cupo de afiliado")
    public void ingreseAlSistemaSII3PorLaURLDelHomeComoUsuarioPublicoYRealizarLaCompraDeUnCertificadoSinElUsoDelCupoDeAfiliado(Map<String, String> data) {
        withCurrentActor(CompraCertidocadoOpcionAccionesSinCupoAfiliado.compraCertidocadoOpcionAccionesSinCupoAfiliado(data));
    }
    @Entonces("el sistem le debe generar su respectivo certificado.")
    public void elSistemLeDebeGenerarSuRespectivoCertificado() {
        theActorInTheSpotlight().should(seeThat(ValidacionCompraCertidocadoOpcionAccionesSinCupoAfiliado.mensejeFinal()));
    }
}
