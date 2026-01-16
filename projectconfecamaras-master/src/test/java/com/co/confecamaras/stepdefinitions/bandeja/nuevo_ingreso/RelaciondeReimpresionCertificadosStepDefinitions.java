package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;




import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.RelaciondeReimpresionCertificadosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RelaciondeReimpresionCertificadosStepDefinitions {

    @Entonces("realizara acciones de Relacion de Reimpresion Certificados")
    public void realizaraaccionesDeRelaciondeReimpresionCertificados() {
        OnStage.theActorInTheSpotlight().attemptsTo(RelaciondeReimpresionCertificadosTask.estadisticasYextracciones());
    }
}
