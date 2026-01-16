package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;




import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ResumenActosInscritosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ResumenActosInscritosStepDefinitions {

    @Entonces("realizara acciones de Resumen actos inscritos")
    public void realizaraaccionesDeResumenActosInscritos() {
        OnStage.theActorInTheSpotlight().attemptsTo(ResumenActosInscritosTask.estadisticasYextracciones());
    }
}
