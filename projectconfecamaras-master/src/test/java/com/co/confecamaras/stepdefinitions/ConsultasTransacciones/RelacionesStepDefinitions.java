package com.co.confecamaras.stepdefinitions.ConsultasTransacciones;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.consultasytransacciones.RelacionesMatriculadosTablaEs;
import com.co.confecamaras.tasks.ConsultasTransacciones.ConsultarRelacionDe;
import com.co.confecamaras.tasks.ConsultasTransacciones.RelacionDe;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class RelacionesStepDefinitions {

    @Dado("^(.*) requiere consultar relacion")
    public void confecamarasRequiereConsultarRelacion(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese el rango de fechas de consulta")
    public void ingreseElRangoDeFechasDeConsulta() {
        withCurrentActor(ConsultarRelacionDe.matriculados());
    }

    @Cuando("ingrese el rango de fechas de consulta de renovados")
    public void ingreseElRangoDeFechasDeConsultaDeRenovados() {
        withCurrentActor(RelacionDe.renovados());
    }
    @Entonces("podra ver la informacion")
    public void podraVerLaInformacion() {
        OnStage.theActorInTheSpotlight().should(seeThat(RelacionesMatriculadosTablaEs.visible()));
    }

}
