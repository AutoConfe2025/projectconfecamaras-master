package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.aseguramientosii.TablaScripts;
import com.co.confecamaras.questions.mantenimientoeinformes.BotonGenerarInfoCuentasEs;
import com.co.confecamaras.tasks.mantenimientoeinformes.IngresoPorCuenta;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class IngresoCuentaStepDefinitions {

    @Dado("^(.*) requiere consultar el Ingreso por cuentas")
    public void confecamarasRequiereConsultarElIngresoPorCuentas(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }
    @Cuando("ingrese los datos de cuenta")
    public void ingreseLosDatosDeCuenta() {
        withCurrentActor(IngresoPorCuenta.consultar());
    }
    @Entonces("podra descargar la info")
    public void podraDescargarLaInfo() {
        OnStage.theActorInTheSpotlight().should(seeThat(BotonGenerarInfoCuentasEs.visble()));

    }

}
