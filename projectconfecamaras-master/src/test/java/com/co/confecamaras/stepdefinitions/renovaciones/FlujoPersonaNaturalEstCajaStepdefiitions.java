package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.FlujoPrimerFormularioPersonaNaturalEstablecimientoCaja;
import com.co.confecamaras.tasks.renovaciones.FlujoRenovacionHastaValores;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.FlujoSegundoFormularioPersonaNaturalEstablecimientoCaja;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPersonaNaturalEstCajaStepdefiitions {

    @When("realizo el formulario de registro matricula mercantil {string} {string}")
    public void realizoElFormularioDeRegistroMetriculaMercantil(String valor, String query) {
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoRenovacionHastaValores.FlujoHastaValores(valor));
    }

    @When("completo el formulario de renovacion persona natural est caja")
    public void completoElFormularioDeRenovacionPersonaNaturalEstCaja() {
        theActorInTheSpotlight().attemptsTo(FlujoPrimerFormularioPersonaNaturalEstablecimientoCaja.FlujoNaturalCaja());
        theActorInTheSpotlight().attemptsTo(FlujoSegundoFormularioPersonaNaturalEstablecimientoCaja.SegundoFormulario());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
