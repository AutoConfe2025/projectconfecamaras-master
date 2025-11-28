package com.co.confecamaras.stepdefinitions.bandeja.control_calidad;

import com.co.confecamaras.tasks.Bandeja.control_calidad.MultiplePDF;
import io.cucumber.java.en.And;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class multiplePDFStepDefinition {

    @And("valido el proceso de descarga multi PDF")
    public void validoElProcesoDeDescargaMultiPdf() {
        theActorInTheSpotlight().attemptsTo(MultiplePDF.multiple());
    }
}
