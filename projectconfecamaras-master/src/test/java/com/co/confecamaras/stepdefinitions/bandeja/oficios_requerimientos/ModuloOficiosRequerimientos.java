package com.co.confecamaras.stepdefinitions.bandeja.oficios_requerimientos;

import com.co.confecamaras.tasks.Bandeja.estudio_general.ValidaArchivar;
import com.co.confecamaras.tasks.Bandeja.oficios_requerimientos.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ModuloOficiosRequerimientos {

    @When("ingreso a la bandeja oficios requerimientos {string} {string}")
    public void ingresoALaBandejaOficiosRequerimientos(String codigoBarras, String estadoFinal) {
        theActorInTheSpotlight().attemptsTo(IngresoModuloOficios.ingresoModulo(codigoBarras, estadoFinal));
    }

    @Then("realizo la validacion de el boton rutas")
    public void realizoLaValidacionDelBotonRutas() {
        theActorInTheSpotlight().attemptsTo(ValidacionRutas.validaBotonRutas());
    }

    @Then("realizo la validacion de agregar un comentario")
    public void realizoLaValidacionDeAgregarUnComentario() {
        theActorInTheSpotlight().attemptsTo(ValidaIngresoComentario.ingresoComentario());
    }

    @Then("realizo el proceso de responder oficio")
    public void realizoElProcesoDeResponderOficio() {
        theActorInTheSpotlight().attemptsTo(ResponderOficio.respondeOficio());
    }

    @Then("realizo el proceso de archivar oficio requerimiento {string} {string}")
    public void realizoElProcesoDeArchivarOficioRequerimiento(String codigo_barras,String estado) {
        theActorInTheSpotlight().attemptsTo(ValidacionArchivar.archivarOficio(codigo_barras, estado));
    }

}
