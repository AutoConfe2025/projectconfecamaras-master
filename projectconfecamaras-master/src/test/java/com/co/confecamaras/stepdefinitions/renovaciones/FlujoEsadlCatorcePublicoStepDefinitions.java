package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.tasks.SoloRecibirPago;
import com.co.confecamaras.tasks.renovaciones.esadl_catorce_caja.FlujoEsadCatorcePublico;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoFirmaElectronica;
import com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico.FlujoValidacionRecibo;
import com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja.RecibirPago;
import com.co.confecamaras.tasks.renovaciones.renovacion_esadl_clase_49_61_externo.FlujoObtenerSobreDigital;
import com.co.confecamaras.tasks.renovaciones.renovacion_esadl_doce_clase_61_62_externo.FlujoPrimerForm6162;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoEsadlCatorcePublicoStepDefinitions {

    @Then("realizo el flujo de esadl con usuario publico")
    public void realizoElFlujoDeEsadlConUsuarioPublico(){
        theActorInTheSpotlight().attemptsTo(FlujoEsadCatorcePublico.flujoEsadlCatocePublico());
        theActorInTheSpotlight().attemptsTo(SoloRecibirPago.soloRecibePago());
        theActorInTheSpotlight().attemptsTo(RecibirPago.flujoRecibePago());
        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }

    @Then("realizo el flujo de esadl con usuario publico doce")
    public void realizoElFlujoDeEsadlConUsuarioPublicoDoce(){
        theActorInTheSpotlight().attemptsTo(FlujoEsadCatorcePublico.flujoEsadlCatocePublico());
        theActorInTheSpotlight().attemptsTo(PagoUsuarioPublicoNoPresencial.enConfecamaras());
        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }

    @Then("realizo el flujo de esadl con usuario publico Externo")
    public void realizoElFlujoDeEsadlConUsuarioPublicoExterno(){
        theActorInTheSpotlight().attemptsTo(FlujoEsadCatorcePublico.flujoEsadlCatocePublico());
        theActorInTheSpotlight().attemptsTo(FlujoFirmaElectronica.FlujoFirma());
        theActorInTheSpotlight().attemptsTo(PagoUsuarioPublicoNoPresencial.enConfecamaras());
        theActorInTheSpotlight().attemptsTo(FlujoValidacionRecibo.reciboFinal());
    }

    @Then("realizo el flujo de esadl con usuario publico Externo clase 41 69")
    public void realizoElFlujoDeEsadlConUsuarioPublicoExterno4169(){
        theActorInTheSpotlight().attemptsTo(FlujoEsadCatorcePublico.flujoEsadlCatocePublico());
        theActorInTheSpotlight().attemptsTo(FlujoObtenerSobreDigital.SobreConFirma());
    }

    @Then("realizo el flujo de esadl con usuario publico Externo clase 61 62")
    public void realizoElFlujoDeEsadlConUsuarioPublicoExterno6162 (){
        theActorInTheSpotlight().attemptsTo(FlujoPrimerForm6162.flujo6162());
        theActorInTheSpotlight().attemptsTo(FlujoObtenerSobreDigital.SobreConFirma());
    }
}
