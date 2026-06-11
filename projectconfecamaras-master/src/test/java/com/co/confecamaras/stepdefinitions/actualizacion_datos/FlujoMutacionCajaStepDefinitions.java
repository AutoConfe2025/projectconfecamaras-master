package com.co.confecamaras.stepdefinitions.actualizacion_datos;

import com.co.confecamaras.questions.actualizacion_datos.ValidaTextoFinal;
import com.co.confecamaras.tasks.actualizacion_datos.*;
import com.co.confecamaras.tasks.certificados_automaticos.certificado_existencia_caja.FlujoPAgoCertificadoPublico;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.bandejaponal.BandejaPonalConstans.MENSAJE_ERROR_MUTACION;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoMutacionCajaStepDefinitions {

    @When("realizo el flujo de actualizacion de datos mutacion caja {string}")
    public void realizoElFlujoDeActualizacionDeDatosMutacionCaja(String matricula){
        theActorInTheSpotlight().attemptsTo(FlujoActualizacionMutacionCaja.FlujoMutacionCaja(matricula));
    }

    @When("realizo el flujo de actualizacion de datos mutacion publico {string}")
    public void realizoElFlujoDeActualizacionDeDatosMutacionPublico(String matricula){
        theActorInTheSpotlight().attemptsTo(FlujoActualizacionMutacionPublico.flujomutacionPublico(matricula));
    }

    @When("realizo el flujo de mutacion alto impacto caja {string}")
    public void realizoElFlujoDeAcMutacionAltoImpactoCaja(String matricula){
        theActorInTheSpotlight().attemptsTo(FlujoMutacionCiiuAltoAimpactoCaja.FlujoAltoImpactoCaja(matricula));
    }

    @When("realizo el flujo de mutacion alto impacto publico {string}")
    public void realizoElFlujoDeAcMutacionAltoImpactoPublico(String matricula){
        theActorInTheSpotlight().attemptsTo(FlujoMutacionCiiuAltoAimpactoPublico.flujoAltoImpactoPublico(matricula));
    }

    @When("realizo el flujo de reingreso de tramites mutacion devolucion de plano rin reingreso {string}")
    public void reingresoDeTramitesMutacionDevolucionDePlanoRinReingreso(String matricula){
        theActorInTheSpotlight().attemptsTo(FlujoReingresoTramitesMutacionDevolucionPlanoSinReingreso.RevolucionPlanoSinReingreso(matricula));
    }

    @When("realizo el flujo de inscripcion proponente caja {string}")
    public void realizoElFlujoDeInscripcionProponenteCaja(String matricula){
        theActorInTheSpotlight().attemptsTo(inscripcionProponenteCaja.incripcionProponenteCaja(matricula));
    }

    @When("realizo el flujo de reingreso de tramites reforma devolucion plano sin reingreso {string}")
    public void realizoElFlujoDeReingresoDeTramitesReformaDevolucionPlanoSinReingreso(String matricula){
        theActorInTheSpotlight().attemptsTo(FlujoReingresoTramiteReformaProcedeReingresoDocumento.FlujoHastaPagoReingresoDocumento(matricula));
    }

    @When("realizo el flujo de reingreso de tramites reforma procede el reingreso del documento {string}")
    public void realizoElFlujoDeReingresoDeTramitesReformaProcedeElReingresoDelDocumento(String matricula){
        theActorInTheSpotlight().attemptsTo(FlujoReingresoTramiteReformaProcedeReingresoDocumento.FlujoHastaPagoReingresoDocumento(matricula));
    }

    @And("realizo el pago de devolucion plano sin reingreso")
    public void realizoElPagoDeReingresoDeDocumentos(){
        theActorInTheSpotlight().attemptsTo(FlujoRecibirPagoReingresoDocumento.pagoReingresoDocumento());
    }

    @Then("realizo el flujo de recibir el pago de la mutacion")
    public void realizoElFlujoDeRecibirElPagoDeLaMutacion(){
        theActorInTheSpotlight().attemptsTo(FlujoRecibirPagoMutacion.recibePagoMutacion());
    }

    @Then("realizo el flujo de recibir el pago de la mutacion publico")
    public void realizoElFlujoDeRecibirElPagoDeLaMutacionPublico(){
        theActorInTheSpotlight().attemptsTo(FlujoPAgoCertificadoPublico.FlujoPagoPublicoCertificado());
    }

    @Then("realizo el flujo de recibir el pago de la devolucion plano sin reingreso")
    public void realizoElFlujoDeRecibirElPagoDeLaDevolucionPlanoSinReingreso(){
        theActorInTheSpotlight().attemptsTo(FlujoRecibirPagoDuplicado.flujoRecibePagoDuplicado());
    }

    @Then("realizo el flujo de reingreso devolucion plano sin registro")
    public void realizoElFlujoDeReingresoDevolucionPlanoSinRegistro(){
        theActorInTheSpotlight().attemptsTo(FlujoReingresoDevolucionPlanoSinReingreso.flujoDevolucionSinReingreso());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidaTextoFinal.validacionFinal(), Matchers.is(MENSAJE_ERROR_MUTACION)));
    }

    @Then("realizo el flujo de recibir el pago de la inscripcion de proponente")
    public void realizoElFlujoDeRecibirElPagoDeLaInscripcionDeProponente(){
        theActorInTheSpotlight().attemptsTo(FlujoRecibirPagoInscripcionProponente.FlujoPagoInscripcionProponente());
    }

    @Then("finalizo el flujo de Reingreso devolucion de plano sin reingreso")
    public void finalizoElFlujoDeReingresoDeDocumento(){
        theActorInTheSpotlight().attemptsTo(FinalizaFlujoReingresoDocumento.Finaliza());
    }

    @And("finalizo el flujo de procede el reingreso del documento")
    public void finalizoElFlujoDeProcedeElReingresoDelDocumento(){
        theActorInTheSpotlight().attemptsTo(FinalizoReingresoTramitesReformaProcedeReingresoDocumento.finaliza());
    }
}
