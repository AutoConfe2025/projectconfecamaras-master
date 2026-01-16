package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.InformacionExogenaXMLTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class InformacionExogenaXMLStepDefinitions {

    @Entonces("realizara acciones de Información Exógena-XML")
    public void realizaraaccionesDeInformacionExogenaXML() {
        OnStage.theActorInTheSpotlight().attemptsTo(InformacionExogenaXMLTask.estadisticasYextracciones());
    }
}
