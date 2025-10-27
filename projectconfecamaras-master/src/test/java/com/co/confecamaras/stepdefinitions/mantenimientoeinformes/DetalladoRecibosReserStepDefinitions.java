package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.usuariocaja.ElTextoDelPDF;
import com.co.confecamaras.tasks.mantenimientoeinformes.ConsultarDetalladoRecibos;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.confecamaras.utils.mantenimientoeinformes.DetalladoGastoAdmConstants.TEXTO_PDF_DETALLADO_GASTO;
import static com.co.confecamaras.utils.mantenimientoeinformes.DetalladoRecibosReversadoConstants.TEXTO_PDF_DETALLADO_REVERSADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static org.hamcrest.CoreMatchers.containsString;

public class DetalladoRecibosReserStepDefinitions {

    @Dado("^(.*) requiere consultar Detallado Recibos Reversados")
    public void confecamarasRequiereConsultarDetalladoRecibosReversados(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }

    @Cuando("ingrese las fechas operador y formato")
    public void ingreseLasFechasOperadorYFormato() {
        withCurrentActor(ConsultarDetalladoRecibos.reversados());
    }

    @Entonces("podra visualizar el enlace de descarga de recibos reservados")
    public void podraVisualizarElEnlaceDeDescargaDeRecibosReservados() {
        OnStage.theActorInTheSpotlight().should(seeThat(ElTextoDelPDF.es(), containsString(TEXTO_PDF_DETALLADO_REVERSADO)));

    }

}
