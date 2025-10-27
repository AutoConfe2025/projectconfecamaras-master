package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.TablaCuposES;
import com.co.confecamaras.questions.auditorias.TablaLogClave;
import com.co.confecamaras.tasks.administracion.Cupos;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class CupoAfiliadoStepDefinitions {

    @Dado("^(.*) requiere agregar un nuevo cupo")
    public void confecamarasRequiereAgregarUnNuevoCupo(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }
    @Cuando("ingrese al ingresar al apartado de cupo afiliados ingrese uno nuevo")
    public void ingreseAlIngresarAlApartadoDeCupoAfiliadosIngreseUnoNuevo() {
        withCurrentActor(Cupos.afiliados());
    }
    @Entonces("podra visualizar el nuevo cupo afiliado y los existentes")
    public void podraVisualizarElNuevoCupoAfiliadoYLosExistentes() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaCuposES.visible()));

    }

}
