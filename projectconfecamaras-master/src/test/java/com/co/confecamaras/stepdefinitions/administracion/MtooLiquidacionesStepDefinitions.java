package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.MensajeInformativoGuardarLiquidacion;
import com.co.confecamaras.tasks.administracion.MttoLiquidacion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.administracion.MttoLiquidacionesConstants.MENSAJE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MtooLiquidacionesStepDefinitions {

    @Dado("^(.*) requiere editar info de una liquidacion")
    public void confecamarasRequiereEditarInfoDeUnaLiquidacion(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al ingresar al apartado de mtto liquidacion e ingrese la info")
    public void ingreseAlIngresarAlApartadoDeMttoLiquidacionEIngreseLaInfo() {
       withCurrentActor(MttoLiquidacion.hacer());
    }
    @Entonces("podra visualizar la nueva info agregada de la liquidacion")
    public void podraVisualizarLaNuevaInfoAgregadaDeLaLiquidacion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MensajeInformativoGuardarLiquidacion.es(), Matchers.is(MENSAJE)));
    }

}
