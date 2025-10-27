package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.TablaSsietmasEs;
import com.co.confecamaras.questions.administracion.TablaMaestroEs;
import com.co.confecamaras.tasks.administracion.Sistemas;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class SistemasExternosStepDefinitions {

    @Dado("^(.*) requiere agregar un nuevo sistema externo")
    public void confecamarasRequiereAgregarUnNuevoSistemaExterno(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }

    @Cuando("ingrese al ingresar al apartado de sistemas externos y agregue un nuevo sistema y luego lo elimine")
    public void ingreseAlIngresarAlApartadoDeSistemasExternosYAgregueUnNuevoSistemaYLuegoLoElimine() {
        withCurrentActor(Sistemas.externos());
    }

    @Entonces("podra visualizar el nuevo sistema de prueba agregado ya no existe y los demas sistemas son visbles")
    public void podraVisualizarElNuevoSistemaDePruebaAgregadoYaNoExisteYLosDemasSistemasSonVisbles() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaSsietmasEs.visible()));

    }

}
