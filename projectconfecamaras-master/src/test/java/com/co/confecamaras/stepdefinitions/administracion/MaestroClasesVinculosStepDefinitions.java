package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.TextoActividadComercial;
import com.co.confecamaras.questions.administracion.TextoDescripcionMaestro;
import com.co.confecamaras.tasks.administracion.EditarMaestroClases;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.administracion.MaestroCiiusConstants.SEGUNDO_TEXTO_ACTIVIDAD_COMERCIAL;
import static com.co.confecamaras.utils.administracion.MaestroClasesVinculosConstants.DESCRIPCION_DOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MaestroClasesVinculosStepDefinitions {

    @Dado("^(.*) requiere editar la informacion de un maestro vinculo")
    public void confecamarasRequiereEditarLaInformacionDeUnMaestroVinculo(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese al apartado de maestro clases vinculos e ingrese la nueva informacion")
    public void ingreseAlApartadoDeMaestroClasesVinculosEIngreseLaNuevaInformacion() {
        withCurrentActor(EditarMaestroClases.vinculos());
    }

    @Entonces("podra visualizar los cambios realzados en el maestro vinculo editado")
    public void podraVisualizarLosCambiosRealzadosEnElMaestroVinculoEditado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoDescripcionMaestro.es(), Matchers.is(DESCRIPCION_DOS)));
    }
}
