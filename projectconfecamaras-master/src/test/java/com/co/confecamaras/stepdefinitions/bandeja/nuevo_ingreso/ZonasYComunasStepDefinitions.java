package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.TiposCertificadosTask;
import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ZonasYComunasTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ZonasYComunasStepDefinitions {

    @Entonces("realizara acciones de zonas y comunas")
    public void realizaraaccionesDeZonasYComunas() {
        OnStage.theActorInTheSpotlight().attemptsTo(ZonasYComunasTask.administracion());
    }
}
