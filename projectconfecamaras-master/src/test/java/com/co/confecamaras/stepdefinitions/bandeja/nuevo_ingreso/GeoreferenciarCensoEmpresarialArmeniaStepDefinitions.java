package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;







import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.GeoreferenciarCensoEmpresarialArmeniaTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class GeoreferenciarCensoEmpresarialArmeniaStepDefinitions {


    @Entonces("realizara acciones de Georeferenciar Censo Empresarial Armenia")
    public void realizaraaccionesDeGeoreferenciarCensoEmpresarialArmenia() {
        OnStage.theActorInTheSpotlight().attemptsTo(GeoreferenciarCensoEmpresarialArmeniaTask.ConsultaInterna());
    }
}
