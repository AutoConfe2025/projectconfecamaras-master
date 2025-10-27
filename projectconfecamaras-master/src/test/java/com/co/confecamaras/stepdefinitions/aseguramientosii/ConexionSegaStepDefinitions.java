package com.co.confecamaras.stepdefinitions.aseguramientosii;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.aseguramientosii.TablaSegaEs;
import com.co.confecamaras.tasks.aseguramientosii.Conexion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class ConexionSegaStepDefinitions {

    @Dado("^(.*) requiere realizar conexion con el sega")
    public void confecamarasRequiereRealizarConexionConElSega(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese a la edicion")
    public void ingreseALaEdicion() {
        withCurrentActor(Conexion.sega());
    }
    @Entonces("podra visualizar el contenido de las conexiones")
    public void podraVisualizarElContenidoDeLasConexiones() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaSegaEs.visible()));
    }
}
