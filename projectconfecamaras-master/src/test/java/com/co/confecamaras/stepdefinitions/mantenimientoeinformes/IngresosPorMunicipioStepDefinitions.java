package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.mantenimientoeinformes.BotonGenerarInfoMuniEs;
import com.co.confecamaras.questions.mantenimientoeinformes.MensajeDeDataGeneradaEs;
import com.co.confecamaras.tasks.mantenimientoeinformes.ConsultarIngresoMunicipio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class IngresosPorMunicipioStepDefinitions {

    @Dado("^(.*) requiere consultar Ingresos por Municipio - Expediente")
    public void confecamarasRequiereConsultarIngresosPorMunicipioExpediente(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese el rango de fechas para consultar los ingresos")
    public void ingreseElRangoDeFechasParaConsultarLosIngresos() {
        withCurrentActor(ConsultarIngresoMunicipio.expediente());
    }

    @Entonces("podra visualizar el enlace de descarga de ingresos por municipio")
    public void podraVisualizarElEnlaceDeDescargaDeIngresosPorMunicipio() {
        OnStage.theActorInTheSpotlight().should(seeThat(BotonGenerarInfoMuniEs.visible()));
    }


}
