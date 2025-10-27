package com.co.confecamaras.stepdefinitions.expedientegrafico;

import com.co.confecamaras.questions.expedientegrafico.TablaExpedienteEs;
import com.co.confecamaras.tasks.expedientegrafico.ConsultarExpediente;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class ExpedienteGraficoStepDefinitions {
    @Cuando("ingrese los datos dseados en el campo correspondiente")
    public void ingreseLosDatosDseadosEnElCampoCorrespondiente() {
        withCurrentActor(ConsultarExpediente.grafico());
    }
    @Entonces("podra ver el expediente")
    public void podraVerElExpediente() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaExpedienteEs.visible()));
    }

}
