package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.questions.devdos.RutaDocumentosQuestion;
import com.co.confecamaras.questions.devdos.SoporteTramitesQuestion;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoRutaDocumentos;


import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RutaDocumentosStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere consultar la ruta de documentos")
    public void confecamaras_requiere_consultar_la_ruta_de_documentos(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Consultas y Transacciones, Consultas Registros Publicos, Ruta de Documentos")
    public void seleccione_consultas_y_transacciones_consultas_registros_publicos_ruta_de_documentos() {}

    @Entonces("podra consultar la Ruta de Documentos por los siguientes criterios")
    public void podra_consultar_la_ruta_de_documentos_por_los_siguientes_criterios(){
        Excel excel = new Excel(Excel.rutaExcelDev, "RutaDocumentos", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoRutaDocumentos.rutaDocumentos(datos.get("Codigo Barras"), datos.get("Operacion"), datos.get("Recibo"), datos.get("Nombre"),
                        datos.get("Identificacion"), datos.get("Matricula"), datos.get("Fecha Inicio"), datos.get("Fecha Final"))
        );
    }
}