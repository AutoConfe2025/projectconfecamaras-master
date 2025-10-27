package com.co.confecamaras.stepdefinitions.aseguramientosii;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.aseguramientosii.AlertText;
import com.co.confecamaras.questions.aseguramientosii.TablaSegaEs;
import com.co.confecamaras.questions.matriculas.TextoMatriculaEmbargoRecibo;
import com.co.confecamaras.tasks.aseguramientosii.Segmento;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class SegmentoIpStepDefinitions {

    @Dado("^(.*) requiere consultar las ip disponibles")
    public void confecamarasRequiereConsultarLasIpDisponibles(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }

    @Cuando("ingrese al apartado de segmento ip")
    public void ingreseAlApartadoDeSegmentoIp() {
        withCurrentActor(Segmento.IP());
    }

    @Entonces("podra visualizar las ip disponibles")
    public void podraVisualizarLasIpDisponibles() {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AlertText.es(), Matchers.is("Grabados correctamente")));

    }

}
