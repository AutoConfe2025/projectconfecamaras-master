package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.mantenimientoeinformes.BotonSerCostoEs;
import com.co.confecamaras.tasks.mantenimientoeinformes.IngresoPorCCosto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class IngresoPorCCostoStenpDefinitios {

    @Dado("^(.*) requiere consultar el Ingreso por C costos")
    public void confecamarasRequiereConsultarElIngresoPorCCostos(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese las fechas a consultar con los costos")
    public void ingreseLasFechasAConsultarConLosCostos() {
        withCurrentActor(IngresoPorCCosto.consultar());
    }
    @Entonces("podra descargar los ingresos por costo")
    public void podraDescargarLosIngresosPorCosto() {
        OnStage.theActorInTheSpotlight().should(seeThat(BotonSerCostoEs.visible()));
    }

}
