package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.mantenimientoeinformes.BotonCsvEs;
import com.co.confecamaras.questions.mantenimientoeinformes.TablaMantenimientoEs;
import com.co.confecamaras.tasks.mantenimientoeinformes.MantenimientoPuc;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MantenimientoPucStepDefinitions {

    @Dado("^(.*) requiere consultar el registro de los mantenimientos puc")
    public void confecamarasRequiereConsultarElRegistroDeLosMantenimientosPuc(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al aparatdo de mantenimiento puc")
    public void ingreseAlAparatdoDeMantenimientoPuc() {
        withCurrentActor(MantenimientoPuc.consultar());
    }
    @Entonces("podra visualizar la tabla de mantenimiento y sus datos")
    public void podraVisualizarLaTablaDeMantenimientoYSusDatos() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaMantenimientoEs.visible()));
    }

}
