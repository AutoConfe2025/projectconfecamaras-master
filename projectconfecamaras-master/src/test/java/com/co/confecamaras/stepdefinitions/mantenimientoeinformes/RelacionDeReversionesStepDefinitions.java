package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.mantenimientoeinformes.BotonDescargarRelacionesOperadorEs;
import com.co.confecamaras.questions.mantenimientoeinformes.EnlaceDescargarArchivoEs;
import com.co.confecamaras.tasks.mantenimientoeinformes.ConsultarRelacionesDe;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class RelacionDeReversionesStepDefinitions {

    @Dado("^(.*) requiere consultar Relacion de Reversiones")
    public void confecamarasRequiereConsultarRelacionDeReversiones(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }

    @Cuando("ingrese las fechas para la extraccion")
    public void ingreseLasFechasParaLaExtraccion() {
        withCurrentActor(ConsultarRelacionesDe.reversiones());
    }

    @Entonces("podra visualizar el enlace de descarga de relacion de reversiones")
    public void podraVisualizarElEnlaceDeDescargaDeRelacionDeReversiones() {
        OnStage.theActorInTheSpotlight().should(seeThat(EnlaceDescargarArchivoEs.visible()));
    }

}
