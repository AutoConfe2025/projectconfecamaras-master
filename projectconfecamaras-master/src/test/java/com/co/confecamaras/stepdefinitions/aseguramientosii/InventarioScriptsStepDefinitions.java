package com.co.confecamaras.stepdefinitions.aseguramientosii;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.aseguramientosii.TablaScripts;
import com.co.confecamaras.tasks.aseguramientosii.Inventario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class InventarioScriptsStepDefinitions {

    @Dado("^(.*) requiere consultar el inventario de scripts")
    public void confecamarasRequiereConsultarElInventarioDeScripts(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al apartado de inventario de scripts")
    public void ingreseAlApartadoDeInventarioDeScripts() {
        withCurrentActor(Inventario.Scripts());
    }
    @Entonces("podra visualizar el contenido del inventario")
    public void podraVisualizarElContenidoDelInventario() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaScripts.esVisible()));

    }

}
