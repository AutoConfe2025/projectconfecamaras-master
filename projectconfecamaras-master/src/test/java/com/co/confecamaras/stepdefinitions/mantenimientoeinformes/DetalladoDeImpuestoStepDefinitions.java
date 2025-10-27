package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.mantenimientoeinformes.MensajeDeDataGeneradaEs;
import com.co.confecamaras.tasks.mantenimientoeinformes.ConsultarDetallado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class DetalladoDeImpuestoStepDefinitions {

    @Dado("^(.*) requiere consultar el impuesto por registro sirep")
    public void confecamarasRequiereConsultarElImpuestoPorRegistroSirep(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese las fechas y correo")
    public void ingreseLasFechasYCorreo() {
        withCurrentActor(ConsultarDetallado.deImpuesto());
    }

    @Entonces("podra visualizar el codigo de extraccion")
    public void podraVisualizarElCodigoDeExtraccion() {
        OnStage.theActorInTheSpotlight().should(seeThat(MensajeDeDataGeneradaEs.visible()));
    }
}
