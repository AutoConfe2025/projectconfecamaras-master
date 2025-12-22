package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;






import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.GeneraClavePrepagoTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class GeneraClavePrepagoStepDefinitions {


    @Entonces("realizara acciones de Genera clave prepago")
    public void realizaraaccionesDeDeGeneraClavePrepago() {
        OnStage.theActorInTheSpotlight().attemptsTo(GeneraClavePrepagoTask.Gestiondecaja());
    }
}
