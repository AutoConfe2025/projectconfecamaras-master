package com.co.confecamaras.stepdefinitions.aseguramientosii;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.aseguramientosii.TablaParametrosEs;
import com.co.confecamaras.questions.aseguramientosii.TablaScripts;
import com.co.confecamaras.tasks.aseguramientosii.Parametrizacion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class ParametrizacionBatchStepDefinitions {

    @Dado("^(.*) requiere consultar o editar un proceso batch")
    public void confecamarasRequiereConsultarOEditarUnProcesoBatch(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }


    @Cuando("ingrese al apartado de procesos batch y realice la accion necesaria")
    public void ingreseAlApartadoDeProcesosBatchYRealiceLaAccionNecesaria() {
        withCurrentActor(Parametrizacion.procesosBatch());
    }

    @Entonces("podra visualizar los parametros existentes")
    public void podraVisualizarLosParametrosExistentes() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaParametrosEs.visible()));
    }

}
