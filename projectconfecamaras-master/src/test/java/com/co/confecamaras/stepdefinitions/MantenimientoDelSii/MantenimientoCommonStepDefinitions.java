package com.co.confecamaras.stepdefinitions.MantenimientoDelSii;

import com.co.confecamaras.tasks.MantenimientoDelSii.MantenimientoCommonTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class MantenimientoCommonStepDefinitions {
    @Entonces("validara la existencia de los titulos de cada seccion")
    public void validaraLaExistenciaDeLosTitulosDeCadaSeccion() {
        OnStage.theActorInTheSpotlight().attemptsTo(MantenimientoCommonTask.common());
    }
}
