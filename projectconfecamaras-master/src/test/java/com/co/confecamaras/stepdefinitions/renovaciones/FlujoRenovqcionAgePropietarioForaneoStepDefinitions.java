package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.renovacion_age_propietario_foraneo.FlujoActualizacionCommonXX;
import com.co.confecamaras.tasks.renovaciones.renovacion_age_propietario_foraneo.FlujoValoresForaneo;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoRenovqcionAgePropietarioForaneoStepDefinitions {

    @Then("realizo la actualizacion en la bandeja mantenimiento")
    public void realizoLaActualizacionEnLaBandejaMantenimiento(){
        theActorInTheSpotlight().attemptsTo(FlujoActualizacionCommonXX.FlujoActualizarCommon());
    }

    @Then("realizo las validaciones de la matricula {string}")
    public void realizoLasValidacionesDeLaMatricula(String query){
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValoresForaneo.FlujoForaneo());
    }
}
