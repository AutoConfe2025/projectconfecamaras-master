package com.co.confecamaras.stepdefinitions.bandeja.recursos_reposicion;

import com.co.confecamaras.tasks.Bandeja.recursos_reposicion.IngresoBandeja;
import com.co.confecamaras.tasks.Bandeja.recursos_reposicion.ResponderRecurso;
import com.co.confecamaras.tasks.Bandeja.recursos_reposicion.ValidarArchivar;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IngresoBandejaStepDefinitions {

    @When("ingreso a la bandeja recursos {string} {string}")
    public void ingresoALaBandejaOficiosRequerimientos(String codigoBarras, String estadoFinal) {
        theActorInTheSpotlight().attemptsTo(IngresoBandeja.ingresoRecursos(codigoBarras, estadoFinal));
    }

    @Entonces("realizo el proceso de responder recurso")
    public void realizoElProcesoDeEstudio() {
        theActorInTheSpotlight().attemptsTo(ResponderRecurso.Responde());
    }

    @Entonces("se realiza el proceso para archivar el tramite {string} {string}")
    public void realizoElProcesoParaArchivarElTramite(String codigo_barras, String estado) {
        theActorInTheSpotlight().attemptsTo(ValidarArchivar.archivarRecursos(codigo_barras, estado));
    }
}
