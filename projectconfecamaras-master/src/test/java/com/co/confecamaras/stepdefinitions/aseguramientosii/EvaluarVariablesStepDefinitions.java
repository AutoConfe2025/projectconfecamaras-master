package com.co.confecamaras.stepdefinitions.aseguramientosii;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.aseguramientosii.TablaSegaEs;
import com.co.confecamaras.questions.aseguramientosii.VariablesSessionEs;
import com.co.confecamaras.tasks.aseguramientosii.Evaluar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class EvaluarVariablesStepDefinitions {

    @Dado("^(.*) requiere consultar las variables de sesion")
    public void confecamarasRequiereConsultarLasVariablesDeSesion(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al apartado de variables de sesion")
    public void ingreseAlApartadoDeVariablesDeSesion() {
        withCurrentActor(Evaluar.variablesSesion());
    }
    @Entonces("podra visualizar las variables des sesion existentes")
    public void podraVisualizarLasVariablesDesSesionExistentes() {
        OnStage.theActorInTheSpotlight().should(seeThat(VariablesSessionEs.visible()));
    }

}
