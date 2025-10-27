package com.co.confecamaras.stepdefinitions.auditorias;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.auditorias.TablaLogClave;
import com.co.confecamaras.questions.auditorias.TablaLogEs;
import com.co.confecamaras.tasks.Auditoria.ConsultarLog;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class LogCambioDeClaveStepdDefinitions {

    @Dado("^(.*) requiere consultar el log de cambio de clave")
    public void confecamarasRequiereConsultarElLogDeCambioDeClave(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese un rango de fechas")
    public void ingreseUnRangoDeFechas() {
        withCurrentActor(ConsultarLog.cambioDeClave());
    }

    @Entonces("podra visualizar el log correspondiente a ese rango de fechas")
    public void podraVisualizarElLogCorrespondienteAEseRangoDeFechas() {
        //OnStage.theActorInTheSpotlight().should(seeThat(TablaLogClave.esVisible()));
    }


}
