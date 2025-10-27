package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.mantenimientoeinformes.BotonDescargarRelacionesOperadorEs;
import com.co.confecamaras.questions.mantenimientoeinformes.BotonGenerarInfoMuniEs;
import com.co.confecamaras.tasks.mantenimientoeinformes.ConsultarIngresoPor;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class IngresosPorOperadorStepDefinitions {

    @Dado("^(.*) requiere consultar Ingresos por Operador")
    public void confecamarasRequiereConsultarIngresosPorOperador(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }

    @Cuando("ingrese las fechas y tipo detalle")
    public void ingreseLasFechasYTipoDetalle() {
        withCurrentActor(ConsultarIngresoPor.operador());
    }

    @Entonces("podra visualizar el enlace de descarga de ingresos por operador")
    public void podraVisualizarElEnlaceDeDescargaDeIngresosPorOperador() {
        OnStage.theActorInTheSpotlight().should(seeThat(BotonDescargarRelacionesOperadorEs.visible()));

    }

}
