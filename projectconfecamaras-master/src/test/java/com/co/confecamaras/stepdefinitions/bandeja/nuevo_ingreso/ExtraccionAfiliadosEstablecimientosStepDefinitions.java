package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;






import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ExtraccionAfiliadosEstablecimientosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ExtraccionAfiliadosEstablecimientosStepDefinitions {


    @Entonces("realizara acciones de Extraccion de Afiliados Establecimientos")
    public void realizaraaccionesDeExtraccionAfiliadosEstablecimientos() {
        OnStage.theActorInTheSpotlight().attemptsTo(ExtraccionAfiliadosEstablecimientosTask.EstadisticasyExtracciones());
    }
}
