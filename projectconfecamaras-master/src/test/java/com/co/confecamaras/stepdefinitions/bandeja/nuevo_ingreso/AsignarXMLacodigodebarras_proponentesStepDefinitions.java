package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;




import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.AsignarXMLaCodigoDeBarrasProponentesTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class AsignarXMLacodigodebarras_proponentesStepDefinitions {


    @Entonces("realizara acciones de Asignar XML acodigo de barras_proponentes")
    public void realizaraaccionesDeAsignarXMLacodigodebarras_proponentes() {
        OnStage.theActorInTheSpotlight().attemptsTo(AsignarXMLaCodigoDeBarrasProponentesTask.Abogados());   }
}
