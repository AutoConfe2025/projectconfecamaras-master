package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.TiposCertificadosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class TiposCertificadosEspecialesStepDefinitions {

    @Entonces("realizara acciones de tipos certificados especiales")
    public void realizaraaccionesDetiposCertificadosEspeciales() {
        OnStage.theActorInTheSpotlight().attemptsTo(TiposCertificadosTask.especiales());
    }
}
