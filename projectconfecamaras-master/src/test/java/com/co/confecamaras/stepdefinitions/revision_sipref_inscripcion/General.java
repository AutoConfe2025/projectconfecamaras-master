package com.co.confecamaras.stepdefinitions.revision_sipref_inscripcion;

import com.co.confecamaras.tasks.revision_sipref_inscripciones.IngresaFecha;
import com.co.confecamaras.tasks.revision_sipref_inscripciones.MarcarRevisado;
import com.co.confecamaras.tasks.revision_sipref_inscripciones.ValidaNotificar;
import io.cucumber.java.en.And;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class General {

    @And("ingreso la fecha de la busqueda {string}")
    public void ingresoLaFechaDeLaBusqueda(String fecha) {
        theActorInTheSpotlight().attemptsTo(IngresaFecha.ingresarFecha(fecha));
    }

    @And("realizo el proceso de notificar")
    public void realizoElProcesoDeNotificar() {
        theActorInTheSpotlight().attemptsTo(ValidaNotificar.notificarButton());
    }

    @And("marco como revisado")
    public void marcoComoRevisado() {
        theActorInTheSpotlight().attemptsTo(MarcarRevisado.MarcaRevisado());
    }
}
