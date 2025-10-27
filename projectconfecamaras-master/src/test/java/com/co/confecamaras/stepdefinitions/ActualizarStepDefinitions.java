package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Validations;
import com.co.confecamaras.questions.devdos.ActualizarMatriculaRuesQuestion;
import com.co.confecamaras.questions.devdos.ActualizarProponentesRuesQuestion;
import com.co.confecamaras.questions.devdos.ReAbrirCajaQuestion;
import com.co.confecamaras.tasks.DoActualizarMatriculaRues;
import com.co.confecamaras.tasks.DoActualizarProponenteRues;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ActualizarStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere actualizar las matriculas rues")
    public void confecamarasRequiereActualizarLasMatriculasRues(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("consulte por expedientes con el numero de matricula")
    public void consultePorExpedientesConElNumeroDeMatricula() {}

    @Entonces("enviara matriculados al rues")
    public void enviaraMatriculadosAlRues() {
        Excel excel = new Excel(Excel.rutaExcelDev, "ActualizarMatriculasRUES", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoActualizarMatriculaRues.actualizarMatriculaRues(datos.get("Consulta"), datos.get("Informacion"))
        );
    }

    @Entonces("validara el hash")
    public void validara_el_hash() {
        theActorInTheSpotlight().should(seeThat(ActualizarMatriculaRuesQuestion.validacion()));
    }

    // ------ Actualizar Proponentes al RUES ------ //

    @Dado("^(.*) requiere actualizar los proponentes al rues")
    public void confecamarasRequiereActualizarLosProponentesAlRues(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("consulte por expedientes con el numero de proponente")
    public void consultePorExpedientesConElNumeroDeProponente() {}

    @Entonces("actualizara proponente al rues")
    public void actualizara_proponente_al_rues() {
        Excel excel = new Excel(Excel.rutaExcelDev, "ActualizarProponentesRUES", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoActualizarProponenteRues.actualizarProponenteRues(datos.get("Consulta"), datos.get("Informacion"))
        );
    }

    @Entonces("validara el mensaje")
    public void validaraElMensaje() {
        theActorInTheSpotlight().should(seeThat(ActualizarProponentesRuesQuestion.validacion()));
    }

}