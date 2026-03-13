package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.tasks.renovaciones.persona_juridica_est_caja.FlujoPrimerFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_juridica_establecimiento_publico.FlujoPersonaJuridicaEstablecimientoPublicoSegundoFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoFirmaElectronica;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoSegundoFormulario;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoValidacionRecibo;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPersonaJuridicaConMatriculaLink {

    @Then("realizo el flujo de persona juridica y usuario publico externo con matricula")
    public void realizoElFlujoDePersonaJuridicaYUsuarioPublicoExternoConMatricula(){
        theActorInTheSpotlight().attemptsTo(FlujoPrimerFormulario.FormularioUnoPJ());
        theActorInTheSpotlight().attemptsTo(FlujoPersonaJuridicaEstablecimientoPublicoSegundoFormulario.segundoFormulario());
        theActorInTheSpotlight().attemptsTo(FlujoFirmaElectronica.FlujoFirma());
        theActorInTheSpotlight().attemptsTo(PagoUsuarioPublicoNoPresencial.enConfecamaras());
        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }
}
