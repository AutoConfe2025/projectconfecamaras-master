package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;




import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.RelaciondeUsuariosVerificadosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RelaciondeUsuariosVerificadosStepDefinitions {

    @Entonces("realizara acciones de Relacion de Usuarios Verificados")
    public void realizaraaccionesDeRelaciondeUsuariosVerificados() {
        OnStage.theActorInTheSpotlight().attemptsTo(RelaciondeUsuariosVerificadosTask.estadisticasYextracciones());
    }
}
