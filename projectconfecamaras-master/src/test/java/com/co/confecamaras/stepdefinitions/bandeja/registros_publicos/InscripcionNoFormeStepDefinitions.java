package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.InscripcionNoFirmeTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerXMLTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InscripcionNoFormeStepDefinitions {

    @Entonces("^validara las acciones de inscripcon no firme con el registro (.+)$")
    public void validaraLasAccionesDeInscripconNoFirmeConElRegistro(String proponente) {
        theActorInTheSpotlight().attemptsTo(InscripcionNoFirmeTask.consultar(proponente));
    }

}
