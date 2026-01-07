package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;


import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionGeneralTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;


public class DigitacionRegEsadlStepDefinitions {


    @Entonces("^validara las acciones de Digitacion General con codigo de barras \"([^\"]*)\" \"([^\"]*)\"$")
    public void validaraLasAccionesDeDigitacionGeneralConCodigoDeBarras(String codigo_barras, String estado) {
        OnStage.theActorInTheSpotlight().attemptsTo(DigitacionGeneralTask.digitar(codigo_barras, estado));
    }
}
