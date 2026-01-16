package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;



import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.MensajesErrorTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class MensajesErrorStepDefinitions {

    @Entonces("realizara acciones de Mensajes error")
    public void realizaraAccionesDeMensajesError() {
        OnStage.theActorInTheSpotlight().attemptsTo(MensajesErrorTask.tablasBacisas());
    }
}
