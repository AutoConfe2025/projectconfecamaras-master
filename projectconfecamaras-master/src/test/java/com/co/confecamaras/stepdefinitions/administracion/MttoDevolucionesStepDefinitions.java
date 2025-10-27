package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.TextoActividadComercial;
import com.co.confecamaras.questions.administracion.TextoDeEstadoProcede;
import com.co.confecamaras.tasks.administracion.MantenimientoDevoluciones;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.administracion.MaestroCiiusConstants.SEGUNDO_TEXTO_ACTIVIDAD_COMERCIAL;
import static com.co.confecamaras.utils.administracion.MmtoDevolucionesConstants.VALOR_ORIGINAL_ESTADO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MttoDevolucionesStepDefinitions {

    @Dado("^(.*) requiere consultar o editar una devolucion")
    public void confecamarasRequiereConsultarOEditarUnaDevolucion(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese al ingresar al apartado mtto devoluciones y edite o ingrese la info necesaria")
    public void ingreseAlIngresarAlApartadoMttoDevolucionesYEditeOIngreseLaInfoNecesaria() {
        withCurrentActor(MantenimientoDevoluciones.editar());
    }

    @Entonces("podra visualizar la informacion actualizada")
    public void podraVisualizarLaInformacionActualizada() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoDeEstadoProcede.es(), Matchers.is(VALOR_ORIGINAL_ESTADO)));

    }
}
