package com.co.confecamaras.stepdefinitions.auditorias;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.auditorias.TablaLogEs;
import com.co.confecamaras.tasks.Auditoria.ConsultarLogIngreso;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class LogIngresoStepDefinitions {

    @Dado("^(.*) requiere consultar el log de ingreso al SII3")
    public void confecamarasRequiereConsultarElLogDeIngresoAlSII3(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese un rango de fechas en el aparatdo de ingreso al SII3")
    public void ingreseUnRangoDeFechasEnElAparatdoDeIngresoAlSII3() {
        withCurrentActor(ConsultarLogIngreso.SII3());
    }
    @Entonces("podra visualizar el log correspondiente al ingreso al SII3")
    public void podraVisualizarElLogCorrespondienteAlIngresoAlSII3() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaLogEs.visible()));
    }

}
