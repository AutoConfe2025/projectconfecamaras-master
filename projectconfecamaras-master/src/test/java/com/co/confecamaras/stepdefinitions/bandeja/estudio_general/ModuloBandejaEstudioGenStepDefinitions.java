package com.co.confecamaras.stepdefinitions.bandeja.estudio_general;

import com.co.confecamaras.tasks.Bandeja.TramitesNoArchivadosT;
import com.co.confecamaras.tasks.Bandeja.estudio_general.*;
import com.co.confecamaras.tasks.Bandeja.general.IngresoRuta;
import com.co.confecamaras.tasks.Bandeja.recursos_reposicion.ValidarArchivar;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ModuloBandejaEstudioGenStepDefinitions {

    @When("ingreso al modulo de validacion de bandeja {string} {string}")
    public void ingresoAlModuloDeValidacionDeBandeja(String codigo_barras, String estado) {
        theActorInTheSpotlight().attemptsTo(IngresoModulo.ingresoAlModulo(codigo_barras, estado));
    }

    @Then("valido el proceso de descarga del PDF")
    public void validoElProcesoDeDescargaDelPdf() {
        theActorInTheSpotlight().attemptsTo(IngresoRuta.procesoRuta());
    }

    @Entonces("valido los comentarios de la bandeja")
    public void validoLosComentariosDeLaBandeja() {
        theActorInTheSpotlight().attemptsTo(ValidacionComentarios.validaComentarios());
    }

    @Entonces("valido los comentarios de la bandeja tramites")
    public void validoLosComentariosDeLaBandejaTramites() {
        theActorInTheSpotlight().attemptsTo(TramitesNoArchivadosT.noArchivados());
    }

    @Entonces("ingreso un nuevo comentario")
    public void ingresoUnNuevoComentario() {
        theActorInTheSpotlight().attemptsTo(ValidarIngresoNuevoComentario.validaMensaje());
    }

    @Entonces("realizo el proceso de estudio {string}")
    public void realizoElProcesoDeEstudio(String codigo_barras) {
        theActorInTheSpotlight().attemptsTo(ValidarModuloEstudio.ValidoEstudio(codigo_barras));
    }

    @Entonces("realizo el proceso para archivar el tramite {string} {string}")
    public void realizoElProcesoParaArchivarElTramite(String codigo_barras, String estado) {
        theActorInTheSpotlight().attemptsTo(ValidaArchivarEstudio.archivarProceso(codigo_barras, estado));
    }
}
