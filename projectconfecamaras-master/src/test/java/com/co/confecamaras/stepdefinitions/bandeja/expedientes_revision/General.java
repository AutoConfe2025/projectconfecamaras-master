package com.co.confecamaras.stepdefinitions.bandeja.expedientes_revision;

import com.co.confecamaras.tasks.Bandeja.general.BusquedaSoloBandeja;
import com.co.confecamaras.tasks.Bandeja.general.IngresarCodioBarras;
import com.co.confecamaras.tasks.Bandeja.general.IngresoCertificadoAntiguo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.es.Entonces;
import org.python.antlr.ast.Str;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class General {

    @Entonces("ingreso solo bandeja {string}")
    public void ingresoSoloBandeja(String bandeja){
        theActorInTheSpotlight().attemptsTo(BusquedaSoloBandeja.SoloBandeja(bandeja));
    }

    @Then("ingreso el codigo de barras {string}")
    public void ingresoElCodigoDeBarras(String codigo) {
        theActorInTheSpotlight().attemptsTo(IngresarCodioBarras.IngresaCodigo(codigo));
    }

    @And("valido el certificado antiguo formato")
    public void validoElCertificadoAntiguoFormato() {
        theActorInTheSpotlight().attemptsTo(IngresoCertificadoAntiguo.CertificadoAntiguo());
    }

    @And("valido el certificado nuevo formato")
    public void validoElCertificadoNuevoFormato() {
        theActorInTheSpotlight().attemptsTo(IngresoCertificadoAntiguo.CertificadoAntiguo());
    }
}
