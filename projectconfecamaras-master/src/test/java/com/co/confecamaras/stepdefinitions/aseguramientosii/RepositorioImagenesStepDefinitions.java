package com.co.confecamaras.stepdefinitions.aseguramientosii;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.aseguramientosii.EnlaceDescargaEs;
import com.co.confecamaras.questions.aseguramientosii.TablaImagenes;
import com.co.confecamaras.questions.consultasytransacciones.TablaFormatosEs;
import com.co.confecamaras.tasks.aseguramientosii.ConsultarRepositorio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class RepositorioImagenesStepDefinitions {

    @Dado("^(.*) requiere consultar o descargar una imagen")
    public void confecamarasRequiereConsultarODescargarUnaImagen(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }
    @Cuando("ingrese al repositorio de imagenes")
    public void ingreseAlRepositorioDeImagenes() {
        withCurrentActor(ConsultarRepositorio.imagenes());
    }
    @Entonces("podra visualizar los repositorios existentes")
    public void podraVisualizarLosRepositoriosExistentes() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaImagenes.esVsible()));
    }

}
