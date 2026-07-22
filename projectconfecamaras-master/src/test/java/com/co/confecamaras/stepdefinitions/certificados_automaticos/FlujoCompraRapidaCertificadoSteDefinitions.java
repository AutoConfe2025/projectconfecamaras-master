package com.co.confecamaras.stepdefinitions.certificados_automaticos;

import com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificado_existencia.FlujoHastaPagoCompraRapida;
import com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificado_existencia_esadl.FlujoHastaPagoCompraRapidaExistenciaEsadl;
import com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificado_existencia_proponente.FlujoHastaPagoCompraRapidaExistenciaProponente;
import com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificado_libros.FlujoHastaPagoCompraRapidaLibros;
import com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificado_libros_matriculas.FlujoHastaPagoCompraRapidaLibrosMatriculas;
import com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificado_matricula.FlujoHastaPagoCompraRapidaMatricula;
import com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificado_proponente.FlujoHastaPagoCompraRapidaProponente;
import com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificados_especiales_no.FlujoCertificadosEspecialesNo;
import com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificados_especiales_si.FlujoCertificadosEspecialesSi;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoCompraRapidaCertificadoSteDefinitions {

    @When("realizo el flujo de compra rapida certificado existencia {string}")
    public void realizoElFlujoDeCompraRapidaCertificadoExistencia(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoHastaPagoCompraRapida.FlujoHastaCompra(Expediente));
    }

    @When("realizo el flujo de compra rapida certificado matricula {string}")
    public void realizoElFlujoDeCompraRapidaCertificadoMatricula(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoHastaPagoCompraRapidaMatricula.FlujoRapidoMAtricula(Expediente));
    }

    @When("realizo el flujo de compra rapida certificado libros {string}")
    public void realizoElFlujoDeCompraRapidaCertificadoLibros(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoHastaPagoCompraRapidaLibros.FlujoRapidoLibros(Expediente));
    }

    @When("realizo el flujo de compra rapida certificado proponente {string}")
    public void realizoElFlujoDeCompraRapidaCertificadoProponente(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoHastaPagoCompraRapidaProponente.flujoRapidoProponente(Expediente));
    }

    @When("realizo el flujo de compra rapida certificado libros matriculas {string}")
    public void realizoElFlujoDeCompraRapidaCertificadoLibrosMatriculas(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoHastaPagoCompraRapidaLibrosMatriculas.FlujoRapidoLibrosMatriculas(Expediente));
    }

    @When("realizo el flujo de compra rapida certificado existencia esadl {string}")
    public void realizoElFlujoDeCompraRapidaCertificadoExistenciaEsadl(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoHastaPagoCompraRapidaExistenciaEsadl.FlujoRapidoExistenciaEsadl(Expediente));
    }

    @When("realizo el flujo de compra rapida certificado existencia proponente {string}")
    public void realizoElFlujoDeCompraRapidaCertificadoExistenciaProponente(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoHastaPagoCompraRapidaExistenciaProponente.FlujoRapidaProponente(Expediente));
    }

    @When("realizo el flujo de compra rapida certificado especiales si {string}")
    public void realizoElFlujoDeCompraRapidaCertificadosEspecialesSI(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoCertificadosEspecialesSi.FlujoEspecialSI(Expediente));
    }

    @When("realizo el flujo de compra rapida certificado especiales no {string}")
    public void realizoElFlujoDeCompraRapidaCertificadosEspecialesNO(String Expediente){
        theActorInTheSpotlight().attemptsTo(FlujoCertificadosEspecialesNo.CertificadoEspecialNO(Expediente));
    }
}
