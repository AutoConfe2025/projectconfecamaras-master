package com.co.confecamaras.stepdefinitions.Certificados.Demas;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.Demas.ValidacionCompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa;
import com.co.confecamaras.tasks.Certificados.Demas.CompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraCertificadoMenuAccionesCupoAfiliadoClaveFalsaStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico no pueda comprar de un certificado con una clave de afiliado falsa")
    public void ConfecamarasqueUnUsuarioPublicoNoPuedaComprarDeUnCertificadoConUnaClaveDeAfiliadoFalsa(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 usuario publico he intente realizar el pago de su certificado con cupo de afiliado")
    public void ingreseAlSistemaSII3UsuarioPublicoHeIntenteRealizarElPagoDeSuCertificadoConCupoDeAfiliado(Map<String, String> data) {
        withCurrentActor(CompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa.compraCertificadoMenuAccionesCupoAfiliadoClaveFalsa(data));
    }
    @Entonces("el sistem debe mostar un mensaje informando que no es posible realizar la transaccion")
    public void elSistemDebeMostarUnMensajeInformandoQueNoEsPosibleRealizarLaTransaccion() {
        theActorInTheSpotlight().should(seeThat(ValidacionCompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa.mensejeFinal()));
    }
}
