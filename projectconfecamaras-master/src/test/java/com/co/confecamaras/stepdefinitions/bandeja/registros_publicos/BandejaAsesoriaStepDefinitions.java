package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.BandejaAsesoriasTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class BandejaAsesoriaStepDefinitions {
    @Entonces("^validara las acciones de asesorias relacionados al id (.+)$")
    public void validaraLasAccionesDeAsesoriasRelacionadosAlId(String id) {
        OnStage.theActorInTheSpotlight().attemptsTo(BandejaAsesoriasTask.asesorias(id));
    }
}
