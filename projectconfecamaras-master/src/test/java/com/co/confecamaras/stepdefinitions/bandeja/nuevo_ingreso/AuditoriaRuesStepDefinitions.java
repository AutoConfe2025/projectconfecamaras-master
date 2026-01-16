package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;




import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.AuditoriaRuesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class AuditoriaRuesStepDefinitions {

    @Entonces("^realizara acciones de Auditoria RUES con la letra \"([^\"]*)\"$")
    public void realizaraaccionesDeAuditoriaRues(String letra) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AuditoriaRuesTask.estadisticasYextracciones(letra)
        );
    }

}
