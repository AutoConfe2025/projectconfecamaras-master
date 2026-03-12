package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoFirmaElectronica;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoPrimerFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoSegundoFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoValidacionRecibo;
import com.co.confecamaras.tasks.renovaciones.renovacion_consulta_externa_pn_publico.FlujoHastaValoresConMatricula;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPersonaNatrulaConMatriculaLink {

    @When("realizo el flujo de valores usuario publico matricula {string}")
    public void realizoElFlujoDeValoresUsuarioPublicoMatricula(String valor){
        theActorInTheSpotlight().attemptsTo(FlujoHastaValoresConMatricula.valoresConMatricula(valor));
    }

    @Then("realizo el flujo de persona natural y usuario publico externo con matricula")
    public void FlujoMatriculaExternoATravesLink(){
        theActorInTheSpotlight().attemptsTo(FlujoPrimerFormulario.flujoPrimerFormularioExterno());
        theActorInTheSpotlight().attemptsTo(FlujoSegundoFormulario.segundoFormularioExterno());
        theActorInTheSpotlight().attemptsTo(FlujoFirmaElectronica.FlujoFirma());
        theActorInTheSpotlight().attemptsTo(PagoUsuarioPublicoNoPresencial.enConfecamaras());
        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }
}
