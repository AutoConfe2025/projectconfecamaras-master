package com.co.confecamaras.stepdefinitions.aseguramientosii;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.aseguramientosii.EnlaceDescargaEs;
import com.co.confecamaras.questions.aseguramientosii.TablaSegaEs;
import com.co.confecamaras.tasks.aseguramientosii.Exportar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class ExportarEstructuraStepDefinitions {

    @Dado("^(.*) requiere exportar la estructura del SII")
    public void confecamarasRequiereExportarLaEstructuraDelSII(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("haga la consulta")
    public void hagaLaConsulta() {
        withCurrentActor(Exportar.estructura());
    }
    @Entonces("podra visualizar el enlace de descarga")
    public void podraVisualizarElEnlaceDeDescarga() {
        OnStage.theActorInTheSpotlight().should(seeThat(EnlaceDescargaEs.visible()));

    }
}
