package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.TextoActividadComercial;
import com.co.confecamaras.tasks.administracion.ConsultarMaestro;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.administracion.MaestroCiiusConstants.SEGUNDO_TEXTO_ACTIVIDAD_COMERCIAL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MaestroCiiusStepDefinitions {

    @Dado("^(.*) requiere editar la informacion comercial de un establecimiento")
    public void confecamarasRequiereEditarLaInformacionComercialDeUnEstablecimiento(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }

    @Cuando("ingrese al ingresar al apartado de maestro ciius y edite la informacion")
    public void ingreseAlIngresarAlApartadoDeMaestroCiiusYEditeLaInformacion() {
        withCurrentActor(ConsultarMaestro.ciiu());

    }

    @Entonces("podra visualizar los cambios realzados")
    public void podraVisualizarLosCambiosRealzados() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoActividadComercial.es(), Matchers.is(SEGUNDO_TEXTO_ACTIVIDAD_COMERCIAL)));

    }

}
