package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.TablaEmailEs;
import com.co.confecamaras.questions.administracion.TablaProcesosEs;
import com.co.confecamaras.tasks.administracion.Kill;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class KillProcessStepDefinitions {

    @Dado("^(.*) requiere terminar una tarea")
    public void confecamarasRequiereTerminarUnaTarea(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al ingresar al apartado de kill process y selecione el proceso a finalizar")
    public void ingreseAlIngresarAlApartadoDeKillProcessYSelecioneElProcesoAFinalizar() {
        withCurrentActor(Kill.process());
    }
    @Entonces("podra visualizar que el proceso ha sido finalizado")
    public void podraVisualizarQueElProcesoHaSidoFinalizado() {
            OnStage.theActorInTheSpotlight().should(seeThat(TablaProcesosEs.visible()));

    }

}
