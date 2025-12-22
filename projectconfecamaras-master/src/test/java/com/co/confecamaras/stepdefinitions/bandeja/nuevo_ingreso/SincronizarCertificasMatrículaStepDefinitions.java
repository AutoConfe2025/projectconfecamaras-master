package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;




import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.SincronizarCertificasMatriculaTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class SincronizarCertificasMatrículaStepDefinitions {

    @Entonces("realizara acciones de  Sincronizar Certificas Matricula")
    public void realizaraaccionesDeSincronizarCertificasMatricula() {
        OnStage.theActorInTheSpotlight().attemptsTo(SincronizarCertificasMatriculaTask.administracion());
    }
}
