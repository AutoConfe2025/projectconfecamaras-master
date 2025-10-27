package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.mantenimientoeinformes.BotonGenerarInfoCuentasEs;
import com.co.confecamaras.questions.mantenimientoeinformes.BotonGenerarInfoServicioEs;
import com.co.confecamaras.tasks.mantenimientoeinformes.IngresoServicio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class IngresoServicioStepDefinitions {

    @Dado("^(.*) requiere consultar el Ingreso por servicio")
    public void confecamarasRequiereConsultarElIngresoPorServicio(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese los datos de servicio")
    public void ingreseLosDatosDeServicio() {
        withCurrentActor(IngresoServicio.consultar());
    }
    @Entonces("podra descargar la info de servicio")
    public void podraDescargarLaInfoDeServicio() {
        OnStage.theActorInTheSpotlight().should(seeThat(BotonGenerarInfoServicioEs.visible()));

    }

}
