package com.co.confecamaras.stepdefinitions.bandeja;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.bandeja.TextoHistorialTransacciones;
import com.co.confecamaras.tasks.Bandeja.RealizarConsulta;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class HistorialTransaccionesStepDefinitions {

    @Dado("^(.*) requiere consultar su historial de transacciones")
    public void confecamarasRequiereConsultarSuHistorialDeTransacciones(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("haga la consulta de historial y transacciones")
    public void hagaLaConsultaDeHistorialYTransacciones() {
        withCurrentActor(RealizarConsulta.historialTransaccion());
    }
    @Entonces("podra ver el historial")
    public void podraVerElHistorial() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoHistorialTransacciones.es(), Matchers.is("  Historial de transacciones")));
    }

}
