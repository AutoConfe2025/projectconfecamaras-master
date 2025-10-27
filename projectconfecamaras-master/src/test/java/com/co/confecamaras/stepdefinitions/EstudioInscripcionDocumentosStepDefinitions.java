package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class EstudioInscripcionDocumentosStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar el Estudio Inscripcion de Documentos Proponente - Inscripcion")
    public void confecamarasRequiereRealizarElEstudioInscripcionDeDocumentosProponenteInscripcion(String actor) {
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryEstudioInscripcionDocumentosProponentes.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros Publicos, Estudio RegPro")
    public void seleccioneModuloDeRegistroRegistrosPublicosEstudioRegPro() {}

    @Entonces("ingresara el codigo de barras proponente")
    public void ingresara_el_codigo_de_barras_proponente() {
        Excel excel = new Excel(Excel.rutaExcelDev, "DocumentosProponentes", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(DataEstudioInscripcionDocumentosProponentes.DoInscripcionProponente(datos.get("Consulta"), DataBase.getNumMatEstInsProp(),
                datos.get("Empresa"), datos.get("Numero Doc"), datos.get("Fecha Doc"), datos.get("Origen Doc"), datos.get("Autorizo"),
                datos.get("Fecha Corte"), datos.get("Activo Corriente"), datos.get("Patrimonio Neto"), datos.get("Ingresos Actividad"),
                datos.get("Grupo Nif"), datos.get("Numero Doc Dos"), datos.get("Fecha Doc Dos"), datos.get("Origen Doc Dos"),
                datos.get("Clasificaciones"), datos.get("Celebrado"), datos.get("Contratante"), datos.get("Fecha Ejecucion"),
                datos.get("Valor Pesos"), datos.get("Valor"), datos.get("Campo Texto"), datos.get("Numero Doc Tres"), datos.get("Fecha Doc Tres"),
                datos.get("Origen Doc Tres"), datos.get("Identificacion"), datos.get("Email")));
        withCurrentActor(DataEstudioInscripcionDocumentosProponentesDos.enConfecamaraSII(datos.get("Usuario")));
        withCurrentActor(DoInscripcionDocumentos.inscripcionDocumentos());
    }
}