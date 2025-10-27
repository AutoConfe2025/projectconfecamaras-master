package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.usuariocaja.ElTextoDelPDF;
import com.co.confecamaras.tasks.mantenimientoeinformes.ConsultarResumidoDeImpuesto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.confecamaras.utils.mantenimientoeinformes.ResumidoDeImpuestosRegistroConstans.TEZT_PDF_RESUMEN_IMPUESTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static org.hamcrest.CoreMatchers.containsString;

public class ResumiidoDeImpuestosStepDefinitions {

    @Dado("^(.*) requiere consultar Resumido de Impuesto de Registro")
    public void confecamarasRequiereConsultarResumidoDeImpuestoDeRegistro(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }


    @Cuando("ingrese las fechas para generar el reporte resumido")
    public void ingreseLasFechasParaGenerarElReporteResumido() {
        withCurrentActor(ConsultarResumidoDeImpuesto.deRegistro());
    }

    @Entonces("podra visualizar el enlace de descarga de resumido")
    public void podraVisualizarElEnlaceDeDescargaDeResumido() {
        OnStage.theActorInTheSpotlight().should(seeThat(ElTextoDelPDF.es(), containsString(TEZT_PDF_RESUMEN_IMPUESTO)));

    }

}
