package com.co.confecamaras.stepdefinitions.ConsultasTransacciones;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.consultasytransacciones.MensajeCambioDeClave;
import com.co.confecamaras.tasks.ConsultasTransacciones.GenerarClave;
import com.co.confecamaras.utils.consultasytransacciones.GenerarClaveConstans;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class GenerarClaveStepDefinition {

    @Dado("^(.*) requiere generar nueva clave al afiliado")
    public void confecamarasRequiereGenerarNuevaClaveAlAfiliado(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese matricula y correo")
    public void ingreseMatriculaYCorreo() {
        withCurrentActor(GenerarClave.afiliado());
    }
    @Entonces("podra generar nueva clave")
    public void podraGenerarNuevaClave() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MensajeCambioDeClave.es(), Matchers.is(GenerarClaveConstans.MENSAJE_CAMBIO)));
    }

}
