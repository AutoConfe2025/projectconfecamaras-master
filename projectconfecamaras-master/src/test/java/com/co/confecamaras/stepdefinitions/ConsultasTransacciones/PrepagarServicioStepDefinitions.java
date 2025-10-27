package com.co.confecamaras.stepdefinitions.ConsultasTransacciones;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.usuariocaja.ElTextoDelPDF;
import com.co.confecamaras.tasks.ConsultasTransacciones.Prepagar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static org.hamcrest.CoreMatchers.containsString;

public class PrepagarServicioStepDefinitions {

    @Dado("^(.*) requiere prepagar los servicios")
    public void confecamarasRequierePrepagarLosServicios(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("consulte sus datos e ingrese la cantidad a prepagar")
    public void consulteSusDatosEIngreseLaCantidadAPrepagar() {
        withCurrentActor(Prepagar.servicios());
    }

    @Entonces("podra realizar el previo pago de los servicios")
    public void podraRealizarElPrevioPagoDeLosServicios() {
        OnStage.theActorInTheSpotlight().should(seeThat(ElTextoDelPDF.es(), containsString("PREPAGO DE SERVICIOS")));

    }

}
