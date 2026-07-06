package com.co.confecamaras.stepdefinitions.certificados_automaticos;

import com.co.confecamaras.tasks.certificados_automaticos.ceritificado_automatico_matricula_publico.CertMatriculaPublico;
import com.co.confecamaras.tasks.certificados_automaticos.certificad_automatico_especiales.FlujoCertificadoEspeciales;
import com.co.confecamaras.tasks.certificados_automaticos.certificad_automatico_matricula.FlujoCertificadoAutomaticoMatriculaCaja;
import com.co.confecamaras.tasks.certificados_automaticos.certificad_automatico_matricula_libros.FlujoCertificadoAutomaticoMatriculaLibrosCaja;
import com.co.confecamaras.tasks.certificados_automaticos.certificad_automatico_existencia_proponente.FlujoCertificadoProponente;
import com.co.confecamaras.tasks.certificados_automaticos.certificad_automatico_proponente.FlujoCertificadoAutomaticoProponenteCaja;
import com.co.confecamaras.tasks.certificados_automaticos.certificado_automatico_esadl.FlujoCertificadoEsadl;
import com.co.confecamaras.tasks.certificados_automaticos.certificado_automatico_libros.FlujoCertificadoAutomaticoLibrosCaja;
import com.co.confecamaras.tasks.certificados_automaticos.certificado_existencia_caja.FlujoDePagoCertificado;
import com.co.confecamaras.tasks.certificados_automaticos.certificado_existencia_caja.FlujoPAgoCertificadoPublico;
import com.co.confecamaras.tasks.certificados_automaticos.certificado_existencia_caja.FlujoSolicitarCertficadoPublico;
import com.co.confecamaras.tasks.certificados_automaticos.certificado_existencia_caja.FlujoSolicitarCertificado;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoAutomaticoCajaStepDefintions {

    @When("realizo el flujo de certificado automatico {string}")
    public void realizoElFlujoDeCertificadoAutomatico(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoSolicitarCertificado.flujoCertificado(Expediente));
    }

    @When("realizo el flujo de certificado automatico publico {string}")
    public void realizoElFlujoDeCertificadoAutomaticoPublico(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoSolicitarCertficadoPublico.FlujoPublicoCertiicados(Expediente));
    }

    @When("realizo el flujo de certificado automatico existencia proponente {string}")
    public void realizoElFlujoDeCertificadoAutomaticoExistenciaProponente(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoCertificadoProponente.flujoCertificadoProponente(Expediente));
    }

    @When("realizo el flujo de certificado automatico esadl {string}")
    public void realizoElFlujoDeCertificadoAutomaticoEsadl(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoCertificadoEsadl.flujoEsadl(Expediente));
    }

    @When("realizo el flujo de certificado automatico libros {string}")
    public void realizoElFlujoDeCertificadoAutomaticoLibros(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoCertificadoAutomaticoLibrosCaja.CertiLibros(Expediente));
    }

    @When("realizo el flujo de certificado automatico matricula {string}")
    public void realizoElFlujoDeCertificadoAutomaticoMatricula(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoCertificadoAutomaticoMatriculaCaja.CertiMatricula(Expediente));
    }

    @When("realizo el flujo de certificado automatico matricula publico {string}")
    public void realizoElFlujoDeCertificadoAutomaticoMatriculaPublico(String Expediente){
        theActorInTheSpotlight().attemptsTo(CertMatriculaPublico.MatricAutoPublico(Expediente));
    }

    @When("realizo el flujo de certificado automatico matricula libros {string}")
    public void realizoElFlujoDeCertificadoAutomaticoMatriculaLibros(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoCertificadoAutomaticoMatriculaLibrosCaja.CertiMatriculaLibros(Expediente));
    }

    @When("realizo el flujo de certificado automatico proponente {string}")
    public void realizoElFlujoDeCertificadoAutomaticoProponente(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoCertificadoAutomaticoProponenteCaja.CertiProponente(Expediente));
    }

    @When("realizo el flujo de certificado automatico especiales {string}")
    public void realizoElFlujoDeCertificadoAutomaticoEspeciales(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoCertificadoEspeciales.certiEspeciales(Expediente));
    }

    @Then("realizo el proceso de pago del certificado")
    public void realizoElFlujoDeCertificadoAutomatico(){
        theActorInTheSpotlight().attemptsTo(FlujoDePagoCertificado.flujoPago());
    }

    @Then("realizo el proceso de pago del certificado publico")
    public void realizoElFlujoDeCertificadoAutomaticoPublico(){
        theActorInTheSpotlight().attemptsTo(FlujoPAgoCertificadoPublico.FlujoPagoPublicoCertificado());
    }
}
