package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.mantenimientoeinformes.TextoCasillaOtros;
import com.co.confecamaras.tasks.mantenimientoeinformes.MantenimientoServicio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.mantenimientoeinformes.MantenimientoServiciosConstants.TEXTO_OTROS_VISBLE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MantenimientoServicioStepDefintions {

    @Dado("^(.*) requiere ingresar datos al servicio y la parametrizacion nif")
    public void confecamarasRequiereIngresarDatosAlServicioYLaParametrizacionNif(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }
    @Cuando("ingrese los datos de servicio y nif")
    public void ingreseLosDatosDeServicioYNif() {
        withCurrentActor(MantenimientoServicio.consultar());
    }
    @Entonces("podra visualizar los datos ingresados")
    public void podraVisualizarLosDatosIngresados() {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoCasillaOtros.es(), Matchers.is(TEXTO_OTROS_VISBLE)));
    }

}
