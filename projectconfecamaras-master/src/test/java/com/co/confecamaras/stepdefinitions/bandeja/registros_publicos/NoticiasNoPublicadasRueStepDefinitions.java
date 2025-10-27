package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.NoticiasNoPublicadasRueTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.FinalizarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.PublicarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerJsonTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerXMLTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class NoticiasNoPublicadasRueStepDefinitions {

    @Entonces("^buscara el registro (.+) para validar las acciones de Noticias RUE$")
    public void buscaraElRegistroRP01ParaValidarLasAcciones(String dato) {
        OnStage.theActorInTheSpotlight().attemptsTo(NoticiasNoPublicadasRueTask.noticias(dato));
    }
}
