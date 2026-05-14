package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.actualizacion_proponentes.FlujoFormulariosActualizacionProponente;
import com.co.confecamaras.tasks.renovaciones.actualizacion_proponentes.FlujoPagosActualizacionProponente;
import com.co.confecamaras.tasks.renovaciones.actualizacion_proponentes.FlujoParaActualizacion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoActualizacionProponentesStepDefinitions {

    @When("ingreso al modulo de actualizacion {string}")
    public void ingresoAlModuloDeActualizacion(String query) {
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoParaActualizacion.FlujoActualizacion());
    }

    @And("lleno los formularios del proceso")
    public void llenoLosFormulariosDelProceso() {
        theActorInTheSpotlight().attemptsTo(FlujoFormulariosActualizacionProponente.FormContratoBasico());
        theActorInTheSpotlight().attemptsTo(FlujoPagosActualizacionProponente.FlujoPagosActualizar());
    }
}
