package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.database.NuevasConexiones.UpdateActividadNoComercial;
import com.co.confecamaras.tasks.renovaciones.actividad_no_comercial_comercial.FlujoActividadNoComercial;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.FlujoPrimerFormularioPersonaNaturalEstablecimientoCaja;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoActividadNoComercialComercialStepDefinitinons {

    @When("realizo el flujo de valores actividad no comercial")
    public void realizoElFlujoDeValoresActividadNoComercial() {
        theActorInTheSpotlight().attemptsTo(UpdateActividadNoComercial.datos());
        theActorInTheSpotlight().attemptsTo(FlujoActividadNoComercial.FlujoNoComercial());
        theActorInTheSpotlight().attemptsTo(FlujoPrimerFormularioPersonaNaturalEstablecimientoCaja.FlujoNaturalCaja());
    }

    @When("valido que se realice el pago del proceso de renovacion")
    public void validoQueSeRealiceElPagoDelProcesoDeRenovacion() {
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
    }
}
