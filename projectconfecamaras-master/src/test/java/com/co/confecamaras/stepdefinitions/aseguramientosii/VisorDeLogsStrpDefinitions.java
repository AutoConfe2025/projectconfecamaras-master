package com.co.confecamaras.stepdefinitions.aseguramientosii;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.aseguramientosii.TablaSegaEs;
import com.co.confecamaras.questions.aseguramientosii.TablaVsiorLogsEs;
import com.co.confecamaras.tasks.aseguramientosii.Visualizar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class VisorDeLogsStrpDefinitions {

    @Dado("^(.*) requiere consultar el visor de logs")
    public void confecamarasRequiereConsultarElVisorDeLogs(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al apartado de visor de logs")
    public void ingreseAlApartadoDeVisorDeLogs() {
        withCurrentActor(Visualizar.logs());
    }
    @Entonces("podra visualizar los logs segun el tipo de log que el usuario elija")
    public void podraVisualizarLosLogsSegunElTipoDeLogQueElUsuarioElija() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaVsiorLogsEs.visible()));
    }

}
