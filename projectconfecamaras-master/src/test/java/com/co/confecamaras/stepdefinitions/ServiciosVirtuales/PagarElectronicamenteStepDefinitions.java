package com.co.confecamaras.stepdefinitions.ServiciosVirtuales;

import com.co.confecamaras.tasks.ServiciosVirtuales.PagarElectronicamenteTask;
import com.co.confecamaras.tasks.ServiciosVirtuales.SolicitarCertificadoTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

public class PagarElectronicamenteStepDefinitions {
    @Entonces("^entrara a solicitar la cantidad de (.+) certificados para la matricula (.+) para realizar el pago$")
    public void entraraACertificadosConsultandoElNumeroDeMatricula(String cantidad, String matricula) {
        OnStage.theActorInTheSpotlight().attemptsTo(SolicitarCertificadoTask.solicitar(cantidad, matricula));
    }

}
