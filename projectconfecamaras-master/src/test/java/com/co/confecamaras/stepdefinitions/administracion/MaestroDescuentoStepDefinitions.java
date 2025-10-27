package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.TablaCuposES;
import com.co.confecamaras.questions.administracion.TablaMaestroEs;
import com.co.confecamaras.tasks.administracion.Maestro;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MaestroDescuentoStepDefinitions {

    @Dado("^(.*) requiere agregar un nuevo codigo de descuento")
    public void confecamarasRequiereAgregarUnNuevoCodigoDeDescuento(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }
    @Cuando("ingrese al ingresar al apartado de tabla maestro de descuento e ingrese los datos")
    public void ingreseAlIngresarAlApartadoDeTablaMaestroDeDescuentoEIngreseLosDatos() {
        withCurrentActor(Maestro.descuento());
    }
    @Entonces("podra visualizar el nuevo maestro de descuento agregado")
    public void podraVisualizarElNuevoMaestroDeDescuentoAgregado() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaMaestroEs.visible()));

    }

}
