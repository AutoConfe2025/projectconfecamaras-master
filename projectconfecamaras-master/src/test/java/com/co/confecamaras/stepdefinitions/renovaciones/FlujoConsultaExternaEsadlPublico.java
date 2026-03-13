package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.tasks.renovaciones.renovacion_consulta_externa_esadl_publico.FlujoValoresConsultaExternaEsadlPublico;
import com.co.confecamaras.tasks.renovaciones.renovacion_persona_juridica_publico.RenovacionPersonaJuridicaPublico;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoConsultaExternaEsadlPublico {

    @When("realizo el flujo de valores sin establecimiento usuario publico consulta externa {string}")
    public void realizoElFlujoDeValoresSinEstablecimientoUsuarioPublicoConsultaExterna(String valor){
        theActorInTheSpotlight().attemptsTo(FlujoValoresConsultaExternaEsadlPublico.flujoValoresConsultaEsadl(valor));
    }
}
