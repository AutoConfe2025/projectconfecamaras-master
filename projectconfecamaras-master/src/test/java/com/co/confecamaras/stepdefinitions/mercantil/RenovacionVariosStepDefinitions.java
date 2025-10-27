package com.co.confecamaras.stepdefinitions.mercantil;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.cargaspresupuestos.ConfirmacionCarga;
import com.co.confecamaras.questions.mercantil.MensajesDeAdvertenciaEnElModal;
import com.co.confecamaras.tasks.RunDataBase;
import com.co.confecamaras.tasks.mercantil.RenovarVarios;
import com.co.confecamaras.tasks.mercantil.RunDataBaseQueryRenovacionAnios;
import com.co.confecamaras.utils.cargapresupuestos.CargaExitosaConstans;
import com.co.confecamaras.utils.mercantil.RenovacionAniosConstans;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.emptyOrNullString;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.Matchers.not;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class RenovacionVariosStepDefinitions {

    Map<String, String> data = new HashMap<>();

    @Dado("^(.*) requiere realizar una Renovacion varios anios")
    public void confecamarasRequiereRealizarUnaRenovacionVariosAnios(String actor) {
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionAnios.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("haga renovacion omitiendo un anio anterior")
    public void hagaRenovacionOmitiendoUnAnioAnterior() {
        withCurrentActor(RenovarVarios.anios(DataBase.getMatriculaAnios()));
    }
    @Entonces("debera ver un mensaje de aviso que no es posible realizar la renovacion")
    public void deberaVerUnMensajeDeAvisoQueNoEsPosibleRealizarLaRenovacion() {
        OnStage.theActorInTheSpotlight().should(seeThat("se muestran textos de advertencia en el modal", MensajesDeAdvertenciaEnElModal.sonLosSiguientes(), not(emptyOrNullString()))
        );
    }

}
