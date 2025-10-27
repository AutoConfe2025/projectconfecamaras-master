package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.CertificadosPendientesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class CertificadosPendientesStepDefinitions {
    @Entonces("^validara las acciones de certificados pendientes relacionados al recibo (.+)$")
    public void validaraLasAccionesDeCertificadosPendientesRelacionadosAlRecibo(String recibo) {
        OnStage.theActorInTheSpotlight().attemptsTo(CertificadosPendientesTask.certificado(recibo));
    }
}
