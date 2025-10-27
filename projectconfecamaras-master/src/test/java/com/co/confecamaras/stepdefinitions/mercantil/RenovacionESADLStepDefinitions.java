package com.co.confecamaras.stepdefinitions.mercantil;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.cargaspresupuestos.ConfirmacionCarga;
import com.co.confecamaras.questions.mercantil.ValoresActivosAnioCuatro;
import com.co.confecamaras.questions.mercantil.ValoresActivosAnioDos;
import com.co.confecamaras.questions.mercantil.ValoresActivosAnioTres;
import com.co.confecamaras.questions.mercantil.ValoresActivosAnioUno;
import com.co.confecamaras.tasks.mercantil.RenovarESDALAntes;
import com.co.confecamaras.utils.cargapresupuestos.CargaExitosaConstans;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.mercantil.RenovacionESDALAConstans.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class RenovacionESADLStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere hacer una renovacion ESADL antes del dosmil trece")
    public void RequiereHacerUnaRenovacionESADLAntesDelDosmilTrece(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese la cantidad a renovar por anio")
    public void ingreseLaCantidadARenovarPorAnio() {
        withCurrentActor(RenovarESDALAntes.delDosMilTrece());
    }

    @Entonces("podra ver los anios renovados en la liquidacion")
    public void podraVerLosAniosRenovadosEnLaLiquidacion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValoresActivosAnioUno.es(), Matchers.is(ANIO)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValoresActivosAnioDos.es(), Matchers.is(ANIODOS)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValoresActivosAnioTres.es(), Matchers.is(ANIOTRES)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValoresActivosAnioCuatro.es(), Matchers.is(ANIOCUATRO)));
    }
}
