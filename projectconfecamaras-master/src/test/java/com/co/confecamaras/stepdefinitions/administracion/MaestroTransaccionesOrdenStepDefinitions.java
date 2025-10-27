package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.NombreMaestro;
import com.co.confecamaras.questions.administracion.TextoActividadComercial;
import com.co.confecamaras.tasks.administracion.MaestroTransaccion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.administracion.MaestroCiiusConstants.SEGUNDO_TEXTO_ACTIVIDAD_COMERCIAL;
import static com.co.confecamaras.utils.administracion.MaestroTransaccionConstants.TITULO_MAESTRO_ORIGINAL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MaestroTransaccionesOrdenStepDefinitions {

    @Dado("^(.*) requiere editar la informacion de un maestro transacciones")
    public void confecamarasRequiereEditarLaInformacionDeUnMaestroTransacciones(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al apartado de maestro transacciones e ingrese la info")
    public void ingreseAlApartadoDeMaestroTransaccionesEIngreseLaInfo() {
        withCurrentActor(MaestroTransaccion.orden());
    }
    @Entonces("podra visualizar los cambios realzados en el maestro transacciones ordem")
    public void podraVisualizarLosCambiosRealzadosEnElMaestroTransaccionesOrdem() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(NombreMaestro.es(), Matchers.is(TITULO_MAESTRO_ORIGINAL)));

    }
}
