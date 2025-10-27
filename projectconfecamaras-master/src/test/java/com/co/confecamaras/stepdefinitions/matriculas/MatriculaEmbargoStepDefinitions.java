package com.co.confecamaras.stepdefinitions.matriculas;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.matriculas.TextoMatriculaEmbargoRecibo;
import com.co.confecamaras.questions.mercantil.TextoRecibo;
import com.co.confecamaras.tasks.matricula.MatriculaConEmbargo;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.mercantil.LiquidacionRenovacionLeyConstans.TEXTO_DATOS_GENERALES_FACTURA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MatriculaEmbargoStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere hacer una renovacion de matricula estando esta embargada")
    public void confecamarasRequiereHacerUnaRenovacionDeMatriculaEstandoEstaEmbargada(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese la cantidad a renovar")
    public void ingreseLaCantidadARenovar() {
        withCurrentActor(MatriculaConEmbargo.conMatriculaEmbargada());
    }
    @Entonces("podra ver los datos generales de matricula")
    public void podraVerLosDatosGeneralesDeMatricula() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoMatriculaEmbargoRecibo.es(), Matchers.is("1. Datos generales del trámite y liquidación")));
    }

}
