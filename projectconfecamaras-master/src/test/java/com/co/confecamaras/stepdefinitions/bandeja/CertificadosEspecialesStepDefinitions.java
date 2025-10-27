package com.co.confecamaras.stepdefinitions.bandeja;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaRenovacionMatriculaSucursal;
import com.co.confecamaras.questions.bandeja.CertificadosEspecialesEntrega;
import com.co.confecamaras.tasks.Bandeja.GenerarCertificado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CertificadosEspecialesStepDefinitions {

    @Dado("^(.*) requiere generar un certificado especial")
    public void confecamarasRequiereGenerarUnCertificadoEspecial(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("Suna los anexos y henere el certificado")
    public void sunaLosAnexosYHenereElCertificado() {
        withCurrentActor(GenerarCertificado.especial());
    }
    @Entonces("podra ver la solicitud fue hecha correctamente")
    public void podraVerLaSolicitudFueHechaCorrectamente() {
        theActorInTheSpotlight().should(seeThat(CertificadosEspecialesEntrega.presencialTexto()));
    }
}
