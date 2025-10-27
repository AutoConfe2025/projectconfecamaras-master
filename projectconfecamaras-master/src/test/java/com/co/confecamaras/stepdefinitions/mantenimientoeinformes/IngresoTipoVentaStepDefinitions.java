package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.mantenimientoeinformes.BotonCsvEs;
import com.co.confecamaras.questions.mantenimientoeinformes.BotonGenerarInfoServicioEs;
import com.co.confecamaras.tasks.mantenimientoeinformes.IngresoServicioTipoVenta;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class IngresoTipoVentaStepDefinitions {

    @Dado("^(.*) requiere consultar el Ingreso por servicios tipo benta")
    public void confecamarasRequiereConsultarElIngresoPorServiciosTipoBenta(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }
    @Cuando("ingrese las fechas a consultar")
    public void ingreseLasFechasAConsultar() {
        withCurrentActor(IngresoServicioTipoVenta.consultar());
    }
    @Entonces("podra descargar csv de la info")
    public void podraDescargarCsvDeLaInfo() {
        OnStage.theActorInTheSpotlight().should(seeThat(BotonCsvEs.visible()));
    }

}
