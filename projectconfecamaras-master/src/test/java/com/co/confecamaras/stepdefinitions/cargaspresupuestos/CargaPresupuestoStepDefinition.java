package com.co.confecamaras.stepdefinitions.cargaspresupuestos;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.cargaspresupuestos.ConfirmacionCarga;
import com.co.confecamaras.tasks.cargaspresupuesto.PresupuestoMetas;
import com.co.confecamaras.utils.cargapresupuestos.CargaExitosaConstans;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class CargaPresupuestoStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere cargar un archivo de metas y presupuestos")
    public void confecamarasRequiereCargarUnArchivoDeMetasYPresupuestos(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("busque la seccion de cargas y suba el archivo")
    public void busqueLaSeccionDeCargasDePresupuestoYSubaElArchivo() {
        withCurrentActor(PresupuestoMetas.cargar());
    }

    @Entonces("podra ver que la informacion cargo exitosamente")
    public void podraVerQueLaInformacionCargoExitosamente() {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirmacionCarga.compararCon(), Matchers.is(CargaExitosaConstans.CARGA_EXITOSA)));
    }

}
