package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.usuariocaja.ElTextoDelPDF;
import com.co.confecamaras.tasks.mantenimientoeinformes.ConsultarDetalladoGasto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.confecamaras.utils.mantenimientoeinformes.DetalladoGastoAdmConstants.TEXTO_PDF_DETALLADO_GASTO;
import static com.co.confecamaras.utils.usuarioCaja.UsuarioCajaConstants.TEXTO_PDF;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static org.hamcrest.CoreMatchers.containsString;

public class DetalladoGastosAdmStepDefinitions {

    @Dado("^(.*) requiere consultar Detallado Gastos Administrativos")
    public void confecamarasRequiereConsultarDetalladoGastosAdministrativos(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese las fechas y formato deseado")
    public void ingreseLasFechasYFormatoDeseado() {
        withCurrentActor(ConsultarDetalladoGasto.administrativo());
    }

    @Entonces("podra visualizar el enlace de descarga de gastos administrativos")
    public void podraVisualizarElEnlaceDeDescargaDeGastosAdministrativos() {
        OnStage.theActorInTheSpotlight().should(seeThat(ElTextoDelPDF.es(), containsString(TEXTO_PDF_DETALLADO_GASTO)));
    }

}
